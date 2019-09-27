package store.www.calculadorimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnCalcularOnClick(View v) {

        TextView lblResultado = findViewById(R.id.lblResultado);
        EditText txtPeso = findViewById(R.id.txtPeso);
        EditText txtAltura = findViewById(R.id.txtAltura);

        int peso = Integer.parseInt(txtPeso.getText().toString());
        float altura = Float.parseFloat(txtAltura.getText().toString());

        float resultado = peso / (altura * altura);
        if (resultado < 19) {
            //abaixo
            lblResultado.setText("Abaixo do peso!");
        } else if (resultado < 30) {
            //obeso
            lblResultado.setText("sobrepeso!");

            }else if (resultado > 32) {
            //obeso
            lblResultado.setText("Acima do peso!");
        }else {
                //ok
                lblResultado.setText("Peso ok!");
            }
        }
    }




