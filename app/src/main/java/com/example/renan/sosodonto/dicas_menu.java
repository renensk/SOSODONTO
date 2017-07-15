package com.example.renan.sosodonto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Dicas_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicas_menu);
    }

    public void dicasCrianca(View view){
        Intent mintent = new Intent(Dicas_menu.this, Dicas_criancas.class);
        startActivity(mintent);
    }

    public void dicasAdulto(View view){
        Intent mintent = new Intent(Dicas_menu.this, Dicas_adultos.class);
        startActivity(mintent);
    }

    public void finishActivity(View v){
        finish();
    }
}
