package com.app.basicapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // UI , početni zaslon
        setContentView(R.layout.activity_main);

        // referenca na gumb iz layouta
        final Button igraj = (Button)findViewById(R.id.igraj);
        // Osluskuje odabir gumba
        igraj.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // za gumb Igraj
        // Stvori novi Intent objekt
        Intent i = new Intent(this, GameActivity.class);
        // Start  GameActivity sa Intentom
        startActivity(i);
        // ugasi activity
        finish();

    }
}
