package br.ulbra.appcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtV1, edtV2;
    Button btnSomar,btnSubtracao,btnDivisao,btnMultiplicacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtV1 = findViewById(R.id.edtV1);
        edtV2 = findViewById(R.id.edtV2);
        btnSomar = findViewById(R.id.btnSomar);
        btnDivisao = findViewById(R.id.btnDiv);
        btnSubtracao = findViewById(R.id.btnSub);
        btnMultiplicacao = findViewById(R.id.btnMult);

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, soma;
                valor1 = Double.parseDouble(
                        edtV1.getText().toString());
                valor2 = Double.parseDouble(
                        edtV2.getText().toString());

                soma = valor1 + valor2;
                Toast.makeText( MainActivity.this,
                "Soma é igual a: " +soma,
                Toast.LENGTH_LONG).show();
            }
        });
        btnSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, sub;
                valor1 = Double.parseDouble(
                        edtV1.getText().toString());
                valor2 = Double.parseDouble(
                        edtV2.getText().toString());

                sub = valor1 - valor2;
                Toast.makeText( MainActivity.this,
                        "Subtração é igual a: " +sub,
                        Toast.LENGTH_LONG).show();
            }
        });
        btnDivisao.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, div;
                valor1 = Double.parseDouble(
                        edtV1.getText().toString());
                valor2 = Double.parseDouble(
                        edtV2.getText().toString());

                if (valor2 == 0){
                    Toast.makeText( MainActivity.this,
                            "Impossivel dividir por zero",
                            Toast.LENGTH_LONG).show();
                }else{
                    div = valor1 / valor2;
                    Toast.makeText( MainActivity.this,
                            "Divisão é igual a: " +div,
                            Toast.LENGTH_LONG).show();
                }

            }
        }));
        btnMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, mult;
                valor1 = Double.parseDouble(
                        edtV1.getText().toString());
                valor2 = Double.parseDouble(
                        edtV2.getText().toString());

                mult = valor1 * valor2;
                Toast.makeText( MainActivity.this,
                        "Multiplicação é igual a: " +mult,
                        Toast.LENGTH_LONG).show();
            }
        });

    }

}