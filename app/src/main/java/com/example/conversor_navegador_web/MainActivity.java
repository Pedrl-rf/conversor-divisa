package com.example.conversor_navegador_web;

import androidx.appcompat.app.AppCompatActivity;

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
                /*String valor = String.valueOf(idTI);
                resultado.setText(valor);*/
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

                //Map

                /*if(idTI == 0) {
                   float valorinicial;
                   valorinicial = Float.valueOf(valorIinial.getText().toString());
                   float Rresultado = valorinicial * bidimensional[0][1];
                   resultado.setText(String.valueOf(Rresultado));
                }*/


                   /*switch (idTI){
                       case 0:
                               if(idTF == 0) {
                                   float valorinicial;
                                   valorinicial = Float.valueOf(valorIinial.getText().toString());
                                   float Rresultado = valorinicial * bidimensional[0][0];
                                   resultado.setText(String.valueOf(Rresultado));
                               }else if(idTF == 1){
                                   float valorinicial;
                                   valorinicial = Float.valueOf(valorIinial.getText().toString());
                                   float Rresultado = valorinicial * bidimensional[0][1];
                                   resultado.setText(String.valueOf(Rresultado));
                               }else if(idTF == 2) {
                                   float valorinicial;
                                   valorinicial = Float.valueOf(valorIinial.getText().toString());
                                   float Rresultado = valorinicial * bidimensional[0][2];
                                   resultado.setText(String.valueOf(Rresultado));
                               }else if(idTF == 3) {
                                   float valorinicial;
                                   valorinicial = Float.valueOf(valorIinial.getText().toString());
                                   float Rresultado = valorinicial * bidimensional[0][3];
                                   resultado.setText(String.valueOf(Rresultado));
                               }
                               break;
                       case 1:
                               if(idTF == 0) {
                                   float valorinicial;
                                   valorinicial = Float.valueOf(valorIinial.getText().toString());
                                   float Rresultado = valorinicial * bidimensional[1][0];
                                   resultado.setText(String.valueOf(Rresultado));
                               }else if(idTF == 1){
                                   float valorinicial;
                                   valorinicial = Float.valueOf(valorIinial.getText().toString());
                                   float Rresultado = valorinicial * bidimensional[1][1];
                                   resultado.setText(String.valueOf(Rresultado));
                               }else if(idTF == 2) {
                                   float valorinicial;
                                   valorinicial = Float.valueOf(valorIinial.getText().toString());
                                   float Rresultado = valorinicial * bidimensional[1][2];
                                   resultado.setText(String.valueOf(Rresultado));
                               }else if(idTF == 3) {
                                   float valorinicial;
                                   valorinicial = Float.valueOf(valorIinial.getText().toString());
                                   float Rresultado = valorinicial * bidimensional[1][3];
                                   resultado.setText(String.valueOf(Rresultado));
                               }
                           break;
                       case 2:
                           if(idTF == 0) {
                               float valorinicial;
                               valorinicial = Float.valueOf(valorIinial.getText().toString());
                               float Rresultado = valorinicial * bidimensional[2][0];
                               resultado.setText(String.valueOf(Rresultado));
                           }else if(idTF == 1){
                               float valorinicial;
                               valorinicial = Float.valueOf(valorIinial.getText().toString());
                               float Rresultado = valorinicial * bidimensional[2][1];
                               resultado.setText(String.valueOf(Rresultado));
                           }else if(idTF == 2) {
                               float valorinicial;
                               valorinicial = Float.valueOf(valorIinial.getText().toString());
                               float Rresultado = valorinicial * bidimensional[2][2];
                               resultado.setText(String.valueOf(Rresultado));
                           }else if(idTF == 3) {
                               float valorinicial;
                               valorinicial = Float.valueOf(valorIinial.getText().toString());
                               float Rresultado = valorinicial * bidimensional[2][3];
                               resultado.setText(String.valueOf(Rresultado));
                           }
                           break;
                       case 3:
                           if(idTF == 0) {
                               float valorinicial;
                               valorinicial = Float.valueOf(valorIinial.getText().toString());
                               float Rresultado = valorinicial * bidimensional[3][0];
                               resultado.setText(String.valueOf(Rresultado));
                           }else if(idTF == 1){
                               float valorinicial;
                               valorinicial = Float.valueOf(valorIinial.getText().toString());
                               float Rresultado = valorinicial * bidimensional[3][1];
                               resultado.setText(String.valueOf(Rresultado));
                           }else if(idTF == 2) {
                               float valorinicial;
                               valorinicial = Float.valueOf(valorIinial.getText().toString());
                               float Rresultado = valorinicial * bidimensional[3][2];
                               resultado.setText(String.valueOf(Rresultado));
                           }else if(idTF == 3) {
                               float valorinicial;
                               valorinicial = Float.valueOf(valorIinial.getText().toString());
                               float Rresultado = valorinicial * bidimensional[3][3];
                               resultado.setText(String.valueOf(Rresultado));
                           }
                           break;
                       default:
                           throw new IllegalStateException("Unexpected value: " + idTI);
                   }*/

                if(valorIinial.getText().toString().isEmpty()){
                        valorIinial.setError("Introduce una cantidad por favor");
                }else{
                        float conversion = Float.parseFloat(valorIinial.getText().toString()) * bidimensional[idTI][idTF];
                        resultado.setText(String.valueOf(conversion));
                    }

                }
        });
    }
}