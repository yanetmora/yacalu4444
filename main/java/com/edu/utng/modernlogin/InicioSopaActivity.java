package com.edu.utng.modernlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;


import java.util.ArrayList;

/**
 * Author: Desarrollo-PC
 */

public class InicioSopaActivity extends AppCompatActivity {

    protected Button btnJugar;
    public GridView itemListFechas;
    public GridView itemListPuntos;

    public ArrayAdapter<String> Adapter;
    public JocDbHelper jDB = new JocDbHelper(this);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sopa);

        itemListPuntos = (GridView) findViewById(R.id.itemListPuntos);
        ArrayList punts = (ArrayList) jDB.getDataPuntuacio()[1];

        itemListFechas = (GridView) findViewById(R.id.itemListFechas);
        ArrayList datas = (ArrayList) jDB.getDataPuntuacio()[0];

        Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datas);

        itemListFechas.setAdapter(Adapter);
        itemListPuntos.setAdapter(new ArrayAdapter<Integer>(
                this, android.R.layout.simple_list_item_1, punts));


        btnJugar = (Button) findViewById(R.id.btnJugar); //Link button in view with event
        btnJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMain = new Intent(view.getContext(), InicioJuegoSopaActivity.class);
                startActivity(intentMain);
            }
        });
        //418 131 3638


    }

}