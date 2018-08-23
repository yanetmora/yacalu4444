package com.edu.utng.modernlogin;

import java.util.Map;

public class SendMessage extends Message {
    private Map hora;

    public SendMessage() {
    }

    public SendMessage(Map hora) {
        this.hora = hora;
    }

    public SendMessage(String mensaje, String nombre, String fotoPerfil, String type_mensaje, Map hora) {
        super(mensaje, nombre, fotoPerfil, type_mensaje);
        this.hora = hora;
    }

    public SendMessage(String mensaje, String urlFoto, String nombre, String fotoPerfil, String type_mensaje, Map hora) {
        super(mensaje, urlFoto, nombre, fotoPerfil, type_mensaje);
        this.hora = hora;
    }

    public Map getHora() {
        return hora;
    }

    public void setHora(Map hora) {
        this.hora = hora;
    }
}
