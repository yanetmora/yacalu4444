package com.edu.utng.modernlogin;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;


public class BibliotecaActivity extends AppCompatActivity {

    ArrayList<Book>listaLibros;
    RecyclerView recyclerLibro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biblioteca);
        construirRecycler();

    }//end onCreate

    public  void llenarLibro(){
        listaLibros.add(
                new Book("METODOLOGIA DE LA PROGRAMACION: ALGORITMOS, DIAGRAMAS DE FLUJO Y PROGRAMAS (3ª ED.)",
                        "Podemos enseñar a analizar un problema? %A8podemos enseñar a razonar flexiblemente?" +
                                " La podemos enseñar a pensar? Las respuestas no son fáciles, y es que enseñar a un" +
                                " alumno a resolver un problema desde distintos ángulos y a proponer diversas alternativas" +
                                " es una tarea ardua. Esta es una obra para aprender paso a paso y en su esencia la metodología" +
                                " de la programación, es la reunión de dos volúmenes publicados anteriormente en esta misma editorial," +
                                " totalmente renovada con nuevos problemas y soluciones, así como novedosos componentes que permiten" +
                                " una mejor comprensión, claridad y aplicación de los conceptos estudiados. El lenguaje empleado para" +
                                " mostrar la solución de un problema es pseudocódigo de alto nivel, una característica fundamental para" +
                                " que el alumno entienda las estructuras de datos y algoritmos asociados, sin la necesidad de utilizar " +
                                "un lenguaje de programación en particular.", R.drawable.image1,
                        "https://latam.casadellibro.com/libro-metodologia-de-la-programacion-algoritmos-diagramas-de-flujo-y-programas-3-ed/9789701511008/1187925"));


        listaLibros.add(new Book("Java a fondo: - estudio del lenguaje y desarrollo de aplicaciones - 2a ed.",
                                "Libro de Pablo Augusto Sznajdleder\n" +
                                        "Resultado de imagen para Java a fondo: estudio del lenguaje y desarrollo de aplicaciones\n" +
                                        "Obtener vista previa del libro\n" +
                                        "¿Te gustó este libro?\n" +
                                        " Java a fondo propone un curso de lenguaje y desarrollo de aplicaciones Java basado en un enfoque totalmente práctico, sin vueltas ni rodeos, y contemplando el aprendizaje basado en competencias.El ... Google Books\n" +
                                        "Fecha de publicación original: junio de 2011\n" +
                                        "Autor: Pablo Augusto Sznajdleder", R.drawable.imagen2,
                "https://books.google.com.mx/books/about/Java_a_fondo.html?id=WcL2DQAAQBAJ&printsec=frontcover&source=kp_read_button&redir_esc=y#v=onepage&q&f=false"));


        listaLibros.add(new Book("El gran libro de Android\n",
                "En los últimos años, los teléfonos móviles están transformando " +
                        "la forma en que las personas se comunican. Esta revolución no ha" +
                        " hecho más que empezar, los nuevos terminales ofrecen unas capacidades" +
                        " similares a un ordenador personal, pero a diferencia de un ordenador," +
                        " un teléfono móvil siempre está en el bolsillo del usuario. Esto permite" +
                        " un nuevo abanico de aplicaciones mucho más cercanas al usuario, convirtiendo" +
                        " a los móviles en el nuevo ordenador personal del siglo XXI. ", R.drawable.imagen3,
                "https://books.google.com.mx/books/about/El_gran_libro_de_Android.html?id=L7TniTjmQHIC&redir_esc=y"));



        listaLibros.add(new Book("Programacion En Java 6 Pasta blanda – 2011", "Es un libro my bueno",
                R.drawable.imagen4,
                "https://www.amazon.com.mx/Programacion-En-Java-6-Joyanes/dp/6071506182\n"));

    }//end

    public void onClick(View view) {

        switch (view.getId()){
            case R.id.tvTitulo: UtilidadesBook.visualizacion=UtilidadesBook.LIST;
                break;
        }
        construirRecycler();
    }

    public void construirRecycler(){
        listaLibros = new ArrayList<>();
        recyclerLibro = (RecyclerView)findViewById(R.id.RecyclerId);

        if (UtilidadesBook.visualizacion==UtilidadesBook.LIST){
            recyclerLibro.setLayoutManager(new LinearLayoutManager(this));
        }else {
            recyclerLibro.setLayoutManager(new GridLayoutManager(this,3));
        }
        llenarLibro();

        AdaptadorBooks adapter=new AdaptadorBooks(listaLibros);

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Selección: "+listaLibros.get(recyclerLibro.getChildAdapterPosition(view))
                                .getTitulo(),Toast.LENGTH_SHORT).show();


                listaLibros.get(recyclerLibro.getChildAdapterPosition(view)).getUri();

                Uri uri = Uri.parse(listaLibros.get(recyclerLibro.getChildAdapterPosition(view)).getUri());
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        recyclerLibro.setAdapter(adapter);
    }//end



}//end Class
