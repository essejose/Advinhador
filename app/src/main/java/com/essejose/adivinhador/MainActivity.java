package com.essejose.adivinhador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText etChuEditText;
    private TextView tvUltiTextView;

    private  int chuteJogador;
    private  int numeroAleatorio;
    private Random geradorNumero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        geradorNumero = new Random();

        numeroAleatorio = geradorNumero.nextInt(11);

        etChuEditText = (EditText)findViewById(R.id.etChuteJogador);
        tvUltiTextView = (TextView)findViewById(R.id.tvUltimoChute);

    }

    public void chutar(View v){

        if(!TextUtils.isEmpty(
                etChuEditText
                        .getText()
                        .toString())){
            Toast.makeText(this,"informe seu chute",Toast.LENGTH_LONG).show();
        }else{
            chuteJogador = Integer.parseInt(etChuEditText.getText().toString());

            if(chuteJogador == numeroAleatorio){
                Toast.makeText(this,"Acertou",Toast.LENGTH_SHORT).show();
            }else if( chuteJogador < numeroAleatorio){
                Toast.makeText(this,"Chute menor",Toast.LENGTH_SHORT).show();
            }else if(chuteJogador > numeroAleatorio){
                Toast.makeText(this,"Chute maior",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
