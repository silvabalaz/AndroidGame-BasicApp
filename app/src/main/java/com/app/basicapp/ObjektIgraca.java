package com.app.basicapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by silva on 8/12/17.
 */

public class ObjektIgraca {

    private Bitmap slika;
    private int x, y;
    private int brzina = 0;

    // Konstruktor
    public ObjektIgraca(Context context) {
        x = 50;
        y = 50;
        brzina = 1;
        slika = BitmapFactory.decodeResource(context.getResources(), R.drawable.objektigraca);
    }

    
    public Bitmap getBitmap() {
        return slika;
    }

    public int getX() {

        return x;
    }

    public int getY() {
        return y;
    }

    public int getSpeed() {
        return brzina;
    }
    public void obnovi(){
        x++;
    }

}
