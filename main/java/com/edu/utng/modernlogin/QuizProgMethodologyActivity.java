package com.edu.utng.modernlogin;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.edu.utng.modernlogin.Model.Score;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class QuizProgMethodologyActivity extends AppCompatActivity implements View.OnClickListener{

    private RadioButton rbQuestion1;
    private RadioButton rbQuestion2;
    private RadioButton rbQuestion3;
    private RadioButton rbQuestion4;
    private RadioButton rbQuestion5;
    private RadioButton rbQuestion6;
    private RadioButton rbQuestion7;
    private RadioButton rbQuestion8;
    private RadioButton rbQuestion9;
    private RadioButton rbQuestion10;
    private Button btnResultados, btnContinue, btnAgain, btnScratch;
    private ProgressDialog progressDialog;

    private Dialog startDialog;
    private ImageView imvClose;
    private TextView txvTitle, txvMsg, txvPuntuation, txvName;

    public int scoreTest = 0;

    private FirebaseDatabase database;
    private DatabaseReference databaseReference;
    private FirebaseAuth firebaseAuth;
    private String user_id;
    private FirebaseFirestore firebaseFirestore;

    private RadioGroup rdg_color ,rdg_color_brown , rdg_color_brow, rdg_color_blue, rdg_color_blue2, rdg_color_bro, rdg_color_bro2,
            rdg_animal, rdg_animal2, rdg_color10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_prog_methodology);

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

        rbQuestion10 = (RadioButton) findViewById(R.id.rb_question_good10);
        rbQuestion10.setOnClickListener(this);


        rdg_color_brown = (RadioGroup)findViewById(R.id.rdg_color_brown);
        rdg_color_bro2 = (RadioGroup)findViewById(R.id.rdg_color_bro2);
        rdg_color = (RadioGroup)findViewById(R.id.rdg_color_brow);
        rdg_color_brow = (RadioGroup)findViewById(R.id.rdg_color_brown);
        rdg_animal = (RadioGroup)findViewById(R.id.rdg_animal);
        rdg_animal2 = (RadioGroup)findViewById(R.id.rdg_animal2);
        rdg_color_bro = (RadioGroup)findViewById(R.id.rdg_color_bro);
        rdg_color10 = (RadioGroup)findViewById(R.id.rdg_color10);
        rdg_color_blue = (RadioGroup)findViewById(R.id.rdg_color_blue);
        rdg_color_blue2 = (RadioGroup)findViewById(R.id.rdg_color_blue2);


        firebaseAuth = FirebaseAuth.getInstance();




        btnResultados = (Button)findViewById(R.id.btn_resultado);



        startDialog = new Dialog(this);
        txvTitle = (TextView)findViewById(R.id.txv_title_exce);
        txvMsg = (TextView)findViewById(R.id.txv_msg_exce);


        user_id = firebaseAuth.getCurrentUser().getUid();

        firebaseFirestore = FirebaseFirestore.getInstance();


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
            case (R.id.rb_question_good10):
                scoreTest = scoreTest + 1 ;
                //Toast.makeText(Test.this, "puntos " + scoreTest, Toast.LENGTH_LONG).show();
                break;

        }

        // Toast.makeText(Test.this, " puntos " + scoreTest, Toast.LENGTH_LONG).show();

    }

    private void showTestDialog() {

        if(scoreTest >=8){

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

                    databaseReference = database.getReference("scoreMetodologia");
                    databaseReference.push().setValue(new Score(currentUser.getEmail().toString(), txvPuntuation.getText().toString()));
                    startDialog.dismiss();


                }

            });




            startDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            startDialog.show();


        }
        if(scoreTest <=7){
            startDialog.setContentView(R.layout.popup_good);
            imvClose = (ImageView)startDialog.findViewById(R.id.imv_close);
            txvTitle = (TextView)startDialog.findViewById(R.id.txv_title);
            txvPuntuation = (TextView)startDialog.findViewById(R.id.txv_puntuation);
            btnAgain = (Button)startDialog.findViewById(R.id.btn_agains);
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

                                                   databaseReference = database.getReference("scoreMetodologia");
                                                   databaseReference.push().setValue(new Score(currentUser.getEmail().toString(), txvPuntuation.getText().toString()));
                                                   startDialog.dismiss();

                                               }
                                           });

            btnAgain.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startDialog.dismiss();
                    rdg_color.clearCheck();
                    rdg_color_brown.clearCheck();
                    rdg_color_brow.clearCheck();
                    rdg_color_blue.clearCheck();
                    rdg_color_blue2.clearCheck();
                    rdg_color_bro.clearCheck();
                    rdg_color_bro2.clearCheck();
                    rdg_animal.clearCheck();
                    rdg_animal2.clearCheck();
                    rdg_color10.clearCheck();
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
            btnScratch = (Button)startDialog.findViewById(R.id.btn_scratch);


            txvPuntuation.setText(scoreTest + " points");

            imvClose.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startDialog.dismiss();
                }
            });

            btnScratch.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), MenuActivities.class);
                    startActivity(intent);
                }
            });




            startDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            startDialog.show();
        }

    }

    }


