package com.example.renan.sosodonto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class dicas_adultos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicas_adultos);
    }

    public void finishActivity(View v){
        finish();
    }
}
