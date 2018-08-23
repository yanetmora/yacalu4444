package com.edu.utng.modernlogin;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class EPSExercise extends AppCompatActivity  implements View.OnClickListener{
    RadioButton rbEntrada;
    RadioButton rbSalida;
    RadioButton rbProceso;

    MediaPlayer correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epsexercise);
        correct=MediaPlayer.create(getApplicationContext(),R.raw.correcto);
        rbEntrada=findViewById(R.id.rb_entrada_saludo);
        rbProceso=findViewById(R.id.rb_proceso_par);
        rbSalida=findViewById(R.id.rb_salida_suma);
        rbEntrada.setOnClickListener(this);
        rbProceso.setOnClickListener(this);
        rbSalida.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.rb_entrada_saludo):
                Toast.makeText(EPSExercise.this, "Correcto! ",
                        Toast.LENGTH_SHORT).show();
                correct.start();
                break;
            case (R.id.rb_proceso_par):

                Toast.makeText(EPSExercise.this, "Correcto! ",
                        Toast.LENGTH_SHORT).show();
                correct.start();
                break;
            case (R.id.rb_salida_suma):

                Toast.makeText(EPSExercise.this, "Correcto! ",
                        Toast.LENGTH_SHORT).show();
                correct.start();
                break;

        }
    }
}
