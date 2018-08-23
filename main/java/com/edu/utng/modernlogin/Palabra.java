package com.edu.utng.modernlogin;

import java.util.ArrayList;

/**
 * Author: Desarrollo-PC
 */

public class Palabra {
    int index;
    String nom;


    public ArrayList<Letra> letras = new ArrayList<Letra>();

    public String getNom() {
        return nom;
    }

    public Palabra(  String nom, int index) {
        super();
        this.index = index;
        this.nom = nom;
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

    public Palabra() {
        ArrayList<Letra> letras = new ArrayList<Letra>();
    }

    public ArrayList<Letra> getLetras() {
        return letras;
    }

    public void setLetras(ArrayList<Letra> letras) {
        this.letras = letras;
    }


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

