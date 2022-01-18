package com.example.ayomasak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ResepNasiGoreng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_nasi_goreng);
    }
    public void BiayaNasgor (View view){
        Intent intent = new Intent(ResepNasiGoreng.this,KalkulatorNasgor.class);
        startActivity(intent);
    }
}