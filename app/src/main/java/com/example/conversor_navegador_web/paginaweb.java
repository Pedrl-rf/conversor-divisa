package com.example.conversor_navegador_web;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class paginaweb extends EnviarCorreo{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weblayout);
        WebView web = findViewById(R.id.web);
        web.loadUrl("https://google.com");
        Button atras = findViewById(R.id.atras);
        Button avance = findViewById(R.id.alante);
        Button inicio = findViewById(R.id.inicio);
        Bundle bundle = getIntent().getExtras();

        avance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.goForward();
            }
        });

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(web.canGoBack()){
                    web.goBack();
                }
            }
        });

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.loadUrl("https://google.com");
            }
        });
    }
}

