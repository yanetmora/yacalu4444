package com.edu.utng.modernlogin;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

public class Celular extends AppCompatActivity {
    EditText edtNombreCelular;
    EditText edtTMarca;
    EditText edtNombreMarca;
    EditText edtTPixel;
    EditText edtNombrePixel;
    EditText edtTSistema;
    EditText edtNombreSistema;
    EditText edtGetMarca;
    EditText edtSeTMarca;
    EditText edtSetPixel;
    EditText edtGeTPixel;
    EditText edtSetSistema;
    EditText edtGeTSistema;
    MediaPlayer correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celular);
        correct= MediaPlayer.create(getApplicationContext(),R.raw.correcto);
        edtNombreCelular=findViewById(R.id.txt_nombre_celular);
        edtTMarca=findViewById(R.id.txt_tipo_marcac);
        edtNombreMarca=findViewById(R.id.txt_nombre_marcac);
        edtTPixel=findViewById(R.id.txt_tipo_pixeles);
        edtNombrePixel=findViewById(R.id.txt_nombre_pixeles);
        edtTSistema=findViewById(R.id.txt_tipo_sistema);
        edtNombreSistema=findViewById(R.id.txt_nombre_sistema);
        edtGetMarca=findViewById(R.id.txt_tipo_gmarcac);
        edtSeTMarca=findViewById(R.id.txt_setter_marcac);
        edtGeTPixel=findViewById(R.id.txt_tipo_gpixel);
        edtSetPixel=findViewById(R.id.txt_setter_pixel);
        edtGeTSistema=findViewById(R.id.txt_tipo_gsistema);
        edtSetSistema=findViewById(R.id.txt_setter_so);

        edtSetSistema.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtSetSistema.getText().toString().equals("String")) {
                    Toast.makeText(Celular.this, "Correcto! ",
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

        edtGeTSistema.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtGeTSistema.getText().toString().equals("String")) {
                    Toast.makeText(Celular.this, "Correcto! ",
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
        edtSetPixel.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtSetPixel.getText().toString().equals("String")) {
                    Toast.makeText(Celular.this, "Correcto! ",
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

        edtGeTPixel.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtTPixel.getText().toString().equals("String")) {
                    Toast.makeText(Celular.this, "Correcto! ",
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
        edtSeTMarca.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtSeTMarca.getText().toString().equals("String")) {
                    Toast.makeText(Celular.this, "Correcto! ",
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
        edtGetMarca.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtGetMarca.getText().toString().equals("String")) {
                    Toast.makeText(Celular.this, "Correcto! ",
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
        edtNombreSistema.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtNombreSistema.getText().toString().equals("sistema")) {
                    Toast.makeText(Celular.this, "Correcto! ",
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
        edtTSistema.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtTSistema.getText().toString().equals("String")) {
                    Toast.makeText(Celular.this, "Correcto! ",
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

        edtNombrePixel.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtNombrePixel.getText().toString().equals("pixel")) {
                    Toast.makeText(Celular.this, "Correcto! ",
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

        edtTPixel.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtTPixel.getText().toString().equals("double")) {
                    Toast.makeText(Celular.this, "Correcto! ",
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
        edtNombreMarca.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtNombreMarca.getText().toString().equals("marca")) {
                    Toast.makeText(Celular.this, "Correcto! ",
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
        edtTMarca.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtTMarca.getText().toString().equals("String")) {
                    Toast.makeText(Celular.this, "Correcto! ",
                            Toast.LENGTH_SHORT).show();
                    correct.start();
                }else{
                  /*  Toast.makeText(ExerciseDataType.this, "Incorrecto! ",
                            Toast.LENGTH_SHORT).show();*/
                }

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        edtNombreCelular.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(edtNombreCelular.getText().toString().equals("Celular ()")) {
                    Toast.makeText(Celular.this, "Correcto! ",
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
