package com.edu.utng.modernlogin;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class ExerciseDataType extends AppCompatActivity implements View.OnClickListener{
    EditText edtTNombre;
    EditText edtTEdad;
    EditText edtTPeso;
    EditText edtNombre;
    EditText edtEdad;
    EditText edtPeso;
    EditText edtTFecha;
    EditText edtTCantidad;
    EditText edtTVerdadero;
    RadioButton rbCierto;
    RadioButton rbDouble;
    MediaPlayer correct;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_data_type);
        edtTNombre=findViewById(R.id.txt_tipo_nombre);
        edtTEdad=findViewById(R.id.txt_tipo_edad);
        edtTPeso=findViewById(R.id.txt_tipo_peso);
        edtNombre=findViewById(R.id.txt_nombre_nombre);
        edtEdad=findViewById(R.id.txt_nombre_edad);
        edtPeso=findViewById(R.id.txt_nombre_peso);
        edtTFecha=findViewById(R.id.txt_tipo_fecha);
        edtTCantidad=findViewById(R.id.txt_tipo_cantidad);
        edtTVerdadero=findViewById(R.id.txt_tipo_verdadero);
        rbCierto=findViewById(R.id.rb_cierto);
        rbDouble=findViewById(R.id.rb_double);
        correct= MediaPlayer.create(getApplicationContext(),R.raw.correcto);

        edtTNombre.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtTNombre.getText().toString().equals("String")) {
                    Toast.makeText(ExerciseDataType.this, "Correcto! ",
                            Toast.LENGTH_SHORT).show();
                    correct.start();
                }else{
                  /*  Toast.makeText(ExerciseDataType.this, "Incorrecto! ",
                            Toast.LENGTH_SHORT).show();*/
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edtTEdad.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtTEdad.getText().toString().equals("int")) {
                    Toast.makeText(ExerciseDataType.this, "Correcto! ",
                            Toast.LENGTH_SHORT).show();
                    correct.start();
                }else{
                   /* Toast.makeText(ExerciseDataType.this, "Incorrecto! ",
                            Toast.LENGTH_SHORT).show();*/
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });edtTPeso.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtTPeso.getText().toString().equals("double")) {
                    Toast.makeText(ExerciseDataType.this, "Correcto! ",
                            Toast.LENGTH_SHORT).show();
                    correct.start();
                }else{
                  /*  Toast.makeText(ExerciseDataType.this, "Incorrecto! ",
                            Toast.LENGTH_SHORT).show();*/
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edtTFecha.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtTFecha.getText().toString().equals("Date")) {
                    Toast.makeText(ExerciseDataType.this, "Correcto! ",
                            Toast.LENGTH_SHORT).show();
                    correct.start();
                }else{
                    /*Toast.makeText(ExerciseDataType.this, "Incorrecto! ",
                            Toast.LENGTH_SHORT).show();*/
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edtTCantidad.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtTCantidad.getText().toString().equals("double")) {
                    Toast.makeText(ExerciseDataType.this, "Correcto! ",
                            Toast.LENGTH_SHORT).show();
                    correct.start();
                }else{
                   /* Toast.makeText(ExerciseDataType.this, "Incorrecto! ",
                            Toast.LENGTH_SHORT).show();*/
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edtTVerdadero.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtTVerdadero.getText().toString().equals("boolean")) {
                    Toast.makeText(ExerciseDataType.this, "Correcto! ",
                            Toast.LENGTH_SHORT).show();
                    correct.start();
                }else{
                    /*Toast.makeText(ExerciseDataType.this, "Incorrecto! ",
                            Toast.LENGTH_SHORT).show();*/
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        //cambio nombres
        edtNombre.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtNombre.getText().toString().equals("nombre;")) {
                    Toast.makeText(ExerciseDataType.this, "Correcto! ",
                            Toast.LENGTH_SHORT).show();
                    correct.start();
                }else{
                   /* Toast.makeText(ExerciseDataType.this, "Incorrecto! ",
                            Toast.LENGTH_SHORT).show();*/
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edtEdad.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtEdad.getText().toString().equals("edad;")) {
                    Toast.makeText(ExerciseDataType.this, "Correcto! ",
                            Toast.LENGTH_SHORT).show();
                    correct.start();
                }else{
                    /*Toast.makeText(ExerciseDataType.this, "Incorrecto! ",
                            Toast.LENGTH_SHORT).show();*/
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edtPeso.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtPeso.getText().toString().equals("peso;")) {
                    Toast.makeText(ExerciseDataType.this, "Correcto! ",
                            Toast.LENGTH_SHORT).show();
                    correct.start();
                }else{
                   /* Toast.makeText(ExerciseDataType.this, "Incorrecto! ",
                            Toast.LENGTH_SHORT).show();*/
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    @Override
    public void onClick(View view) {
        //edtTNombre.onCheckIsTextEditor()
        if(rbCierto.isChecked()){
            Toast.makeText(ExerciseDataType.this, "Correcto! ",
                    Toast.LENGTH_SHORT).show();
            correct.start();
        }
        if(rbDouble.isChecked()){
            Toast.makeText(ExerciseDataType.this, "Correcto! ",
                    Toast.LENGTH_SHORT).show();
            correct.start();
        }

    }
}
