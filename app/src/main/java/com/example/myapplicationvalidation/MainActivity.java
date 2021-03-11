package com.example.myapplicationvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Num1;
    EditText Num2;
    TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num1 = findViewById(R.id.Valor1);
        Num2 = findViewById(R.id.Valor2);
        Resultado = findViewById(R.id.Resultado);
    }

    public void Check_Number(View view){
        int nu1 = Integer.parseInt(Num1.getText().toString());
        int nu2 = Integer.parseInt(Num2.getText().toString());
        if (nu1 > nu2){

            Resultado.setText("El mayor es el numero : " + nu1);
        }
        else if (nu2 > nu1){
            Resultado.setText("El mayor es el numero : " + nu2);
        }
        else{
            Resultado.setText("Los numeros son iguales");
        }
    }
}