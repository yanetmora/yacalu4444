package com.edu.utng.modernlogin;

import java.util.ArrayList;

/**
 * Author: Desarrollo-PC
 */

public class PalabraNew {
    int index;
    String nom;
    String comentario;


    public ArrayList<Letra> letras = new ArrayList<Letra>();

    public String getNom() {
        return nom;
    }
    public String getComentario() {
        return comentario;
    }

    public PalabraNew(int index, String nom, String comentario) {
        super();
        this.index = index;
        this.nom = nom;
        this.comentario=comentario;
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
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }


    public PalabraNew() {
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

