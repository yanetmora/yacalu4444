package com.edu.utng.modernlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DataType extends AppCompatActivity implements OnClickListener {
    Button btnTipoDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_type);
        btnTipoDatos=findViewById(R.id.btn_practica_tpd);
        btnTipoDatos.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (btnTipoDatos.isClickable()){
            startActivity(new Intent(getApplicationContext(), ExerciseDataType.class));
        }

    }
}
