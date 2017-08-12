package com.app.basicapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by silva on 8/12/17.
 */

public class BAView extends SurfaceView implements Runnable {

    volatile boolean igra;
    Thread dretvaIgre = null;

    // Objekti igre
    private ObjektIgraca igrac;
    // Za iscrtavanje
    private Paint paint;
    private Canvas canvas;
    private SurfaceHolder ourHolder;

    public BAView(Context context) {
        super(context);


        // inicijaliziranje objekta za crtanje
        ourHolder = getHolder();
        paint = new Paint();
        igrac = new ObjektIgraca(context);



    }

    @Override
    public void run() {
        Log.i("poruka","RUNNNNNNNNNNNNNNN");
        while (igra) {
            Log.i("poruka","a");
            obnovi();
            crtaj();
            kontrole();
        }

    }
    private void obnovi(){
        igrac.obnovi();
    }
    private void crtaj() {

        if (ourHolder.getSurface().isValid()) {
            //Podrucje na koje cemo iscrtavati
            canvas = ourHolder.lockCanvas();
            canvas.drawColor(Color.argb(255, 0, 0, 0));
            // Iscrtaj igraca
            canvas.drawBitmap(
                    igrac.getBitmap(),
                    igrac.getX(),
                    igrac.getY(),
                    paint);
            // Iscrtaj
            ourHolder.unlockCanvasAndPost(canvas);

        }
    }
    private void kontrole(){
        try { //pauziranje dretve 17 milisekundi
            dretvaIgre.sleep(17);
        } catch (InterruptedException e) {
        }
    }



    public void pause() {

        igra = false;
        try {
            dretvaIgre.join();
        } catch (InterruptedException e) {
        }
    }
    // Make a new thread and start it
    // Execution moves to our R
    public void resume() {
        igra = true;
        dretvaIgre = new Thread(this);
        dretvaIgre.start();
    }
}