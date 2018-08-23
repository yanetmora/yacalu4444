package com.edu.utng.modernlogin;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class SplashSoupActivity extends AppCompatActivity {
    private ImageView ivLogo;
    private TextView txvBeginners;
    private GifImageView givLoad;

    private static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_soup);
       ivLogo = (ImageView)findViewById(R.id.imv_logo);
        txvBeginners = (TextView)findViewById(R.id.txv_beginners);
        givLoad = (GifImageView)findViewById(R.id.giv_load);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition);
        ivLogo.startAnimation(myanim);
        txvBeginners.startAnimation(myanim);
        givLoad.startAnimation(myanim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(), OneActivity.class);
                startActivity(i);
                finish();
            }


        }, SPLASH_TIME_OUT);
    }
}
