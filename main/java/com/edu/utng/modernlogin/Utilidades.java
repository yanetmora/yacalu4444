package com.edu.utng.modernlogin;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Author: Desarrollo-PC
 */
public abstract class  Utilidades {

     public static String comprovaPosicio
             (
                 int posicio, ArrayList<Palabra> palabras,
                 ArrayList<Integer> posicionesMarcadas,
                 JocDbHelper db,
                 int id
             )

             {
                 boolean palabrasCompletada  = false;
                 String result= "";

                 for (int v : posicionesMarcadas) {
                 System.out.println("v"+ v);
             }
        /**
        * Buscar palabra y verificar si esta completada
         *o no.
        */
         for (Palabra pa : palabras) {
             for (Palabra.Letra l : pa.letras) {
                 if(l.getPosicion()==posicio){
                     //System.out.println(l.getPosicion()+" "+posicio);

                     result = "NoCompletada";
                     palabrasCompletada = comprovaPalabraCompletada(pa, posicionesMarcadas);
                     if(palabrasCompletada) {

                         if(InicioJuegoSopaActivity.palabrasCompletadas.indexOf(pa) == -1){
                             db.updatePuntuacioSuma(id,new SimpleDateFormat("yyy/MM/dd HH:mm:ss").format(new Date()),10);
                             InicioJuegoSopaActivity.palabrasCompletadas.add(pa);
                             result="Completada";
                         }else{
                             result="repetida";
                         }

                     }
                 }
             }
         }

         return result;
     }

    /**
     * Comprueba si las posiciones seleccionadas corresponden a una palabra
     */
     public static boolean comprovaPalabraCompletada(Palabra p, ArrayList<Integer> posicionesMarcadas){

         boolean result = true;
         int count = 0;

         for (Palabra.Letra l : p.letras) {
             //System.out.println("1.p"+p.getNom()+" l "+l.getString()+" "+posicionesMarcadas.indexOf(l.getPosicion()));

             if(posicionesMarcadas.indexOf(l.getPosicion()) < 0){
                 result= false;
             }else{
                 count++;
             }
             //System.out.println("2.p"+p.getNom()+" l "+l.getString()+" "+posicionesMarcadas.indexOf(l.getPosicion())+ " "+count+" "+posicionesMarcadas.size());

         }
         return result && count == posicionesMarcadas.size();
     }

    /**
     * Suma de puntos
     */
    public static void sumaPuntos(Palabra p, ArrayList<Palabra> paraulasCompletadas, JocDbHelper db, int id){
            //System.out.println("no existe");
            db.updatePuntuacioSuma(id,new SimpleDateFormat("yyy/MM/dd HH:mm:ss").format(new Date()),10);
    }

}
