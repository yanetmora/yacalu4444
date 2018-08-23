package com.edu.utng.modernlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ConceptoBasico extends AppCompatActivity implements View.OnClickListener{
    TextView txtEjercicios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concepto_basico);
        txtEjercicios=findViewById(R.id.tv_ejercicosB);
        txtEjercicios.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(ConceptoBasico.this,"Estas por comenzar un ejercicio",
                Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplicationContext(),ExcerciseOne.class));
    }
}
