package com.edu.utng.modernlogin;



import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public abstract class  Utility {

     public static String comprovaPosicio(int posicio, ArrayList<Word> palabras,
                                          ArrayList<Integer> posicionesMarcadas, JocDbHelper db, int id){
         boolean palabrasCompletada  = false;
         String result= "";

         for (int v : posicionesMarcadas) {
             System.out.println("v"+ v);
         }


         for (Word pa : palabras) {
             //System.out.println(pa.getNom());
             for (Word.Letra l : pa.letras) {
                 //System.out.println(l.getString() +" posición: "+l.getPosicion());
                 if(l.getPosicion()==posicio){
                     System.out.println(l.getPosicion()+" "+posicio);

                     result = "NoCompletada";
                     palabrasCompletada = comprovaPalabraCompletada(pa, posicionesMarcadas);
                     if(palabrasCompletada) {

                         if(PrincipalActivity.palabrasCompletadas.indexOf(pa) == -1){
                             db.updatePuntuacioSuma(id,new SimpleDateFormat("yyy/MM/dd HH:mm:ss").format(new Date()),10);
                             PrincipalActivity.palabrasCompletadas.add(pa);
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

     //comprueba si las posiciones seleccionadas corresponden a una palabra
     public static boolean comprovaPalabraCompletada(Word p, ArrayList<Integer> posicionesMarcadas){

         boolean result = true;
         int count = 0;

         for (Word.Letra l : p.letras) {
             System.out.println("1.p"+p.getNom()+" l "+l.getString()+" "+posicionesMarcadas.indexOf(l.getPosicion()));

             if(posicionesMarcadas.indexOf(l.getPosicion()) < 0){
                 result= false;
             }else{
                 count++;
             }
             System.out.println("2.p"+p.getNom()+" l "+l.getString()+" "+posicionesMarcadas.indexOf(l.getPosicion())+ " "+count+" "+posicionesMarcadas.size());

         }
         return result && count == posicionesMarcadas.size();
     }

    public static void sumaPunts(Word p, ArrayList<Word> paraulasCompletadas, JocDbHelper db, int id){
            System.out.println("no existe");
            db.updatePuntuacioSuma(id,new SimpleDateFormat("yyy/MM/dd HH:mm:ss").format(new Date()),10);
    }




}
