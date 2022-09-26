package com.example.calculadora_numeros_primos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bCalcular;
    TextView tvTitulo;
    TextView tvExplicacion;
    TextView tvPosicion;
    TextView tvResultado;
    EditText etNumero_A_Buscar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bCalcular = findViewById(R.id.btCalcular);
        tvTitulo = findViewById(R.id.tvTitulo);
        tvExplicacion = findViewById(R.id.tvExplicacion);
        tvPosicion = findViewById(R.id.tvPosicion);
        tvResultado = findViewById(R.id.tvResultado);
        etNumero_A_Buscar = findViewById(R.id.etNumero);

    }

    public void mostrarPrimo(View view) {
        int numero_primo_a_conseguir = Integer.parseInt(etNumero_A_Buscar.getText().toString());
        int contador_numeros_primos = 0;
        int contador;
        if (!etNumero_A_Buscar.getText().toString().equals("")) {
            for (int i = 2; i < Math.pow(numero_primo_a_conseguir, 3) + 2; i++) {
                contador = 0;
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        contador++;
                    }
                }
                if (contador == 1) {
                    contador_numeros_primos++;
                }
                if (contador_numeros_primos == numero_primo_a_conseguir) {
                    tvResultado.setText(String.valueOf(i));
                    break;
                }
            }
        }
    }

}