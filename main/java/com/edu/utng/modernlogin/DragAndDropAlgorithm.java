package com.edu.utng.modernlogin;

import android.content.ClipData;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DragAndDropAlgorithm extends AppCompatActivity {
    LinearLayout targetBase;
    LinearLayout targetAltura;
    LinearLayout targetMultiplicacion;
    LinearLayout targetMostrar;
    Button btBase;
    Button btAltura;
    Button btMultiplicacion;
    Button btMostrar;
    TextView ivOne;
    TextView ivTwo;
    TextView ivThree;
    TextView ivFour;
    MediaPlayer correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_darg_and_drop_algorithm);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        targetBase = findViewById(R.id.target_base);
        targetAltura= findViewById(R.id.target_altura);
        targetMultiplicacion =  findViewById(R.id.target_multiplicacion);
        targetMostrar = findViewById(R.id.target_mostrar);
        btBase=findViewById(R.id.btn_base);
        btAltura=findViewById(R.id.btn_altura);
        btMultiplicacion=findViewById(R.id.btn_multuplicar);
        btMostrar=findViewById(R.id.btn_mostrar);
        ivOne=findViewById(R.id.txt_paso_uno);
        ivTwo=findViewById(R.id.txt_paso_dos);
        ivThree=findViewById(R.id.txt_paso_tres);
        ivFour=findViewById(R.id.txt_paso_cuatro);

        targetBase.setOnDragListener(dragListener);
        btBase.setOnLongClickListener(longclickListener);
        targetAltura.setOnDragListener(dragListener);
        btAltura.setOnLongClickListener(longclickListener);
        targetMultiplicacion.setOnDragListener(dragListener);
        btMultiplicacion.setOnLongClickListener(longclickListener);
        targetMostrar.setOnDragListener(dragListener);
        btMostrar.setOnLongClickListener(longclickListener);
        correct = MediaPlayer.create(getApplicationContext(), R.raw.correcto);
    }

    View.OnDragListener dragListener = new View.OnDragListener() {

        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();

            final View view = (View) event.getLocalState();


            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:

                    if (view.getId() == R.id.btn_base && v.getId() == R.id.target_base) {
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        //ivThree.setVisibility(View.GONE);
                        newParent.addView(view);
                        correct.start();
                        btBase.setFocusable(false);


                    } else if (view.getId() == R.id.btn_altura && v.getId() == R.id.target_altura) {
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        //ivFour.setVisibility(View.GONE);
                        newParent.addView(view);
                        correct.start();
                        btAltura.setFocusable(false);
                    } else if (view.getId() == R.id.btn_multuplicar && v.getId() == R.id.target_multiplicacion) {
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        //ivOne.setVisibility(View.GONE);
                        newParent.addView(view);
                        correct.start();
                        btMultiplicacion.setFocusable(false);
                    } else if (view.getId() == R.id.btn_mostrar && v.getId() == R.id.target_mostrar) {
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        newParent.addView(view);
                        correct.start();
                        btMostrar.setFocusable(false);


                    }
                    else {
                       /* MediaPlayer media = MediaPlayer.create(getApplicationContext(), R.raw.correcto);
                        media.start();*/
                    }


                    break;

            }

            return true;
        }
    };
    View.OnLongClickListener longclickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            ClipData data = ClipData.newPlainText("", "");
            View.DragShadowBuilder myShadowBuilder = new View.DragShadowBuilder(v);
            v.startDrag(data, myShadowBuilder, v, 0);
            if (v.getId() == R.id.btn_base) {

            } else if (v.getId() == R.id.btn_altura) {

            } else if (v.getId() == R.id.btn_multuplicar) {

            } else if (v.getId() == R.id.btn_mostrar) {

            }
            return true;
        }

    };
}
