package com.edu.utng.modernlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SubmenuPoo2 extends AppCompatActivity implements View.OnClickListener {
    TextView txtPolimorfismo;
    TextView txtClaseAbtracta;
    TextView txtInterface;
    TextView txtExercisePoo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submenu_poo2);
        txtPolimorfismo=findViewById(R.id.txt_polimorfismo);
        txtClaseAbtracta=findViewById(R.id.txt_clases_abstractas);
        txtInterface=findViewById(R.id.txt_interfaces);
        txtExercisePoo2=findViewById(R.id.txt_ejercicios_POO2);
        //escuhadores
        txtPolimorfismo.setOnClickListener(this);
        txtClaseAbtracta.setOnClickListener(this);
        txtInterface.setOnClickListener(this);
        txtExercisePoo2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.txt_polimorfismo):
                startActivity(new Intent(getApplicationContext(),Polymorphism.class));
                break;
            case (R.id.txt_clases_abstractas):
                startActivity(new Intent(getApplicationContext(), Abstract.class));
                break;
            case (R.id.txt_interfaces):
                startActivity(new Intent(getApplicationContext(), Interfaz.class));
                break;
            case (R.id.txt_ejercicios_POO2):
                startActivity(new Intent(getApplicationContext(), ExcerciseTwo.class));

                break;
        }
    }
}
