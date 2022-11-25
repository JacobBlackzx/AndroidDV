package com.ubuntu.android.conversordemoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    EditText edtValorDolar, edtQuantDolar;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValorDolar = findViewById(R.id.edtValorDolar);
        edtQuantDolar = findViewById(R.id.edtQuantDolar);

        txtResultado = findViewById(R.id.txtResultado);
    }

    public void calcular (View view) {

        double quantDolar = Double.parseDouble(edtQuantDolar.getText().toString());
        double valorDolar = Double.parseDouble(edtValorDolar.getText().toString());

        double totalReais = valorDolar * quantDolar;


        /*
        DecimalFormat decimal = new DecimalFormat(Pattern: "0.00");
        String valorFormatado = decimal.format(totalReais);
        */

        txtResultado.setText("R$: " + totalReais);
    }


}