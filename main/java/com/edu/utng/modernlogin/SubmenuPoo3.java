package com.edu.utng.modernlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SubmenuPoo3 extends AppCompatActivity implements View.OnClickListener{
    TextView txtPatronDiseño;
    TextView txtTiposPatrones;
    TextView txtEjerciciosP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submenu_poo3);
        txtPatronDiseño=findViewById(R.id.txt_patrones_diseño);
        txtTiposPatrones=findViewById(R.id.txt_tipo_patrones);
        txtEjerciciosP=findViewById(R.id.txt_ejercicios_patrones);
        //escuchadore
        txtPatronDiseño.setOnClickListener(this);
        txtTiposPatrones.setOnClickListener(this);
        txtEjerciciosP.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case (R.id.txt_patrones_diseño):
                startActivity(new Intent(getApplicationContext(),PatronDesig.class));
                break;
            case (R.id.txt_tipo_patrones):
                startActivity(new Intent(getApplicationContext(), TypePatron.class));
                break;
            case (R.id.txt_ejercicios_patrones):
                startActivity(new Intent(getApplicationContext(), ExcerciseTwo.class));

                break;
        }

    }
}
