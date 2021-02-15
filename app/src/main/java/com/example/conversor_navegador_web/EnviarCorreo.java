package com.example.conversor_navegador_web;

import android.os.Bundle;
import android.widget.TimePicker;

public class EnviarCorreo extends MainActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enviarcorreo);

        TimePicker timePicker = findViewById(R.id.event_time_picker);

        timePicker.setIs24HourView(true);
    }
}
