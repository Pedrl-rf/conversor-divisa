package com.example.conversor_navegador_web;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        TextView resultado;
        Spinner tipoInicial, tipoFinal;
        TextInputLayout cantidadI;
        Button bt_convertir;

        TextInputEditText valorIinial = findViewById(R.id.tiet_valorInicial);
        bt_convertir = findViewById(R.id.bt_convertir);
        tipoInicial = findViewById(R.id.medida_inicial);
        tipoFinal = findViewById(R.id.medida_final);
        resultado = findViewById(R.id.tv_resultado);



        float [][] bidimensional = new float[][]{{1f, 1.21f, 0.88f,127.21f},{0.83f,1f,0.72f,104.96f},{1.14f,1.38f,1f,145.278f},{0.0079f,0.0095f,0.0069f,1f}};

        tipoInicial.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        bt_convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int idTI = (int)tipoInicial.getSelectedItemId();
                int idTF = (int)tipoFinal.getSelectedItemId();

                if(valorIinial.getText().toString().isEmpty()){
                        valorIinial.setError("Introduce una cantidad por favor");
                }else{
                        float conversion = Float.parseFloat(valorIinial.getText().toString()) * bidimensional[idTI][idTF];
                        resultado.setText(String.valueOf(conversion));
                        Intent intent = new Intent(MainActivity.this, EnviarCorreo.class);
                        intent = intent.putExtra("Valor", String.valueOf(conversion));
                        startActivity(intent);
                    }

                }
        });
    }
}