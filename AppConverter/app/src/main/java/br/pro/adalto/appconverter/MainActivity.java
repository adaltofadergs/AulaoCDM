package br.pro.adalto.appconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtValor;
    private Button botao;
    private TextView txtResultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtValor = findViewById(R.id.etValor);
        botao = findViewById(R.id.btnConverter);
        txtResultado = findViewById(R.id.tvResposta);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                converter();
            }
        });


    }

    private void converter(){
        String sValor = txtValor.getText().toString();
        if( ! sValor.isEmpty() ){
            double valor = Double.valueOf( sValor );
            Double km = valor * 1.852;
            txtResultado.setText( km.toString()  );
        }else{
            Toast.makeText(this, "Você não informou o valor:", Toast.LENGTH_SHORT).show();
        }
    }

}