package com.edu.utng.modernlogin;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ExcerciseTwo extends AppCompatActivity implements View.OnClickListener{
    private EditText edtNombre;
    private EditText edtTipoModelo;
    private EditText edtModelo;
    private EditText edtTipoMarca;
    private EditText edtMarca;
    private EditText edtTipoAnio;
    private EditText edtAnio;
    private EditText edtSetModelo;
    private EditText edtGetModelo;
    private EditText edtSetMarca;
    private EditText edtGetMarca;
    private EditText edtSetAnio;
    private EditText edtGetAnio;
    private Button btnVerficar;
    MediaPlayer correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio_dos);
       // ActionBar actionBar=getSupportActionBar();
       // actionBar.setDisplayHomeAsUpEnabled(true);
        edtNombre=findViewById(R.id.txt_nombre_clase);
        edtTipoModelo=findViewById(R.id.txt_tipo_modelo);
        edtModelo=findViewById(R.id.txt_nombre_modelo);
        edtTipoMarca=findViewById(R.id.txt_tipo_marca);
        edtMarca=findViewById(R.id.txt_nombre_marca);
        edtTipoAnio=findViewById(R.id.txt_tipo_anio);
        edtAnio=findViewById(R.id.txt_nombre_anio);
        edtSetModelo=findViewById(R.id.txt_setter_modelo);
        edtGetModelo=findViewById(R.id.txt_tipo_gmodelo);
        edtSetMarca=findViewById(R.id.txt_setter_marca);
        edtGetMarca=findViewById(R.id.txt_tipo_gmarca);
        edtSetAnio=findViewById(R.id.txt_setter_anio);
        edtGetAnio=findViewById(R.id.txt_tipo_ganio);
        btnVerficar=findViewById(R.id.btn_verificaA);
        edtNombre.setOnClickListener(this);
        edtTipoModelo.setOnClickListener(this);
        edtModelo.setOnClickListener(this);
        edtTipoMarca.setOnClickListener(this);
        edtMarca.setOnClickListener(this);
        edtTipoAnio.setOnClickListener(this);
        edtAnio.setOnClickListener(this);
        edtSetModelo.setOnClickListener(this);
        edtGetModelo.setOnClickListener(this);
        edtSetMarca.setOnClickListener(this);
        edtGetMarca.setOnClickListener(this);
        edtSetAnio.setOnClickListener(this);
        edtGetAnio.setOnClickListener(this);
        btnVerficar.setOnClickListener(this);

        correct=MediaPlayer.create(getApplicationContext(),R.raw.correcto);

    }

    @Override
    public void onClick(View view) {
        int puntos = 0;
        if (btnVerficar.isClickable()) {
            if (edtNombre.getText().toString().trim().equals("Automovil")) {
                correct.start();
                puntos = puntos + 1;
            }
            if (edtTipoModelo.getText().toString().trim().equals("String") || edtSetModelo.getText().toString().trim().equals("String")) {
                correct.start();
                puntos = puntos + 1;
            }
            if (edtModelo.getText().toString().trim().equals("modelo")) {
                correct.start();
                puntos = puntos + 1;
            }
            if (edtTipoMarca.getText().toString().trim().equals("String") || edtSetMarca.getText().toString().trim().equals("String")) {
                correct.start();
                puntos = puntos + 1;
            }
            if (edtMarca.getText().toString().trim().equals("marca")) {
                correct.start();
                puntos = puntos + 1;
            }
            if (edtTipoAnio.getText().toString().trim().equals("int") || edtSetAnio.getText().toString().trim().equals("int")) {
                correct.start();
                puntos = puntos + 1;
            }
            if (edtAnio.getText().toString().trim().equals("anio")) {
                correct.start();
                puntos = puntos + 1;
            }
            Toast.makeText(ExcerciseTwo.this, "Puntos " + puntos,
                    Toast.LENGTH_SHORT).show();
            if (puntos >=7) {
                Toast.makeText(ExcerciseTwo.this, "Puntos " + puntos+" Logrado",
                        Toast.LENGTH_SHORT).show();
            }
        }
    }//boton
}
