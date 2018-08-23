package com.edu.utng.modernlogin;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class HOExercise extends AppCompatActivity implements View.OnClickListener{
    RadioButton rbOperadorMultiplicacion;
    RadioButton rbOperadorDivision;
    RadioButton rbOperadorResta;
    RadioButton rbOperadorMulPot;
    RadioButton rbOperadorSumaTrapecio;
    MediaPlayer correct;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoexercise);
        rbOperadorDivision=findViewById(R.id.rb_operador_div);
        rbOperadorMultiplicacion=findViewById(R.id.rb_operador_multi);
        rbOperadorResta=findViewById(R.id.rb_operador_resta);
        rbOperadorMulPot=findViewById(R.id.rb_operador_multpote);
        rbOperadorSumaTrapecio=findViewById(R.id.rb_suma_trapecio);
         rbOperadorMultiplicacion.setOnClickListener(this);
         rbOperadorDivision.setOnClickListener(this);
         rbOperadorResta.setOnClickListener(this);
         rbOperadorMulPot.setOnClickListener(this);
         rbOperadorSumaTrapecio.setOnClickListener(this);
        correct= MediaPlayer.create(getApplicationContext(),R.raw.correcto);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.rb_operador_div):
                Toast.makeText(HOExercise.this, "Correcto! ",
                        Toast.LENGTH_SHORT).show();
                correct.start();
                break;
            case (R.id.rb_operador_multi):

                Toast.makeText(HOExercise.this, "Correcto! ",
                        Toast.LENGTH_SHORT).show();
                correct.start();
                break;
            case (R.id.rb_operador_resta):

                Toast.makeText(HOExercise.this, "Correcto! ",
                        Toast.LENGTH_SHORT).show();
                correct.start();
                break;
            case (R.id.rb_operador_multpote):

                Toast.makeText(HOExercise.this, "Correcto! ",
                        Toast.LENGTH_SHORT).show();
                correct.start();
                break;
            case (R.id.rb_suma_trapecio):

                Toast.makeText(HOExercise.this, "Correcto! ",
                        Toast.LENGTH_SHORT).show();
                correct.start();
                break;

        }

    }
}
