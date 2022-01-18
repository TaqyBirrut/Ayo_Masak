package com.example.ayomasak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.SavedStateHandle;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class KalkulatorNasgor extends AppCompatActivity {
    EditText hrgAyam, hrgMinyak, hrgNasi, hrgKecap, hrgGula;
    Button bttnHitung, bttnSimpan;
    TextView txtHasil;
    Switch swt1;

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT = "text";
    public static final String SWITCH1 = "swt1";

    private String text;
    private boolean switchOnOff;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_nasgor);

        hrgAyam = (EditText) findViewById(R.id.editHargaAyam);
        hrgMinyak = (EditText) findViewById(R.id.editHargaMinyak);
        hrgNasi = (EditText) findViewById(R.id.editHargaNasi);
        hrgKecap = (EditText) findViewById(R.id.editHargaKecap);
        hrgGula = (EditText) findViewById(R.id.editHargaGula);

        bttnHitung = (Button) findViewById(R.id.buttonHitung);
        bttnSimpan = (Button) findViewById(R.id.buttonSimpan);
        swt1 = (Switch) findViewById(R.id.switch1);

        txtHasil = (TextView) findViewById(R.id.textHasil);



        bttnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bil1, bil2, bil3, bil4, bil5, hasil;
                bil1 = Double.valueOf(hrgAyam.getText().toString().trim());
                bil2 = Double.valueOf(hrgMinyak.getText().toString().trim());
                bil3 = Double.valueOf(hrgNasi.getText().toString().trim());
                bil4 = Double.valueOf(hrgKecap.getText().toString().trim());
                bil5 = Double.valueOf(hrgGula.getText().toString().trim());
                hasil = bil1+bil2+bil3+bil4+bil5;
                String hasil1=String.valueOf(hasil);
                txtHasil.setText(hasil1);
            }
        });

        bttnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });

        loadData();
        updateViews();
    }
    public void saveData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(TEXT, txtHasil.getText().toString());
        editor.putBoolean(SWITCH1, swt1.isChecked());

        editor.apply();
        Toast.makeText(this, "Data tersimpan", Toast.LENGTH_SHORT).show();

    }

    public void loadData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        text = sharedPreferences.getString(TEXT, "");
        switchOnOff = sharedPreferences.getBoolean(SWITCH1, false);
    }

    public void updateViews(){
        txtHasil.setText(text);
        swt1.setChecked(switchOnOff);
    }
}