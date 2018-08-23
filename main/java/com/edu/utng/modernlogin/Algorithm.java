package com.edu.utng.modernlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Algorithm extends AppCompatActivity implements View.OnClickListener{
    Button btnDiagrama;
    Button btnAlgoritmo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritmos);
        btnDiagrama=findViewById(R.id.btn_diagrama);
        btnDiagrama.setOnClickListener(this);
        btnAlgoritmo=findViewById(R.id.btn_algoritmo_practica);
        btnAlgoritmo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.btn_diagrama):
                startActivity(new Intent(getApplicationContext(), DragAndDrop.class));
                break;
            case (R.id.btn_algoritmo_practica):
                startActivity(new Intent(getApplicationContext(), DragAndDropAlgorithm.class));
                break;
           }

    }
}
