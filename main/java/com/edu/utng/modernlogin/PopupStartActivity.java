package com.edu.utng.modernlogin;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PopupStartActivity extends AppCompatActivity {
   // private Dialog startDialog;
   // private ImageView imvClose;
   // private TextView txvTitle;
   // private Button btnScratch, btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_start);

      //  startDialog = new Dialog(this);
       // imvClose = (ImageView)findViewById(R.id.imv_close);
       // txvTitle = (TextView)findViewById(R.id.txv_title);
       // btnScratch = (Button)findViewById(R.id.btn_scratch);
       // btnStart = (Button)findViewById(R.id.btn_start);

       /* btnScratch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MenuActivities.class);
                startActivity(intent);
            }
        });

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "esta pantalla lleva al test", Toast.LENGTH_LONG).show();
                //Intent intent = new Intent(getApplicationContext(), MenuActivities.class);
                //startActivity(intent);

            }
        });

        imvClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDialog.dismiss();
            }
        });



*/
    }
}

