package com.edu.utng.modernlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Random;

public class MenuActivities extends AppCompatActivity implements View.OnClickListener{
    private ImageButton btnBasico;
    private ImageButton btnExpresiones;
    private ImageButton btnLogaritmos;
    private ImageButton btnPoo;
    private ImageButton btnPoo2;
    private ImageButton btnPoo3;
    private ImageButton btnPooGrafica;
    private ImageButton btnTest;
    Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_actividades);
        btnBasico=(findViewById(R.id.btnBasicos));
        btnBasico.setOnClickListener(this);
        btnExpresiones=(findViewById(R.id.btnExpresiones));
        btnExpresiones.setOnClickListener(this);
        btnLogaritmos=(findViewById(R.id.btnAlgoritmos));
        btnLogaritmos.setOnClickListener(this);
        btnPoo=(findViewById(R.id.btnPOO));
        btnPoo.setOnClickListener(this);
        /////escuchadores
        btnPoo2=(findViewById(R.id.btnPOO1));
        btnPoo2.setOnClickListener(this);
        btnPoo3=(findViewById(R.id.btnPOO2));
        btnPoo3.setOnClickListener(this);
        btnTest=(findViewById(R.id.btnTestM));
        btnTest.setOnClickListener(this);
        btnPooGrafica=(findViewById(R.id.btnPOO3));
        btnPooGrafica.setOnClickListener(this);
        LayoutInflater inflater = getLayoutInflater();
        inflater.inflate(R.layout.activity_menu_actividades, null);
    }

    @Override
    public void onClick(View view) {

        int n = r.nextInt(10 + 1);
        Toast.makeText(MenuActivities.this,"Calificacion "+n + " = " +8,
                Toast.LENGTH_SHORT).show();

        switch (view.getId()) {
            case (R.id.btnBasicos):
                startActivity(new Intent(getApplicationContext(),SubmenuBasicConcepts.class));
                break;
            case (R.id.btnExpresiones):
              //  if(n==8) {
                    btnExpresiones.setEnabled(false);
                    startActivity(new Intent(getApplicationContext(), SubmenuExpression.class));
                //}
                break;
            case (R.id.btnAlgoritmos):
                //if(n==8) {
                    btnLogaritmos.setEnabled(false);
                    startActivity(new Intent(getApplicationContext(), SubmenuAlgorithAndFlowchart.class));
                //}
                break;
            case (R.id.btnTestM):
                //if(n==8) {
                    btnPoo.setEnabled(false);
                    startActivity(new Intent(getApplicationContext(), QuizProgMethodologyActivity.class));//clase de lalo
                //}
                break;
            case (R.id.btnPOO):
                //if(n==8) {
                    btnPoo.setEnabled(false);
                    startActivity(new Intent(getApplicationContext(), SubmenuPoo.class));
                //}
                break;
            case (R.id.btnPOO1):
                //if(n==8) {
                    btnPoo.setEnabled(false);
                    startActivity(new Intent(getApplicationContext(), SubmenuPoo2.class));
                //}
                break;
            case (R.id.btnPOO2):
                //if(n==8) {
                    btnPoo.setEnabled(false);
                    startActivity(new Intent(getApplicationContext(), SubmenuPoo3.class));
                //}
                break;
            case (R.id.btnPOO3):
                //if(n==8) {
                    btnPoo.setEnabled(false);
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                //}
                break;
        }
    }
}
