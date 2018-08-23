package com.edu.utng.modernlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class SubmenuPoo extends AppCompatActivity implements View.OnClickListener{
    TextView txtClassObject;
    TextView txtMetod;
    TextView txtAgregation;
    TextView txtExercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submenu_poo);
        txtClassObject=findViewById(R.id.txt_clases_objetos);
        txtMetod=findViewById(R.id.txt_atributo_metodo_herencia);
        txtAgregation=findViewById(R.id.txt_agregacion_asociacion);
        txtExercise=findViewById(R.id.txt_ejercicios_POO1);
//escuchadores
        txtClassObject.setOnClickListener(this);
        txtMetod.setOnClickListener(this);
        txtAgregation.setOnClickListener(this);
        txtExercise.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Random number = new Random();
        int i = number.nextInt(3 + 1);

        switch (view.getId()) {
            case (R.id.txt_clases_objetos):
                startActivity(new Intent(getApplicationContext(),ConceptoBasico.class));
                break;
            case (R.id.txt_atributo_metodo_herencia):
                startActivity(new Intent(getApplicationContext(), AtributeMetod.class));
                break;
            case (R.id.txt_agregacion_asociacion):
                startActivity(new Intent(getApplicationContext(), AgregationAssociation.class));
                break;
            case (R.id.txt_ejercicios_POO1):
                if (i == 1){
                    startActivity(new Intent(getApplicationContext(), ExcerciseTwo.class));
                }
                if (i == 2){
                    startActivity(new Intent(getApplicationContext(), ExerciseThree.class));
                }
                if (i == 3){
                    startActivity(new Intent(getApplicationContext(), Celular.class));
                }


                break;
        }
    }
}
