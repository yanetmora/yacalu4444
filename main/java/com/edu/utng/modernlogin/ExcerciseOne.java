package com.edu.utng.modernlogin;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class ExcerciseOne extends AppCompatActivity implements View.OnClickListener{
    private EditText edtClase;
    private EditText edtEdad;
    private EditText edtNombre;
    private EditText edtHambriento;
    RadioButton rbVacuna;
    RadioButton rbEdad;
    Button btnVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
  //      ActionBar actionBar=getSupportActionBar();
//        actionBar.setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.activity_ejercicio_uno);
        edtClase=findViewById(R.id.txt_clase);
        edtEdad=findViewById(R.id.txt_varibale_edad);
        edtNombre=findViewById(R.id.txt_varibale_nombre);
        edtHambriento=findViewById(R.id.txt_varibale_hambre);
        rbVacuna=findViewById(R.id.rb_vacuna);
        btnVerificar=findViewById(R.id.btnPuntos);

        edtClase.setOnClickListener(this);
        edtEdad.setOnClickListener(this);
        edtNombre.setOnClickListener(this);
        edtHambriento.setOnClickListener(this);
        rbVacuna.setOnClickListener(this);
        btnVerificar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int puntos=0;

            if (edtClase.getText().toString().equals("public class Animal(){}")) {
                puntos =puntos+ 1;
            }
            if (edtEdad.getText().toString().equals("int edad;")) {
                puntos =puntos+ 1;
            }
            if (edtNombre.getText().toString().equals("String nombre;")) {
                puntos =puntos+ 1;
            }
            if (edtHambriento.getText().toString().equals("boolean hambriento;")) {
                puntos =puntos+ 1;
            }
            if (rbVacuna.isChecked()) {
                puntos =puntos+ 1;
            }
        Toast.makeText(ExcerciseOne.this, "Puntos " + puntos,
                Toast.LENGTH_SHORT).show();
        if (puntos == 5) {
            startActivity(new Intent(getApplicationContext(), MenuActivities.class));
        }
    }//metodo
}
