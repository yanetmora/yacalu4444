package com.edu.utng.modernlogin;

public class Book {

    private String Titulo;
    private String info;
    private int foto;
    private String uri;

    public Book(){

    }

    public Book(String titulo, String info, int foto, String uri) {
        Titulo = titulo;
        this.info = info;
        this.foto = foto;
        this.uri = uri;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        uri = uri;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}//end
