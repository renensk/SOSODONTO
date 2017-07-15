package com.example.renan.sosodonto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;

public class Dicas_criancas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicas_criancas);

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    public void finishActivity(View v){
        finish();
    }
}
