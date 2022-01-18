package com.example.ayomasak;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.zip.Inflater;

public class AdapterBelanjaan extends ArrayAdapter {
    String namabelanjaan[];
    int gambar_belanjaan[];
    Activity activity;


    public AdapterBelanjaan(DaftarBelanjaan mainBelanjaan, String[] nama_belanjaan, int[] gambar_belanjaan) {
        super(mainBelanjaan,R.layout.list_item,nama_belanjaan);
        this.namabelanjaan = nama_belanjaan;
        this.gambar_belanjaan = gambar_belanjaan;
        this.activity = activity;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View v = inflater.inflate(R.layout.list_item, null);

        ImageView gambar;
        TextView nama_gambar;

        gambar = v.findViewById(R.id.gambar_belanjaan);
        nama_gambar = v.findViewById(R.id.nama_belanjaan);

        gambar.setImageResource(gambar_belanjaan[position]);
        nama_gambar.setText(namabelanjaan[position]);

        return v;
    }
}
