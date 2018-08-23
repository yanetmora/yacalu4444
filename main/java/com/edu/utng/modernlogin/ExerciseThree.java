package com.edu.utng.modernlogin;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

public class ExerciseThree extends AppCompatActivity {
    EditText edtNombreCasa;
    EditText edtTNoCuart;
    EditText edtNombreCuarto;
    EditText edtTColor;
    EditText edtNombreColor;
    EditText edtTmaterial;
    EditText edtNombreMaterial;
    EditText edtGetCuarto;
    EditText edtSeTCuarto;
    EditText edtSetColor;
    EditText edtGeTColor;
    EditText edtSetMaterial;
    EditText edtGeTmaterial;
    MediaPlayer correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exersice_three);
        correct= MediaPlayer.create(getApplicationContext(),R.raw.correcto);
        edtNombreCasa=findViewById(R.id.txt_name_house);
        edtTNoCuart=findViewById(R.id.txt_numero_cuartos);
        edtNombreCuarto=findViewById(R.id.txt_nombre_cuarto);
        edtNombreColor=findViewById(R.id.txt_nombre_color);
        edtTColor=findViewById(R.id.txt_tipo_color);
        edtTmaterial=findViewById(R.id.txt_tipo_material);
        edtNombreMaterial=findViewById(R.id.txt_nombre_material);
        edtSeTCuarto=findViewById(R.id.txt_setter_cuarto);
        edtGetCuarto=findViewById(R.id.txt_tipo_gcuarto);
        edtSetColor=findViewById(R.id.txt_setter_color);
        edtGeTColor=findViewById(R.id.txt_tipo_gcolor);
        edtSetMaterial=findViewById(R.id.txt_setter_material);
        edtGeTmaterial=findViewById(R.id.txt_tipo_gmaterial);
        edtGeTmaterial.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtGeTmaterial.getText().toString().equals("String")) {
                    Toast.makeText(ExerciseThree.this, "Correcto! ",
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
        edtSetMaterial.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtSetMaterial.getText().toString().equals("String")) {
                    Toast.makeText(ExerciseThree.this, "Correcto! ",
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

        edtGeTColor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtGeTColor.getText().toString().equals("String")) {
                    Toast.makeText(ExerciseThree.this, "Correcto! ",
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
        edtSetColor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtSetColor.getText().toString().equals("String")) {
                    Toast.makeText(ExerciseThree.this, "Correcto! ",
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

        edtGetCuarto.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtGetCuarto.getText().toString().equals("int")) {
                    Toast.makeText(ExerciseThree.this, "Correcto! ",
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

        edtSeTCuarto.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtSeTCuarto.getText().toString().equals("int")) {
                    Toast.makeText(ExerciseThree.this, "Correcto! ",
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
        edtNombreMaterial.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtNombreMaterial.getText().toString().equals("material")) {
                    Toast.makeText(ExerciseThree.this, "Correcto! ",
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

        edtTmaterial.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtTColor.getText().toString().equals("String")) {
                    Toast.makeText(ExerciseThree.this, "Correcto! ",
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
        edtTColor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtTColor.getText().toString().equals("String")) {
                    Toast.makeText(ExerciseThree.this, "Correcto! ",
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
        edtNombreColor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtNombreColor.getText().toString().equals("color")) {
                    Toast.makeText(ExerciseThree.this, "Correcto! ",
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
        edtNombreCuarto.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtNombreCuarto.getText().toString().equals("noCuarto")) {
                    Toast.makeText(ExerciseThree.this, "Correcto! ",
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
        edtTNoCuart.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtTNoCuart.getText().toString().equals("int")) {
                    Toast.makeText(ExerciseThree.this, "Correcto! ",
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
        edtNombreCasa.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtNombreCasa.getText().toString().equals("Casa ()")) {
                    Toast.makeText(ExerciseThree.this, "Correcto! ",
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
    }
}
