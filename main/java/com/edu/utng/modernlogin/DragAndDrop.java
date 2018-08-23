package com.edu.utng.modernlogin;

import android.content.ClipData;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DragAndDrop extends AppCompatActivity {
    LinearLayout targetProceso;
    LinearLayout targetInicioFin;
    LinearLayout targetImpresion;
    LinearLayout targetDesicion;
    LinearLayout targetEntradaDato;
    LinearLayout targetDesicionMultiple;
    LinearLayout targetDireccion;

    Button btOne;
    Button btTwo;
    Button btThree;
    Button btFour;
    Button btDireccion;
    Button btEntradaDato;
    Button btMultiple;

    MediaPlayer correct;


    TextView ivOne;
    TextView ivTwo;
    TextView ivThree;
    TextView ivFour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drag_and_drop);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        targetProceso = (LinearLayout) findViewById(R.id.target_proceso);
        targetInicioFin = (LinearLayout) findViewById(R.id.target_inicio_fin);
        targetImpresion = (LinearLayout) findViewById(R.id.target_impresion);
        targetDesicion = (LinearLayout) findViewById(R.id.target_decicion);
        targetDesicionMultiple = (LinearLayout) findViewById(R.id.target_decicion_multiple);
        targetEntradaDato = (LinearLayout) findViewById(R.id.target_entrada_dato);
        targetDireccion= (LinearLayout) findViewById(R.id.target_direccion);

        ivOne = (TextView) findViewById(R.id.iv_one);
        ivTwo = (TextView) findViewById(R.id.iv_two);
        ivThree = (TextView) findViewById(R.id.iv_three);
        ivFour = (TextView) findViewById(R.id.iv_four);

        btOne = (Button) findViewById(R.id.btn_impresion);
        btTwo = (Button) findViewById(R.id.btn_decision);
        btThree = (Button) findViewById(R.id.btn_proceso);
        btFour = (Button) findViewById(R.id.btn_inicio_fin);
        btDireccion = (Button) findViewById(R.id.btn_direccion);
        btEntradaDato = (Button) findViewById(R.id.btn_entrada_dato);
        btMultiple = (Button) findViewById(R.id.btn_multiple);


        targetProceso.setOnDragListener(dragListener);
        targetInicioFin.setOnDragListener(dragListener);
        targetImpresion.setOnDragListener(dragListener);
        targetDesicion.setOnDragListener(dragListener);
        targetDesicionMultiple.setOnDragListener(dragListener);
        targetEntradaDato.setOnDragListener(dragListener);
        targetDireccion.setOnDragListener(dragListener);

        btOne.setOnLongClickListener(longclickListener);
        btTwo.setOnLongClickListener(longclickListener);
        btThree.setOnLongClickListener(longclickListener);
        btFour.setOnLongClickListener(longclickListener);
        btDireccion.setOnLongClickListener(longclickListener);
        btEntradaDato.setOnLongClickListener(longclickListener);
        btMultiple.setOnLongClickListener(longclickListener);

        correct = MediaPlayer.create(getApplicationContext(), R.raw.correcto);

    }
    //
    View.OnLongClickListener longclickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            ClipData data = ClipData.newPlainText("", "");
            View.DragShadowBuilder myShadowBuilder = new View.DragShadowBuilder(v);
            v.startDrag(data, myShadowBuilder, v, 0);
            if (v.getId() == R.id.btn_impresion) {

            } else if (v.getId() == R.id.btn_decision) {

            } else if (v.getId() == R.id.btn_proceso) {

            } else if (v.getId() == R.id.btn_inicio_fin) {

            }else if (v.getId() == R.id.btn_direccion) {

            }else if (v.getId() == R.id.btn_entrada_dato) {

            }else if (v.getId() == R.id.btn_multiple) {

            }


            return true;
        }

    };


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

                    if (view.getId() == R.id.btn_impresion && v.getId() == R.id.target_impresion) {
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        //ivThree.setVisibility(View.GONE);
                        newParent.addView(view);
                        correct.start();
                        btOne.setFocusable(false);


                    } else if (view.getId() == R.id.btn_decision && v.getId() == R.id.target_decicion) {
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        //ivFour.setVisibility(View.GONE);
                        newParent.addView(view);
                        correct.start();
                        btTwo.setFocusable(false);
                    } else if (view.getId() == R.id.btn_proceso && v.getId() == R.id.target_proceso) {
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        //ivOne.setVisibility(View.GONE);
                        newParent.addView(view);
                        correct.start();
                        btThree.setFocusable(false);
                    } else if (view.getId() == R.id.btn_inicio_fin && v.getId() == R.id.target_inicio_fin) {
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        newParent.addView(view);
                        correct.start();
                        btFour.setFocusable(false);


                    } else if (view.getId() == R.id.btn_multiple && v.getId() == R.id.target_decicion_multiple) {
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        newParent.addView(view);
                        correct.start();
                        btMultiple.setFocusable(false);
                    } else if (view.getId() == R.id.btn_direccion && v.getId() == R.id.target_direccion) {
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        newParent.addView(view);
                        correct.start();
                        btDireccion.setFocusable(false);


                    } else if (view.getId() == R.id.btn_entrada_dato && v.getId() == R.id.target_entrada_dato) {
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        newParent.addView(view);
                        correct.start();
                        btEntradaDato.setFocusable(false);
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

}
