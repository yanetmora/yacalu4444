package com.edu.utng.modernlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SubmenuBasicConcepts extends AppCompatActivity implements View.OnClickListener{
    private TextView txtEPS;
    private TextView txtADF;
    private TextView txtTD;
    private TextView txtVC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submenu_basic_concepts);
        txtEPS=findViewById(R.id.txt_eps);
        txtADF=findViewById(R.id.txt_adf);
        txtTD=findViewById(R.id.txt_tpd);
        txtVC=findViewById(R.id.txt_vc);
        txtEPS.setOnClickListener(this);
        txtADF.setOnClickListener(this);
        txtTD.setOnClickListener(this);
        txtVC.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.txt_eps):
                startActivity(new Intent(getApplicationContext(),InputProceessAndOutputs.class));
                break;
            case (R.id.txt_adf):
                    startActivity(new Intent(getApplicationContext(), Algorithm.class));
                break;
            case (R.id.txt_tpd):
                    startActivity(new Intent(getApplicationContext(), DataType.class));

                break;
            case (R.id.txt_vc):
                    startActivity(new Intent(getApplicationContext(), VariableAndConstant.class));

                break;
        }
    }
}
