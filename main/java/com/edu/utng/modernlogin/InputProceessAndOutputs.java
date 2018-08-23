package com.edu.utng.modernlogin;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class InputProceessAndOutputs extends AppCompatActivity implements View.OnClickListener {
    RadioButton rgbSuma;
    RadioButton rgbResultado;
    RadioButton rgbOperacion;
    TextView txtVerAlgoritmo;
    MediaPlayer correct;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_proceess_and_outputs);
        rgbSuma=findViewById(R.id.rb_numero);
        rgbOperacion=findViewById(R.id.rb_operacion_suma);
        rgbResultado=findViewById(R.id.rb_resultado_final);
        txtVerAlgoritmo=findViewById(R.id.txt_continuar_algoritmos);
        txtVerAlgoritmo.setOnClickListener(this);
        rgbSuma.setOnClickListener(this);
        rgbOperacion.setOnClickListener(this);
        rgbResultado.setOnClickListener(this);
        correct=MediaPlayer.create(getApplicationContext(),R.raw.correcto);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.rb_numero):
                Toast.makeText(InputProceessAndOutputs.this, "Correcto! ",
                        Toast.LENGTH_SHORT).show();
                correct.start();
                break;
            case (R.id.rb_operacion_suma):

                Toast.makeText(InputProceessAndOutputs.this, "Correcto! ",
                        Toast.LENGTH_SHORT).show();
                correct.start();
                break;
            case (R.id.rb_resultado_final):

                Toast.makeText(InputProceessAndOutputs.this, "Correcto! ",
                        Toast.LENGTH_SHORT).show();
                correct.start();
                break;
            case (R.id.txt_continuar_algoritmos):
                Toast.makeText(InputProceessAndOutputs.this, "Actividad Entradas Procesos Salidas! ",
                        Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), EPSExercise.class));
                break;
        }
    }
}
