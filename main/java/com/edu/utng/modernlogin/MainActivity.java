package com.edu.utng.modernlogin;


import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /// setContentView(R.layout.activity_main);


        ArrayList<BarEntry> entradas = new ArrayList<>();
        entradas.add(new BarEntry(2f, 0));
        entradas.add(new BarEntry(4f, 1));
        entradas.add(new BarEntry(6f, 2));
        entradas.add(new BarEntry(8f, 3));
        entradas.add(new BarEntry(10f, 4));
        entradas.add(new BarEntry(12f, 5));
        entradas.add(new BarEntry(14f, 6));
        entradas.add(new BarEntry(16f, 7));
        entradas.add(new BarEntry(18f, 8));
        BarDataSet dataset = new BarDataSet(entradas, "# de cursos");


        ArrayList<String> etiquetas = new ArrayList<String>();
        etiquetas.add("Jasmin");
        etiquetas.add("Aide");
        etiquetas.add("Leo");
        etiquetas.add("Eduarso");
        etiquetas.add("Francisco");
        etiquetas.add("Karla");
        etiquetas.add("David");
        etiquetas.add("Daniela");
        etiquetas.add("Felipe");


        dataset.setColors(ColorTemplate.COLORFUL_COLORS);

        BarChart grafica = new BarChart(getApplicationContext());

        setContentView(grafica);

        BarData datos = new BarData(etiquetas,dataset);
        grafica.setData(datos);

        grafica.setDescription("Numero de cursos que los alumnos an cursado");

        //Y
        grafica.animateY(5000);

        LimitLine linea = new LimitLine(22f);
        YAxis ejeY = grafica.getAxisLeft();
        ejeY.addLimitLine(linea);
    }

    private class ConsultarDatos extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... urls) {

            // params comes from the execute() call: params[0] is the url.
            try {
                return downloadUrl(urls[0]);
            } catch (IOException e) {
                return "Unable to retrieve web page. URL may be invalid.";
            }
        }
        // onPostExecute displays the results of the AsyncTask.
        @Override
        protected void onPostExecute(String result) {

            JSONArray ja = null;
            try {
                ja = new JSONArray(result);
                //etNombres.setText(ja.getString(1));


            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
    }


    private String downloadUrl(String myurl) throws IOException {
        Log.i("URL",""+myurl);
        myurl = myurl.replace(" ","%20");
        InputStream is = null;
        // Only display the first 500 characters of the retrieved
        // web page content.
        int len = 500;

        try {
            URL url = new URL(myurl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setReadTimeout(10000 /* milliseconds */);
            conn.setConnectTimeout(15000 /* milliseconds */);
            conn.setRequestMethod("GET");
            conn.setDoInput(true);
            // Starts the query
            conn.connect();
            int response = conn.getResponseCode();
            Log.d("respuesta", "The response is: " + response);
            is = conn.getInputStream();

            // Convert the InputStream into a string
            String contentAsString = readIt(is, len);
            return contentAsString;

            // Makes sure that the InputStream is closed after the app is
            // finished using it.
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }

    public String readIt(InputStream stream, int len) throws IOException, UnsupportedEncodingException {
        Reader reader = null;
        reader = new InputStreamReader(stream, "UTF-8");
        char[] buffer = new char[len];
        reader.read(buffer);
        return new String(buffer);
    }
}



