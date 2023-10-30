package com.naufal.aplikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button beranda,go;
    EditText alamat;
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web = findViewById(R.id.webview);
        beranda = findViewById(R.id.beranda);
        go = findViewById(R.id.go);
        alamat = findViewById(R.id.alamat);

        web.getSettings().setJavaScriptEnabled(true);
        String url = "https://google.com";
        web.loadUrl(url);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.loadUrl(alamat.getText().toString());
            }
        });

        beranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.loadUrl("https://google.com");
            }
        });

        web.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                alamat.setText(url);
                return false;
            }
        });
    }
}