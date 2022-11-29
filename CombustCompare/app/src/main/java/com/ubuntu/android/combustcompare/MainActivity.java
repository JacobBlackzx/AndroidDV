package com.ubuntu.android.combustcompare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPrecoAlcool;
    private EditText editPrecoGasolina;

    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool = findViewById(R.id.editPrecoAlcool);
        editPrecoGasolina = findViewById(R.id.editPrecoGasolina);

        textResultado = findViewById(R.id.textResultado);
    }

    public void calcularPreco(View view) {

        Double precoAlcool = Double.parseDouble(editPrecoAlcool.getText().toString());
        Double precoGasolina = Double.parseDouble(editPrecoGasolina.getText().toString());

        // Calcular preços combustiveis

        Double resultado = precoAlcool/precoGasolina;

        if (resultado >= 0.7) {
            textResultado.setText("Melhor utilizar Gasolina");
        }else {
            textResultado.setText("Melhor utilizar Alcool");
        }
    }
}