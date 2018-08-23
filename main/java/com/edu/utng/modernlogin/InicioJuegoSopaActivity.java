package com.edu.utng.modernlogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 * Author: Desarrollo-PC
 */
public class InicioJuegoSopaActivity extends AppCompatActivity {

    public Button btnGenerarSopa;
    public Button btnLimipar;
    public Button btnSalir;

    public GridView gvContenedor;//Grid de letras

    public String[] arrayPalabras;//lista de palabras de xml
    public ArrayList<String> palabras;

    public ArrayList<String> legenda;//Palabras que se muestran el gri

    public GridView gvPalabras; //lista de palabras
    public ArrayList<Palabra> listaPalabras;
    public static ArrayList<Palabra> palabrasCompletadas;

    public Integer puntuacion;
    public static ArrayList<Integer> letrasMarcadas;
    public String[] abc = new String[]
            {
                    "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                    "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
            };
    public ArrayAdapter<String> Adapter;

    JocDbHelper jDB;
    long idDatabase = 0;//ID PARTIDA

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_juego_sopa);

        String[] paraulesXML = getResources().getStringArray(R.array.palabras); //recupera de arrays.xml

        jDB = new JocDbHelper(this);//Obre acces a la base de dades SQL
        idDatabase = jDB.insertPuntuacio(new SimpleDateFormat("yyy/MM/dd HH:mm:ss").format(new Date()), 0);

        listaPalabras = new ArrayList<Palabra>();
        palabrasCompletadas = new ArrayList<Palabra>();

        palabras = new ArrayList<String>();//lista de palabras

        int sizeMots =29 ; //Establim la cuantitat de noms que agafa

        if (palabras.size() < sizeMots) { //si no hay suficientes nombres mete palabras del xml
            for (String p : paraulesXML) {
                if (palabras.size() < sizeMots) {
                    System.out.println("XML");
                    palabras.add(p);
                }
            }
        }


        int i = 0;


        //tauler sopa lletras
        gvContenedor = (GridView) findViewById(R.id.gvContenedor); //grid de lletres
        gvPalabras = (GridView) findViewById(R.id.gvPalabras); //grid paraules

        final ArrayList<Integer> letrasMarcadas = new ArrayList<>();
        btnLimipar = (Button) findViewById(R.id.btnLimpiar);
        btnGenerarSopa = (Button) findViewById(R.id.btnGenerarSopa);
        btnSalir = (Button) findViewById(R.id.btnFinalizar);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMain = new Intent(view.getContext(), InicioSopaActivity.class);
                startActivity(intentMain);
            }
        });
        btnGenerarSopa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateGridTauler();
            }
        });

        btnLimipar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.i("info", "reset");
                for (Integer item : letrasMarcadas) {
                    //System.out.println(item);
                    System.out.println();
                    gvContenedor.getChildAt(item).setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    for (Palabra pc : palabrasCompletadas) {
                        for (Palabra.Letra l : pc.letras) {
                            TextView tParaula = (TextView) gvContenedor.getChildAt(l.getPosicion());
                            tParaula.setTextColor(getResources().getColor(android.R.color.holo_red_light));
                        }
                    }

                }
                letrasMarcadas.clear();
            }
        });

        gvContenedor.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (letrasMarcadas.indexOf(position) < 0) { //si no esta marcada previamente
                    letrasMarcadas.add(position); //añadir a array de posiciones marcadas

                    //Log.i("info", parent.toString()+ view+ position+id  );
                    //Log.i("infoView", view.toString()  );
                    Log.i("infoPosition", String.valueOf(position));
                    Log.i("infoId", parent.getItemAtPosition(position).toString());

                    String result = Utilidades.comprovaPosicio(position, listaPalabras, letrasMarcadas, jDB, (int) idDatabase);

                    view.setBackgroundColor(getResources().getColor(android.R.color.tertiary_text_dark));


                    if (result == "Completada") {
                        System.out.println("paraula COMPLETADA");
                        // TODO marcar la palabra de abajo
                        // Todo sumar puntos
                        Palabra p = palabrasCompletadas.get(palabrasCompletadas.size() - 1);

                        TextView tParaula = (TextView) gvPalabras.getChildAt(p.getIndex());
                        tParaula.setTextColor(getResources().getColor(android.R.color.holo_red_light));
                        btnLimipar.callOnClick();

                        // Todo sumar puntos
                        Utilidades.sumaPuntos(p, palabrasCompletadas, jDB, (int) idDatabase);

                        Toast toast = Toast.makeText(getApplicationContext(), "Bien Hecho!", Toast.LENGTH_SHORT);
                        toast.show();
                    } else if(result == "Completada"){
                        System.out.println("repetida");
                        Toast toast = Toast.makeText(getApplicationContext(), "Palabra ya resuelta...", Toast.LENGTH_SHORT);
                        toast.show();

                    } else {
                        System.out.println("paraula No Completada");
                    }
                /*if (comprovaParaula(parent, letrasMarcadas)){
                    btReset.callOnClick();
                }*/
                } else {
                    view.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    System.out.println(position); //borrar a array de posiciones marcadas
                    System.out.println(letrasMarcadas.remove(letrasMarcadas.indexOf(position)));
                }
            }
        });
    }


    //GENERA el adapter y inserta en el gridview
    public void generateGridTauler() {
        btnGenerarSopa.setVisibility(View.GONE); // hide button generate
        String[] array = generaArrayLLetres2();
        Adapter = new ArrayAdapter<String>(this, R.layout.layout_sopa, array);
        gvContenedor.setAdapter(Adapter);

    }

    //GENERA un array DIFERENTS POSICIONS
    public String[] generaArrayLLetres2() {

        String[] result = new String[100];
        int x = 0, pos;
        Random rnd = new Random();
        legenda = new ArrayList<>();
        for (int i = 0; i < 100; i += 10) {
            pos = rnd.nextInt(palabras.size());
            String paraula = palabras.get(pos);
            Palabra p = new Palabra(paraula, i / 10);
            listaPalabras.add(i / 10, p);
            result = colocaLletra(result, paraula, i / 10);
            legenda.add(paraula);
            x++;
        }
        result = ompleForats(result);
        for (int i = 0; i < 100; i++) {
            System.out.println(result[i]);
        }

        //GENERA lista paraules grid inferior
        gvPalabras = (GridView) findViewById(R.id.gvPalabras);
        ArrayAdapter<String> AdapterParaules = new ArrayAdapter<String>(this, R.layout.layout_centered, legenda);
        gvPalabras.setAdapter(AdapterParaules);
        return result;
    }

    //OMPLE els espais en BLANC de l'array
    public String[] ompleForats(String[] array) {
        Random rnd = new Random();
        for (int x = 0; x < array.length; x++) {
            if (array[x] == null) {
                array[x] = Character.toString((char) (rnd.nextInt((90 - 65) + 1) + 65));
            }
        }
        return array;
    }

    //COLOCA les paraules ALEATORIAMENT
    public String[] colocaLletra(String[] array, String paraula, int index) {
        //int randomNum = rand.nextInt((max - min) + 1) + min;
        int n, allargada;
        String cadena = "";
        String[] fragments;
        Random rnd = new Random();
        boolean insert = false;
        Palabra.Letra l;

        do {
            n = rnd.nextInt((3 - 1) + 1) + 1;
            allargada = paraula.length() - 1;
            Log.i("pos", "" + n);
            outerswitch:
            switch (n) {
                //Horizontal
                case 1:
                    do {
                        n = rnd.nextInt((99) + 1);
                    } while ((n + allargada) > 99);

                    System.out.println("La n-----------------------> " + n);
                    System.out.println("La paraula-----------------> " + paraula);

                    for (int x = 0; x < paraula.length(); x++) {
                        if ((n + x) % 10 == 9 || array[n + x] != null) {
                            break outerswitch;
                        } else {
                            System.out.println("La n-----------------------> Sí");
                        }
                    }

                    fragments = paraula.split("(?!^)");
                    for (int x = 0; x < paraula.length(); x++) {
                        l = new Palabra.Letra();
                        array[x + n] = fragments[x];
                        l.setString(fragments[x]);
                        l.setPosicion(x + n);
                        listaPalabras.get(index).letras.add(l);
                    }
                    insert = true;
                    break;
                //Vertical
                case 2:
                    do {
                        n = rnd.nextInt((99) + 1);
                    } while (n + (allargada * 10) > 99);

                    System.out.println("La n-----------------------> " + n);
                    System.out.println("La paraula-----------------> " + paraula);

                    for (int x = 0; x < (paraula.length() * 10); x += 10) {
                        if ((n + x) % 10 == 9 || array[n + x] != null) {
                            break outerswitch;
                        } else {
                            System.out.println("La n-----------------------> Sí");
                        }
                    }
                    fragments = paraula.split("(?!^)");
                    for (int x = 0; x < paraula.length(); x++) {
                        l = new Palabra.Letra();
                        array[(x * 10) + n] = fragments[x];
                        l.setString(fragments[x]);
                        l.setPosicion((x * 10) + n);
                        listaPalabras.get(index).letras.add(l);
                    }
                    insert = true;
                    break;
                //Diagonal
                case 3:
                    do {
                        n = rnd.nextInt((99) + 1);
                    } while (n + (allargada * 11) > 99);

                    System.out.println("La n-----------------------> " + n);
                    System.out.println("La paraula-----------------> " + paraula);

                    for (int x = 0; x < (paraula.length() * 11); x += 11) {
                        if ((n + x) % 10 == 9 || array[n + x] != null) {
                            break outerswitch;
                        } else {
                            System.out.println("La n-----------------------> Sí " + paraula);
                        }
                    }
                    fragments = paraula.split("(?!^)");
                    for (int x = 0; x < paraula.length(); x++) {
                        l = new Palabra.Letra();
                        array[n + (x * 11)] = fragments[x];
                        l.setString(fragments[x]);
                        l.setPosicion(n + (x * 11));
                        listaPalabras.get(index).letras.add(l);
                    }
                    insert = true;
                    break;
            }
        } while (!insert);

        return array;
    }



}