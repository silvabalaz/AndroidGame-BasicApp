package com.app.basicapp;


import android.app.Activity;
import android.os.Bundle;

public class GameActivity extends Activity {

    // objekt koji se brine o Viewu
    private BAView viewIgre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        // napravimo instancu Basic App Viewa
        // proslijedimo this (context naseg appa)
        viewIgre = new BAView(this);
        // napravimo da viewIgre bude view za Activity
        setContentView(viewIgre);

    }

    // ako je Avtivity igre pauziran pobrinimo se da bude i dretva pauzirana
    @Override
    protected void onPause() {
        super.onPause();
        viewIgre.pause();
    }
    // ako je Avtivity igre  nastavlja rad pobrinimo se da i dretva nastavi
    @Override
    protected void onResume() {
        super.onResume();
        viewIgre.resume();
    }
}
