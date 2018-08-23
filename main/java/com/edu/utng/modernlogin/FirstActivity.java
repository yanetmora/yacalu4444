package com.edu.utng.modernlogin;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.edu.utng.modernlogin.Model.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;


public class FirstActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "login";
    private EditText edtEmail;
    private EditText edtPassword;
    private Button btnLogin;
    private Button btnRegister;
    private Button btnLearnMore;
    private FirebaseAuth firebaseAuth;
    //private FirebaseAuth.AuthStateListener mAuthListener;
    private ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        firebaseAuth = FirebaseAuth.getInstance();
        //Init Componenet
        initComponents();

        progressDialog = new ProgressDialog(this);

        btnRegister.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
        btnLearnMore.setOnClickListener(this);
    }
    


    private void initComponents() {
        edtEmail = (EditText)findViewById(R.id.edt_email);
        edtPassword = (EditText)findViewById(R.id.edt_password);
        btnLearnMore = (Button)findViewById(R.id.btn_learn_more);
        btnLogin = (Button)findViewById(R.id.btn_login);
        btnRegister = (Button)findViewById(R.id.btn_register);

    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.btn_register):
                startActivity(new Intent(getApplicationContext(),RegisterActivity.class));
                break;
            case (R.id.btn_login):
                loginUser();
                break;
            case (R.id.btn_learn_more):
                startActivity(new Intent(getApplicationContext(),SlideActivity.class));

        }



    }

    private void loginUser() {
        final String email = edtEmail.getText().toString().trim();
        String password = edtPassword.getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Email couldn´t be blank", Toast.LENGTH_LONG).show();
            return;
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Email couldn´t be blank", Toast.LENGTH_LONG).show();
            return;
        }
        progressDialog.setMessage("Authenticating user...Wait please...");
        progressDialog.show();

        //Loguin user
        firebaseAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(FirstActivity.this, "User: " + email + " logged successfully!!", Toast.LENGTH_LONG).show();
                            //Envia al splash
                            startActivity(new Intent(getApplicationContext(),SplashWelcome.class));


                        } else {
                            if(task.getException() instanceof FirebaseAuthUserCollisionException){//validating that user already exists
                                Toast.makeText(FirstActivity.this, "User not exists.", Toast.LENGTH_LONG).show();
                            }else{
                                Toast.makeText(FirstActivity.this, "User couldn´t be found.", Toast.LENGTH_LONG).show();
                            }

                        }
                        progressDialog.dismiss();
                    }
                });
    }

   @Override
   protected void onStart() {
        super.onStart();

        //Obtener el usuario actual
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        if(currentUser != null){
            startActivity(new Intent(getApplicationContext(),SplashWelcome.class));
        //    startActivity(new Intent(getApplicationContext(),WelcomeUserActivity.class)); //poner el splash
            finish();
        }
    }
}
