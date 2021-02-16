package com.example.conversor_navegador_web;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TimePicker;
import android.widget.Toast;

public class EnviarCorreo extends MainActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enviarcorreo);

        TimePicker timePicker = findViewById(R.id.event_time_picker);

        timePicker.setIs24HourView(true);
        Bundle bundle = getIntent().getExtras();
        String valor = bundle.getString("Valor");
        Button enviar_correo = findViewById(R.id.enviar_por_correo);
        CalendarView calendario = findViewById(R.id.calendarView);
        TimePicker hora = findViewById(R.id.event_time_picker);

        enviar_correo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String addresses = "pedro.rodriguez@escuelaestech.es";
                String subject = "Asunto";
                String text = "hola";
                /*Intent enviar_correo2 = new Intent(Intent.ACTION_SENDTO);
                enviar_correo2.setData(Uri.parse("mailto:"));
                enviar_correo2.setType("text/plain");
                enviar_correo2.putExtra(Intent.EXTRA_EMAIL, addresses);
                enviar_correo2.putExtra(Intent.EXTRA_SUBJECT, subject);
                enviar_correo2.putExtra(Intent.EXTRA_TEXT, text);
                enviar_correo2.putExtra(Intent.EXTRA_TEXT, valor);
                if (enviar_correo2.resolveActivity(getPackageManager()) != null) {
                    startActivity(enviar_correo2);
                } else {
                    Toast.makeText(EnviarCorreo.this, "ERES TONTO PEDROLU", Toast.LENGTH_LONG).show();
                }*/

                Intent correo= new Intent(Intent.ACTION_SENDTO);
                String addresses = "pedro.rodriguez@escuelaestech.es";
                String subject = "Asunto";
                String text = "hola";
                correo.setType("text/plain");
                correo.setData(Uri.parse("mailto:"));
                correo.putExtra(Intent.EXTRA_TEXT, valor);
                correo.putExtra(Intent.EXTRA_EMAIL, addresses);
                correo.putExtra(Intent.EXTRA_SUBJECT, subject);
                correo.putExtra(Intent.EXTRA_TEXT, text);
                startActivity(correo);
            }
        });
    }
}
