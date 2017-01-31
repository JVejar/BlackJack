package com.example.student.myapplication;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
Button but;
    Card[] card;
    int z = 0;
    View rootView;
    TextView tv;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_main, container,
                false);
        tv = (TextView) rootView.findViewById(R.id.textView);
        tv.setTextColor(Color.GREEN);
        rootView.setBackgroundColor(Color.BLACK);

        card = new Card[52];

        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                card[z] = new Card(suit,rank);
                z++;
            }
        }
        card = shuffleDeck(card);
        GetterSetter.card = card;
        return rootView;
    }

    //shuffles the card deck, returns the card array
    public Card[] shuffleDeck(Card[] deck){
        Random rand = new Random();
        Card tempCard = new Card(0,0);
        for(int shuffleCount = 0; shuffleCount < 52; shuffleCount++){
            int randomCard = rand.nextInt(52);
            tempCard = deck[randomCard];
            deck[randomCard] = deck[shuffleCount];
            deck[shuffleCount] = tempCard;
        }
        return deck;
    }

}
