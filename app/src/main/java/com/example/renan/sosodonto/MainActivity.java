package com.example.renan.sosodonto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verDicas(View view){
        Intent mintent = new Intent(MainActivity.this, dicas_menu.class);
        startActivity(mintent);
    }

    public void maps(View view){
        Intent mintent = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(mintent);
    }
}
