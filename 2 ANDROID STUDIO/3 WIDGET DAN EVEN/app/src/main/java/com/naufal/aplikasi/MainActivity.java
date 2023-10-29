package com.naufal.aplikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText angka1, angka2;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angka1 = findViewById(R.id.angka1);
        angka2 = findViewById(R.id.angka2);
        hitung = findViewById(R.id.hitung);
        hasil = findViewById(R.id.hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilaiAngka1 = angka1.getText().toString();
                String nilaiAngka2 = angka2.getText().toString();

                int nilai1 = Integer.valueOf(nilaiAngka1);
                int nilai2 = Integer.valueOf(nilaiAngka2);
                int hasilJumlah = nilai1+nilai2;

                hasil.setText(String.valueOf("Hasil : "+hasilJumlah));
            }
        });
    }
}