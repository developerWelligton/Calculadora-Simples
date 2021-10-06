package com.example.calculada_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double num1, num2, res;
    TextView tv_resultado;
    EditText et_valor1;
    EditText et_valor2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_somar =  findViewById(R.id.btn_somar);
        Button btn_subtrair =  findViewById(R.id.btn_subtrair);
        Button btn_dividir =  findViewById(R.id.btn_dividir);
        Button btn_multiplicar =  findViewById(R.id.btn_multiplicar);

        tv_resultado =   findViewById(R.id.tv_resultado);
        et_valor1= findViewById(R.id.et_valor1);
        et_valor2= findViewById(R.id.et_valor2);
        /*
        btn_somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=  Double.parseDouble(et_valor1.getText().toString());
                num2=  Double.parseDouble(et_valor2.getText().toString());
                res=  num1+num2;
                tv_resultado.setText(String.valueOf(res));
            }
        });

        btn_subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=  Double.parseDouble(et_valor1.getText().toString());
                num2=  Double.parseDouble(et_valor2.getText().toString());
                res=  num1-num2;
                tv_resultado.setText(String.valueOf(res));
            }
        });

        btn_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=  Double.parseDouble(et_valor1.getText().toString());
                num2=  Double.parseDouble(et_valor2.getText().toString());
                res=  num1*num2;
                tv_resultado.setText(String.valueOf(res));
            }
        });

        btn_dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=  Double.parseDouble(et_valor1.getText().toString());
                num2=  Double.parseDouble(et_valor2.getText().toString());
                res=  num1/num2;
                tv_resultado.setText(String.valueOf(res));
            }
        });*/
    }

    public void somar () {
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2=  Double.parseDouble(et_valor2.getText().toString());
        res=  num1+num2;
        tv_resultado.setText(String.valueOf(res));
    }

    public void subtrair () {
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2=  Double.parseDouble(et_valor2.getText().toString());
        res=  num1-num2;
        tv_resultado.setText(String.valueOf(res));
    }

    public void multiplicar () {
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2=  Double.parseDouble(et_valor2.getText().toString());
        res=  num1*num2;
        tv_resultado.setText(String.valueOf(res));
    }

    public void dividir () {
        num1 = Double.parseDouble(et_valor1.getText().toString());
        num2=  Double.parseDouble(et_valor2.getText().toString());
        res=  num1/num2;
        tv_resultado.setText(String.valueOf(res));
    }
    public void opera(View v){
        switch (v.getId()){
            case R.id.btn_somar:
                somar();
                break;

            case R.id.btn_subtrair:
                subtrair();
                break;

            case R.id.btn_multiplicar:
                multiplicar();
                break;

            case R.id.btn_dividir:
                dividir();
                break;

        }
    }

    
}