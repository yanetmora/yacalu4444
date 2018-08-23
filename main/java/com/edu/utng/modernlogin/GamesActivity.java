package com.edu.utng.modernlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class GamesActivity extends AppCompatActivity {
    private ImageView imvPlayAhorcado;
    private ImageView imvPlaySopa;
    private ImageView imvPlayMemo;
    private ImageView imvGaleria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);

        imvPlayAhorcado = findViewById(R.id.imv_ahorcado);
        imvPlaySopa = findViewById(R.id.imv_sopa);
        imvPlayMemo = findViewById(R.id.imv_memo);
        imvGaleria = findViewById(R.id.imv_galeria);

        imvPlayAhorcado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(getApplicationContext(), AhorcadoActivity.class);
                startActivity(intent);
            }
        });

        imvPlaySopa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), InicioSopaActivity.class);
                startActivity(intent);

            }
        });

        imvPlayMemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Memorama.class);
                startActivity(intent);
            }
        });
        imvGaleria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ImageGallery.class);
                startActivity(intent);
            }
        });


    }
}
