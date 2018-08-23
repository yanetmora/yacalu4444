package com.edu.utng.modernlogin;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.edu.utng.modernlogin.Model.Score;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Test extends AppCompatActivity implements View.OnClickListener {
   //Declarando de que tipo son las variables

    private RadioButton rbQuestion1;
    private RadioButton rbQuestion2;
    private RadioButton rbQuestion3;
    private RadioButton rbQuestion4;
    private RadioButton rbQuestion5;
    private RadioButton rbQuestion6;
    private RadioButton rbQuestion7;
    private RadioButton rbQuestion8;
    private RadioButton rbQuestion9;
    private Button btnResultados, btnContinue;

    private Dialog startDialog;
    private ImageView imvClose;
    private TextView txvTitle, txvMsg, txvPuntuation, txvName;

    public int scoreTest = 0;

    private FirebaseDatabase database;
    private DatabaseReference databaseReference;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        //haciendo referencia de la respuesta en el archivo xml con su id
        rbQuestion1 = (RadioButton) findViewById(R.id.rb_question_good1);
        rbQuestion1.setOnClickListener(this);

        rbQuestion2 = (RadioButton) findViewById(R.id.rb_question_good2);
        rbQuestion2.setOnClickListener(this);

        rbQuestion3 = (RadioButton) findViewById(R.id.rb_question_good3);
        rbQuestion3.setOnClickListener(this);

        rbQuestion4 = (RadioButton) findViewById(R.id.rb_question_good4);
        rbQuestion4.setOnClickListener(this);

        rbQuestion5 = (RadioButton) findViewById(R.id.rb_question_good5);
        rbQuestion5.setOnClickListener(this);

        rbQuestion6 = (RadioButton) findViewById(R.id.rb_question_good6);
        rbQuestion6.setOnClickListener(this);

        rbQuestion7 = (RadioButton) findViewById(R.id.rb_question_good7);
        rbQuestion7.setOnClickListener(this);

        rbQuestion8 = (RadioButton) findViewById(R.id.rb_question_good8);
        rbQuestion8.setOnClickListener(this);

        rbQuestion9 = (RadioButton) findViewById(R.id.rb_question_good9);
        rbQuestion9.setOnClickListener(this);


        firebaseAuth = FirebaseAuth.getInstance();




        btnResultados = (Button)findViewById(R.id.btn_resultado);



        startDialog = new Dialog(this);
        txvTitle = (TextView)findViewById(R.id.txv_title_exce);
        txvMsg = (TextView)findViewById(R.id.txv_msg_exce);









        btnResultados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTestDialog();

            }
        });

    }


    @Override
    public void onClick(View v) {

      /*  if(rbQuestion1.isChecked()){
            scoreTest = scoreTest + 1;
            Toast.makeText(Test.this,"puntos "+scoreTest,Toast.LENGTH_LONG).show();
        }*/

        switch (v.getId()) {
            case (R.id.rb_question_good1):
                scoreTest = scoreTest + 1;
               // Toast.makeText(Test.this, "puntos " + scoreTest, Toast.LENGTH_LONG).show();
                break;
            case (R.id.rb_question_good2):
                scoreTest = scoreTest + 1;
                //Toast.makeText(Test.this, "puntos " + scoreTest, Toast.LENGTH_LONG).show();
                break;
            case (R.id.rb_question_good3):
                scoreTest = scoreTest + 1;
                //Toast.makeText(Test.this, "puntos " + scoreTest, Toast.LENGTH_LONG).show();
                break;
            case (R.id.rb_question_good4):
                scoreTest = scoreTest + 1;
               // Toast.makeText(Test.this, "puntos " + scoreTest, Toast.LENGTH_LONG).show();
                break;
            case (R.id.rb_question_good5):
                scoreTest = scoreTest + 1;
                //Toast.makeText(Test.this, "puntos " + scoreTest, Toast.LENGTH_LONG).show();
                break;
            case (R.id.rb_question_good6):
                scoreTest = scoreTest + 1;
                //Toast.makeText(Test.this, "puntos " + scoreTest, Toast.LENGTH_LONG).show();
                break;
            case (R.id.rb_question_good7):
                scoreTest = scoreTest + 1;
                //Toast.makeText(Test.this, "puntos " + scoreTest, Toast.LENGTH_LONG).show();
                break;
            case (R.id.rb_question_good8):
                scoreTest = scoreTest + 1;
                //Toast.makeText(Test.this, "puntos " + scoreTest, Toast.LENGTH_LONG).show();
                break;
            case (R.id.rb_question_good9):
                scoreTest = scoreTest + 1;
                //Toast.makeText(Test.this, "puntos " + scoreTest, Toast.LENGTH_LONG).show();
                break;

        }

       // Toast.makeText(Test.this, " puntos " + scoreTest, Toast.LENGTH_LONG).show();

    }

    private void showTestDialog() {

        if(scoreTest >=7){

            startDialog.setContentView(R.layout.popup_excellent);
            imvClose = (ImageView)startDialog.findViewById(R.id.imv_close);
            txvTitle = (TextView)startDialog.findViewById(R.id.txv_title_exce);
            txvPuntuation = (TextView)startDialog.findViewById(R.id.txv_puntuation);
            btnContinue = (Button)startDialog.findViewById(R.id.btn_continue);

            txvPuntuation.setText(scoreTest + " points");



            imvClose.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startDialog.dismiss();
                }
            });


            btnContinue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    database = FirebaseDatabase.getInstance();
                    FirebaseUser currentUser = firebaseAuth.getCurrentUser();

                    databaseReference = database.getReference("score");
                    databaseReference.push().setValue(new Score(currentUser.getEmail().toString(), txvPuntuation.getText().toString()));
                    progressDialog.dismiss();


                }

            });




            startDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            startDialog.show();


        }
        if(scoreTest <=6){
            startDialog.setContentView(R.layout.popup_good);
            imvClose = (ImageView)startDialog.findViewById(R.id.imv_close);
            txvTitle = (TextView)startDialog.findViewById(R.id.txv_title);
            txvPuntuation = (TextView)startDialog.findViewById(R.id.txv_puntuation);


            txvPuntuation.setText(scoreTest + " points");

            imvClose.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startDialog.dismiss();
                }
            });

            startDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            startDialog.show();
        }
        if(scoreTest <3){
            startDialog.setContentView(R.layout.popup_fail);
            imvClose = (ImageView)startDialog.findViewById(R.id.imv_close);
            txvTitle = (TextView)startDialog.findViewById(R.id.txv_title);
            txvPuntuation = (TextView)startDialog.findViewById(R.id.txv_puntuation);

            txvPuntuation.setText(scoreTest + " points");

            imvClose.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startDialog.dismiss();
                }
            });

            startDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            startDialog.show();
        }



    }
}


