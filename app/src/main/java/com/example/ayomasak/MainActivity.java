package com.example.ayomasak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Button_R_Nasgor, Button_R_Tempe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void R_Nasgor (View view){
        Intent intent = new Intent(MainActivity.this,ResepNasiGoreng.class);
        startActivity(intent);
    }

    public void R_Tempe (View view){
        Intent intent = new Intent(MainActivity.this,ResepTempeGoreng.class);
        startActivity(intent);
    }

    public void Belanjaan (View view){
        Intent intent = new Intent(MainActivity.this,DaftarBelanjaan.class);
        startActivity(intent);
    }

}