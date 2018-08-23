package com.edu.utng.modernlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SubmenuExpression extends AppCompatActivity implements View.OnClickListener{
    private TextView txtTPOperarador;
    private TextView txtJerarquia;
    private TextView txtEjercicios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submenu_expression);
        txtTPOperarador=findViewById(R.id.txt_tpoperadores);
        txtJerarquia=findViewById(R.id.txt_jeraquia);
        txtEjercicios=findViewById(R.id.txt_ejercicios_practicos_expresiones);
        txtTPOperarador.setOnClickListener(this);
        txtJerarquia.setOnClickListener(this);
        txtEjercicios.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.txt_tpoperadores):
                startActivity(new Intent(getApplicationContext(),TypeOperator.class));
                break;
            case (R.id.txt_jeraquia):
                startActivity(new Intent(getApplicationContext(), HierarchyOperator.class));
                break;
            case (R.id.txt_ejercicios_practicos_expresiones):
                startActivity(new Intent(getApplicationContext(), HOExercise.class));

                break;
        }
    }
}
