package com.example.ayomasak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class DaftarBelanjaan extends AppCompatActivity{

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_belanjaan);

        String nama_belanjaan[]={"Paha Ayam", "Minyak Goreng", "Nasi Putih",
                "Kecap Manis", "Gula dan Garam"};
        int gambar_belanjaan[]={R.drawable.paha_ayam, R.drawable.minyak_goreng, R.drawable.nasi_putih,
                R.drawable.kecap_manis, R.drawable.gula_garam};

        listView = findViewById(R.id.listdatabelanjaan);
        AdapterBelanjaan adapterBelanjaan = new AdapterBelanjaan(this, nama_belanjaan, gambar_belanjaan);
    }

}