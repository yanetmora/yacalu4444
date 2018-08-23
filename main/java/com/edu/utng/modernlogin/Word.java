package com.edu.utng.modernlogin;

import android.content.Intent;
import java.util.ArrayList;

//clase controladora de las palabras
public class Word {
    String nom;
    int index;
    public ArrayList<Letra> letras = new ArrayList<Letra>();

    public String getNom() {
        return nom;
    }

    public Word(String nom, int index) {
        super();
        this.nom = nom;
        this.index = index;

    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Word() {
        ArrayList<Letra> letras = new ArrayList<Letra>();
    }

    public ArrayList<Letra> getLetras() {
        return letras;
    }

    public void setLetras(ArrayList<Letra> letras) {
        this.letras = letras;
    }


    //Clase controladora de Lletras de paraulas
    public static class Letra {
        public Integer posicion;

        public String string;

        public Integer getPosicion() {
            return posicion;
        }

        public void setPosicion(Integer posicion) {
            this.posicion = posicion;
        }

        public String getString() {
            return string;
        }

        public void setString(String string) {
            this.string = string;
        }
    }
}

