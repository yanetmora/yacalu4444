package com.edu.utng.modernlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SubmenuAlgorithAndFlowchart extends AppCompatActivity implements View.OnClickListener{
    private TextView txtSeudocodigo;
    private TextView txtContadores;
    private TextView txtSecuencia;
    private TextView txtCiclos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submenu_algorith_and_flowchart);
        txtSeudocodigo=findViewById(R.id.txt_seudocodico);
        txtContadores=findViewById(R.id.txt_contador_acumulador);
        txtSecuencia=findViewById(R.id.txt_control_secuencia);
        txtCiclos=findViewById(R.id.txt_ciclos);

        txtSeudocodigo.setOnClickListener(this);
        txtContadores.setOnClickListener(this);
        txtSecuencia.setOnClickListener(this);
        txtCiclos.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.txt_seudocodico):
                startActivity(new Intent(getApplicationContext(),Pseudocode.class));
                break;
            case (R.id.txt_control_secuencia):
                startActivity(new Intent(getApplicationContext(), SeuqenceControl.class));
                break;
            case (R.id.txt_contador_acumulador):
                startActivity(new Intent(getApplicationContext(), CounterAndAccumulator.class));

                break;
            case (R.id.txt_ciclos):
                startActivity(new Intent(getApplicationContext(), Cycle.class));

                break;
        }
    }
}
