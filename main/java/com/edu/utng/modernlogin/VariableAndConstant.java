package com.edu.utng.modernlogin;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class VariableAndConstant extends AppCompatActivity implements View.OnClickListener{
    RadioButton rbConstanteSemana;
    RadioButton rbConstantePI;
    RadioButton rbConstanteSaludo;
    MediaPlayer correct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variable_and_constant);
        rbConstanteSemana=findViewById(R.id.rb_constante_semana);
        rbConstantePI=findViewById(R.id.rb_pi);
        rbConstanteSaludo=findViewById(R.id.rb_saludo_constante);
        rbConstanteSemana.setOnClickListener(this);
        rbConstantePI.setOnClickListener(this);
        rbConstanteSaludo.setOnClickListener(this);
        correct=MediaPlayer.create(getApplicationContext(),R.raw.correcto);
    }

    @Override
    public void onClick(View view) {
    if(rbConstanteSemana.isChecked()){
        Toast.makeText(VariableAndConstant.this, "Correcto! ",
                Toast.LENGTH_SHORT).show();
        correct.start();
    }
        if(rbConstantePI.isChecked()){
            Toast.makeText(VariableAndConstant.this, "Correcto! ",
                    Toast.LENGTH_SHORT).show();
            correct.start();
        }
        if(rbConstanteSaludo.isChecked()){
            Toast.makeText(VariableAndConstant.this, "Correcto! ",
                    Toast.LENGTH_SHORT).show();
            correct.start();
        }
    }
}
