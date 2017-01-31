package com.example.student.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by student on 12/8/15.
 */
public class Panel extends SurfaceView implements SurfaceHolder.Callback{
    //GLOBAL VARIABLES
    Paint paint;
    private CanvasThread canvasthread;
    //Variable used to hold our bitmap
    Bitmap twoclubs;
    Bitmap threeclubs;
    Bitmap fourclubs;
    Bitmap fiveclubs;
    Bitmap sixclubs;
    Bitmap sevenclubs;
    Bitmap eightclubs;
    Bitmap nineclubs;
    Bitmap tenclubs;
    Bitmap jackclubs;
    Bitmap queenclubs;
    Bitmap kingclubs;
    Bitmap aceclubs;

    Bitmap twodiamonds;
    Bitmap threediamonds;
    Bitmap fourdiamonds;
    Bitmap fivediamonds;
    Bitmap sixdiamonds;
    Bitmap sevendiamonds;
    Bitmap eightdiamonds;
    Bitmap ninediamonds;
    Bitmap tendiamonds;
    Bitmap jackdiamonds;
    Bitmap queendiamonds;
    Bitmap kingdiamonds;
    Bitmap acediamonds;

    Bitmap twohearts;
    Bitmap threehearts;
    Bitmap fourhearts;
    Bitmap fivehearts;
    Bitmap sixhearts;
    Bitmap sevenhearts;
    Bitmap eighthearts;
    Bitmap ninehearts;
    Bitmap tenhearts;
    Bitmap jackhearts;
    Bitmap queenhearts;
    Bitmap kinghearts;
    Bitmap acehearts;

    Bitmap twospades;
    Bitmap threespades;
    Bitmap fourspades;
    Bitmap fivespades;
    Bitmap sixspades;
    Bitmap sevenspades;
    Bitmap eightspades;
    Bitmap ninespades;
    Bitmap tenspades;
    Bitmap jackspades;
    Bitmap queenspades;
    Bitmap kingspades;
    Bitmap acespades;

    //Constructor
    public Panel(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub

        getHolder().addCallback(this);
        canvasthread = new CanvasThread(getHolder(), this);
        setFocusable(true);
        paint = new Paint();
        twoclubs = BitmapFactory.decodeResource(getResources(), R.drawable.twoclubs);
        twoclubs = Bitmap.createScaledBitmap(twoclubs, twoclubs.getWidth()/3, twoclubs.getWidth()/3, false);

        threeclubs = BitmapFactory.decodeResource(getResources(), R.drawable.threeclubs);
        threeclubs = Bitmap.createScaledBitmap(threeclubs, threeclubs.getWidth()/3, threeclubs.getWidth()/3, false);

        fourclubs = BitmapFactory.decodeResource(getResources(), R.drawable.fourclubs);
        fourclubs = Bitmap.createScaledBitmap(fourclubs, fourclubs.getWidth()/3, fourclubs.getWidth()/3, false);

        fiveclubs = BitmapFactory.decodeResource(getResources(), R.drawable.fiveclubs);
        fiveclubs = Bitmap.createScaledBitmap(fiveclubs, fiveclubs.getWidth()/3, fiveclubs.getWidth()/3, false);

        sixclubs = BitmapFactory.decodeResource(getResources(), R.drawable.sixclubs);
        sixclubs = Bitmap.createScaledBitmap(sixclubs, sixclubs.getWidth()/3, sixclubs.getWidth()/3, false);

        sevenclubs = BitmapFactory.decodeResource(getResources(), R.drawable.sevenclubs);
        sevenclubs = Bitmap.createScaledBitmap(sevenclubs, sevenclubs.getWidth()/3, sevenclubs.getWidth()/3, false);

        eightclubs = BitmapFactory.decodeResource(getResources(), R.drawable.eightclubs);
        eightclubs = Bitmap.createScaledBitmap(eightclubs, eightclubs.getWidth()/3, eightclubs.getWidth()/3, false);

        nineclubs = BitmapFactory.decodeResource(getResources(), R.drawable.nineclubs);
        nineclubs = Bitmap.createScaledBitmap(nineclubs, nineclubs.getWidth()/3, nineclubs.getWidth()/3, false);

        tenclubs = BitmapFactory.decodeResource(getResources(), R.drawable.tenclubs);
        tenclubs = Bitmap.createScaledBitmap(tenclubs, tenclubs.getWidth()/3, tenclubs.getWidth()/3, false);

        jackclubs = BitmapFactory.decodeResource(getResources(), R.drawable.jackclubs);
        jackclubs = Bitmap.createScaledBitmap(jackclubs, jackclubs.getWidth()/3, jackclubs.getWidth()/3, false);

        queenclubs = BitmapFactory.decodeResource(getResources(), R.drawable.queenclubs);
        queenclubs = Bitmap.createScaledBitmap(queenclubs, queenclubs.getWidth()/3, queenclubs.getWidth()/3, false);

        kingclubs = BitmapFactory.decodeResource(getResources(), R.drawable.kingclubs);
        kingclubs = Bitmap.createScaledBitmap(kingclubs, kingclubs.getWidth()/3, kingclubs.getWidth()/3, false);

        aceclubs = BitmapFactory.decodeResource(getResources(), R.drawable.aceclubs);
        aceclubs = Bitmap.createScaledBitmap(aceclubs, aceclubs.getWidth()/3, aceclubs.getWidth()/3, false);


        twodiamonds = BitmapFactory.decodeResource(getResources(), R.drawable.twodiamonds);
        twodiamonds = Bitmap.createScaledBitmap(twodiamonds, twodiamonds.getWidth()/3, twodiamonds.getWidth()/3, false);

        threediamonds = BitmapFactory.decodeResource(getResources(), R.drawable.threediamonds);
        threediamonds = Bitmap.createScaledBitmap(threediamonds, threediamonds.getWidth()/3, threediamonds.getWidth()/3, false);

        fourdiamonds = BitmapFactory.decodeResource(getResources(), R.drawable.fourdiamonds);
        fourdiamonds = Bitmap.createScaledBitmap(fourdiamonds, fourdiamonds.getWidth()/3, fourdiamonds.getWidth()/3, false);

        fivediamonds = BitmapFactory.decodeResource(getResources(), R.drawable.fivediamonds);
        fivediamonds = Bitmap.createScaledBitmap(fivediamonds, fivediamonds.getWidth()/3, fivediamonds.getWidth()/3, false);

        sixdiamonds = BitmapFactory.decodeResource(getResources(), R.drawable.sixdiamonds);
        sixdiamonds = Bitmap.createScaledBitmap(sixdiamonds, sixdiamonds.getWidth()/3, sixdiamonds.getWidth()/3, false);

        sevendiamonds = BitmapFactory.decodeResource(getResources(), R.drawable.sevendiamonds);
        sevendiamonds = Bitmap.createScaledBitmap(sevendiamonds, sevendiamonds.getWidth()/3, sevendiamonds.getWidth()/3, false);

        eightdiamonds = BitmapFactory.decodeResource(getResources(), R.drawable.eightdiamonds);
        eightdiamonds = Bitmap.createScaledBitmap(eightdiamonds, eightdiamonds.getWidth()/3, eightdiamonds.getWidth()/3, false);

        ninediamonds = BitmapFactory.decodeResource(getResources(), R.drawable.ninediamonds);
        ninediamonds = Bitmap.createScaledBitmap(ninediamonds, ninediamonds.getWidth()/3, ninediamonds.getWidth()/3, false);

        tendiamonds = BitmapFactory.decodeResource(getResources(), R.drawable.tendiamonds);
        tendiamonds = Bitmap.createScaledBitmap(tendiamonds, tendiamonds.getWidth()/3, tendiamonds.getWidth()/3, false);

        jackdiamonds = BitmapFactory.decodeResource(getResources(), R.drawable.jackdiamonds);
        jackdiamonds = Bitmap.createScaledBitmap(jackdiamonds, jackdiamonds.getWidth()/3, jackdiamonds.getWidth()/3, false);

        queendiamonds = BitmapFactory.decodeResource(getResources(), R.drawable.queendiamonds);
        queendiamonds = Bitmap.createScaledBitmap(queendiamonds, queendiamonds.getWidth()/3, queendiamonds.getWidth()/3, false);

        kingdiamonds = BitmapFactory.decodeResource(getResources(), R.drawable.kingdiamonds);
        kingdiamonds = Bitmap.createScaledBitmap(kingdiamonds, kingdiamonds.getWidth()/3, kingdiamonds.getWidth()/3, false);

        acediamonds = BitmapFactory.decodeResource(getResources(), R.drawable.acediamonds);
        acediamonds = Bitmap.createScaledBitmap(acediamonds, acediamonds.getWidth()/3, acediamonds.getWidth()/3, false);


        twohearts = BitmapFactory.decodeResource(getResources(), R.drawable.twohearts);
        twohearts = Bitmap.createScaledBitmap(twohearts, twohearts.getWidth()/3, twohearts.getWidth()/3, false);

        threehearts = BitmapFactory.decodeResource(getResources(), R.drawable.threehearts);
        threehearts = Bitmap.createScaledBitmap(threehearts, threehearts.getWidth()/3, threehearts.getWidth()/3, false);

        fourhearts = BitmapFactory.decodeResource(getResources(), R.drawable.fourhearts);
        fourhearts = Bitmap.createScaledBitmap(fourhearts, fourhearts.getWidth()/3, fourhearts.getWidth()/3, false);

        fivehearts = BitmapFactory.decodeResource(getResources(), R.drawable.fivehearts);
        fivehearts = Bitmap.createScaledBitmap(fivehearts, fivehearts.getWidth()/3, fivehearts.getWidth()/3, false);

        sixhearts = BitmapFactory.decodeResource(getResources(), R.drawable.sixhearts);
        sixhearts = Bitmap.createScaledBitmap(sixhearts, sixhearts.getWidth()/3, sixhearts.getWidth()/3, false);

        sevenhearts = BitmapFactory.decodeResource(getResources(), R.drawable.sevenhearts);
        sevenhearts = Bitmap.createScaledBitmap(sevenhearts, sevenhearts.getWidth()/3, sevenhearts.getWidth()/3, false);

        eighthearts = BitmapFactory.decodeResource(getResources(), R.drawable.eighthearts);
        eighthearts = Bitmap.createScaledBitmap(eighthearts, eighthearts.getWidth()/3, eighthearts.getWidth()/3, false);

        ninehearts = BitmapFactory.decodeResource(getResources(), R.drawable.ninehearts);
        ninehearts = Bitmap.createScaledBitmap(ninehearts, ninehearts.getWidth()/3, ninehearts.getWidth()/3, false);

        tenhearts = BitmapFactory.decodeResource(getResources(), R.drawable.tenhearts);
        tenhearts = Bitmap.createScaledBitmap(tenhearts, tenhearts.getWidth()/3, tenhearts.getWidth()/3, false);

        jackhearts = BitmapFactory.decodeResource(getResources(), R.drawable.jackhearts);
        jackhearts = Bitmap.createScaledBitmap(jackhearts, jackhearts.getWidth()/3, jackhearts.getWidth()/3, false);

        queenhearts = BitmapFactory.decodeResource(getResources(), R.drawable.queenhearts);
        queenhearts = Bitmap.createScaledBitmap(queenhearts, queenhearts.getWidth()/3, queenhearts.getWidth()/3, false);

        kinghearts = BitmapFactory.decodeResource(getResources(), R.drawable.kinghearts2);
        kinghearts = Bitmap.createScaledBitmap(kinghearts, kinghearts.getWidth()/3, kinghearts.getWidth()/3, false);

        acehearts = BitmapFactory.decodeResource(getResources(), R.drawable.acehearts);
        acehearts = Bitmap.createScaledBitmap(acehearts, acehearts.getWidth()/3, acehearts.getWidth()/3, false);


        twospades = BitmapFactory.decodeResource(getResources(), R.drawable.twospades);
        twospades = Bitmap.createScaledBitmap(twospades, twospades.getWidth()/3, twospades.getWidth()/3, false);

        threespades = BitmapFactory.decodeResource(getResources(), R.drawable.threespades);
        threespades = Bitmap.createScaledBitmap(threespades, threespades.getWidth()/3, threespades.getWidth()/3, false);

        fourspades = BitmapFactory.decodeResource(getResources(), R.drawable.fourspades);
        fourspades = Bitmap.createScaledBitmap(fourspades, fourspades.getWidth()/3, fourspades.getWidth()/3, false);

        fivespades = BitmapFactory.decodeResource(getResources(), R.drawable.fivespades);
        fivespades = Bitmap.createScaledBitmap(fivespades, fivespades.getWidth()/3, fivespades.getWidth()/3, false);

        sixspades = BitmapFactory.decodeResource(getResources(), R.drawable.sixspades);
        sixspades = Bitmap.createScaledBitmap(sixspades, sixspades.getWidth()/3, sixspades.getWidth()/3, false);

        sevenspades = BitmapFactory.decodeResource(getResources(), R.drawable.sevenspades);
        sevenspades = Bitmap.createScaledBitmap(sevenspades, sevenspades.getWidth()/3, sevenspades.getWidth()/3, false);

        eightspades = BitmapFactory.decodeResource(getResources(), R.drawable.eightspades);
        eightspades = Bitmap.createScaledBitmap(eightspades, eightspades.getWidth()/3, eightspades.getWidth()/3, false);

        ninespades = BitmapFactory.decodeResource(getResources(), R.drawable.ninespades);
        ninespades = Bitmap.createScaledBitmap(ninespades, ninespades.getWidth()/3, ninespades.getWidth()/3, false);

        tenspades = BitmapFactory.decodeResource(getResources(), R.drawable.tenspades);
        tenspades = Bitmap.createScaledBitmap(tenspades, tenspades.getWidth()/3, tenspades.getWidth()/3, false);

        jackspades = BitmapFactory.decodeResource(getResources(), R.drawable.jackspades);
        jackspades = Bitmap.createScaledBitmap(jackspades, jackspades.getWidth()/3, jackspades.getWidth()/3, false);

        queenspades = BitmapFactory.decodeResource(getResources(), R.drawable.queenspades);
        queenspades = Bitmap.createScaledBitmap(queenspades, queenspades.getWidth()/3, queenspades.getWidth()/3, false);

        kingspades = BitmapFactory.decodeResource(getResources(), R.drawable.kingspades);
        kingspades = Bitmap.createScaledBitmap(kingspades, kingspades.getWidth()/3, kingspades.getWidth()/3, false);

        acespades = BitmapFactory.decodeResource(getResources(), R.drawable.acespades);
        acespades = Bitmap.createScaledBitmap(acespades, acespades.getWidth()/3, acespades.getWidth()/3, false);


    }




    public Panel(Context context) {
        super(context);
        getHolder().addCallback(this);
        canvasthread = new CanvasThread(getHolder(), this);
        setFocusable(true);

    }


    @Override
    public void onDraw(Canvas canvas) {
     if(GetterSetter.card[GetterSetter.currentCard].suit == 0) {
         if (GetterSetter.card[GetterSetter.currentCard].rank == 0) {
             canvas.drawBitmap(twoclubs, 0.0f, 0.0f, null);
         }
         if (GetterSetter.card[GetterSetter.currentCard].rank == 1) {
             canvas.drawBitmap(threeclubs, 0.0f, 0.0f, null);
         }
         if (GetterSetter.card[GetterSetter.currentCard].rank == 2) {
             canvas.drawBitmap(fourclubs, 0.0f, 0.0f, null);
         }
         if (GetterSetter.card[GetterSetter.currentCard].rank == 3) {
             canvas.drawBitmap(fiveclubs, 0.0f, 0.0f, null);
         }
         if (GetterSetter.card[GetterSetter.currentCard].rank == 4) {
             canvas.drawBitmap(sixclubs, 0.0f, 0.0f, null);
         }
         if (GetterSetter.card[GetterSetter.currentCard].rank == 5) {
             canvas.drawBitmap(sevenclubs, 0.0f, 0.0f, null);
         }
         if (GetterSetter.card[GetterSetter.currentCard].rank == 6) {
             canvas.drawBitmap(eightclubs, 0.0f, 0.0f, null);
         }
         if (GetterSetter.card[GetterSetter.currentCard].rank == 7) {
             canvas.drawBitmap(nineclubs, 0.0f, 0.0f, null);
         }
         if (GetterSetter.card[GetterSetter.currentCard].rank == 8) {
             canvas.drawBitmap(tenclubs, 0.0f, 0.0f, null);
         }
         if (GetterSetter.card[GetterSetter.currentCard].rank == 9) {
             canvas.drawBitmap(jackclubs, 0.0f, 0.0f, null);
         }
         if (GetterSetter.card[GetterSetter.currentCard].rank == 10) {
             canvas.drawBitmap(queenclubs, 0.0f, 0.0f, null);
         }
         if (GetterSetter.card[GetterSetter.currentCard].rank == 11) {
             canvas.drawBitmap(kingclubs, 0.0f, 0.0f, null);
         }
         if (GetterSetter.card[GetterSetter.currentCard].rank == 12) {
             canvas.drawBitmap(aceclubs, 0.0f, 0.0f, null);
         }
     }
        if(GetterSetter.card[GetterSetter.currentCard].suit == 1) {
            if (GetterSetter.card[GetterSetter.currentCard].rank == 0) {
                canvas.drawBitmap(twodiamonds, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 1) {
                canvas.drawBitmap(threediamonds, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 2) {
                canvas.drawBitmap(fourdiamonds, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 3) {
                canvas.drawBitmap(fivediamonds, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 4) {
                canvas.drawBitmap(sixdiamonds, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 5) {
                canvas.drawBitmap(sevendiamonds, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 6) {
                canvas.drawBitmap(eightdiamonds, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 7) {
                canvas.drawBitmap(ninediamonds, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 8) {
                canvas.drawBitmap(tendiamonds, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 9) {
                canvas.drawBitmap(jackdiamonds, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 10) {
                canvas.drawBitmap(queendiamonds, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 11) {
                canvas.drawBitmap(kingdiamonds, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 12) {
                canvas.drawBitmap(acediamonds, 0.0f, 0.0f, null);
            }
        }

        if(GetterSetter.card[GetterSetter.currentCard].suit == 2) {
            if (GetterSetter.card[GetterSetter.currentCard].rank == 0) {
                canvas.drawBitmap(twohearts, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 1) {
                canvas.drawBitmap(threehearts, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 2) {
                canvas.drawBitmap(fourhearts, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 3) {
                canvas.drawBitmap(fivehearts, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 4) {
                canvas.drawBitmap(sixhearts, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 5) {
                canvas.drawBitmap(sevenhearts, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 6) {
                canvas.drawBitmap(eighthearts, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 7) {
                canvas.drawBitmap(ninehearts, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 8) {
                canvas.drawBitmap(tenhearts, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 9) {
                canvas.drawBitmap(jackhearts, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 10) {
                canvas.drawBitmap(queenhearts, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 11) {
                canvas.drawBitmap(kinghearts, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 12) {
                canvas.drawBitmap(acehearts, 0.0f, 0.0f, null);
            }
        }
        if(GetterSetter.card[GetterSetter.currentCard].suit == 3) {
            if (GetterSetter.card[GetterSetter.currentCard].rank == 0) {
                canvas.drawBitmap(twospades, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 1) {
                canvas.drawBitmap(threespades, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 2) {
                canvas.drawBitmap(fourspades, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 3) {
                canvas.drawBitmap(fivespades, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 4) {
                canvas.drawBitmap(sixspades, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 5) {
                canvas.drawBitmap(sevenspades, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 6) {
                canvas.drawBitmap(eightspades, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 7) {
                canvas.drawBitmap(ninespades, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 8) {
                canvas.drawBitmap(tenspades, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 9) {
                canvas.drawBitmap(jackspades, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 10) {
                canvas.drawBitmap(queenspades, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 11) {
                canvas.drawBitmap(kingspades, 0.0f, 0.0f, null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 12) {
                canvas.drawBitmap(acespades, 0.0f, 0.0f, null);
            }
        }
    }

    public void update() {


    }



    public void surfaceChanged(SurfaceHolder holder, int format, int width,
                               int height) {
        // TODO Auto-generated method stub

    }

    public void surfaceCreated(SurfaceHolder holder) {
        // TODO Auto-generated method stub
        canvasthread.setRunning(true);
        canvasthread.start();


    }

    public void surfaceDestroyed(SurfaceHolder holder) {
        // TODO Auto-generated method stub
        boolean retry = true;
        canvasthread.setRunning(false);
        while (retry) {
            try {
                canvasthread.join();
                retry = false;
            } catch (InterruptedException e) {
                // we will try it again and again...
            }
        }





    }


}