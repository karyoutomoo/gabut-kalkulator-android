package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etAngka1, etAngka2;
    TextView tvhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAngka1= findViewById(R.id.etAngka1);
        etAngka2= findViewById(R.id.etAngka2);
        tvhasil= findViewById(R.id.hasil);
    }

    public void tambah(View view){
        String angka1 = etAngka1.getText().toString();
        String angka2 = etAngka2.getText().toString();

        if(angka1.isEmpty() || angka2.isEmpty())
            Toast.makeText(getApplicationContext(), "Masukkan angka!", Toast.LENGTH_SHORT).show();
        else{
            Double hasil = Double.valueOf(angka1) + Double.valueOf(angka2);
            tvhasil.setText(String.valueOf(hasil));}
    }

    public void kurang(View view){
        String angka1 = etAngka1.getText().toString();
        String angka2 = etAngka2.getText().toString();

        if(angka1.isEmpty() || angka2.isEmpty())
            Toast.makeText(getApplicationContext(), "Masukkan angka!", Toast.LENGTH_SHORT).show();
        else{
            Double hasil = Double.valueOf(angka1) - Double.valueOf(angka2);
            tvhasil.setText(String.valueOf(hasil));}
    }
    public void kali(View view){
        String angka1 = etAngka1.getText().toString();
        String angka2 = etAngka2.getText().toString();

        if(angka1.isEmpty() || angka2.isEmpty())
            Toast.makeText(getApplicationContext(), "Masukkan angka!", Toast.LENGTH_SHORT).show();
        else{
            Double hasil = Double.valueOf(angka1) * Double.valueOf(angka2);
            tvhasil.setText(String.valueOf(hasil));}
    }
    public void bagi(View view){
        String angka1 = etAngka1.getText().toString();
        String angka2 = etAngka2.getText().toString();

        if(angka1.isEmpty() || angka2.isEmpty())
        Toast.makeText(getApplicationContext(), "Masukkan angka!", Toast.LENGTH_SHORT).show();
        else{
            Double hasil = Double.valueOf(angka1) / Double.valueOf(angka2);
            tvhasil.setText(String.valueOf(hasil));}
        }
        public void gotoPageTwo(View view)
        {
            Intent intent = new Intent(MainActivity.this, HalamanDua.class);
            startActivity(intent);
        }
}
