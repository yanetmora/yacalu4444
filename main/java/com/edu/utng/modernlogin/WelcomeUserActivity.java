package com.edu.utng.modernlogin;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class WelcomeUserActivity extends AppCompatActivity {

private Button btnTest, btnLogout, btnScratch, btnStart;
private FloatingActionButton fabForum;
private FloatingActionButton fabAbout;
private FloatingActionButton fabSettings;
private FloatingActionButton fabLibrary;
private FloatingActionButton fabGithub;
private FirebaseAuth firebaseUser;
private Dialog startDialog;
private ImageView imvClose;
private TextView txvTitle;
//public EditText edt_nickname;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_user);


        btnLogout = (findViewById(R.id.btn_logout));
        fabForum = (findViewById(R.id.fab_forum));
        fabAbout = (findViewById(R.id.fab_about));
        fabSettings = (findViewById(R.id.fab_setting));
        fabLibrary = (findViewById(R.id.fab_library));
        fabGithub = (findViewById(R.id.fab_github));
        firebaseUser = FirebaseAuth.getInstance();
        startDialog = new Dialog(this);
        btnTest = (findViewById(R.id.btn_test));
      //  edt_nickname = (findViewById(R.id.edt_nickname));







        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //    Intent intent = new Intent(getApplicationContext(), PopupStartActivity.class);
              //  startActivity(intent);
                    showStartDialog();
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {

                firebaseUser.signOut();
                Intent intent = new Intent(getApplicationContext(), FirstActivity.class);
                startActivity(intent);


            }
        });
        fabLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SplashChatActivity.class);
                startActivity(intent);
            }
        });



        fabForum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // final String nickname = edt_nickname.getText().toString().trim();
                // Toast.makeText(WelcomeUserActivity.this, "Este boton envia al foto", Toast.LENGTH_LONG).show();
                //Send the nickname to the other activity
                Intent intent = new Intent(getApplicationContext(), SplashChatActivity.class);
               // intent.putExtra("nickname", nickname);
                startActivity(intent);
            }
        });

        fabAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), About.class);
                startActivity(intent);
            }
        });
        fabGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(getApplicationContext(), GamesActivity.class);
               startActivity(intent);

            }
        });
        fabSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BlogActivity.class);
                startActivity(intent);
            }
        });





    }
    public void showStartDialog() {
        startDialog.setContentView(R.layout.popup_start);
        imvClose = (ImageView)startDialog.findViewById(R.id.imv_close);
        txvTitle = (TextView)startDialog.findViewById(R.id.txv_title);
        btnScratch = (Button)startDialog.findViewById(R.id.btn_scratch);
        btnStart = (Button)startDialog.findViewById(R.id.btn_start);

        btnScratch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MenuActivities.class);
                startActivity(intent);
            }
        });

       btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Test.class);
                startActivity(intent);

            }
        });

        imvClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDialog.dismiss();
            }
        });

        startDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        startDialog.show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
        DatabaseReference databaseReference = ref.child("score");

    }
}
