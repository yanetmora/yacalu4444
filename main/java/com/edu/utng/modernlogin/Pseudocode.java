package com.edu.utng.modernlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pseudocode extends AppCompatActivity implements View.OnClickListener{
    private Button btnPseudocodigo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pseudocode);
        btnPseudocodigo=findViewById(R.id.btn_pseudocodigo);
        btnPseudocodigo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (btnPseudocodigo.isClickable()){
            startActivity(new Intent(getApplicationContext(),Pseudocode.class));//falta implementar una clase de practica
        }


    }
}
