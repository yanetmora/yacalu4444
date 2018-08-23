package com.edu.utng.modernlogin;

public class GettingMessage extends Message {

    private Long hora;

    public GettingMessage() {
    }

    public GettingMessage(Long hora) {
        this.hora = hora;
    }

    public GettingMessage(String mensaje, String urlFoto, String nombre, String fotoPerfil, String type_mensaje, Long hora) {
        super(mensaje, urlFoto, nombre, fotoPerfil, type_mensaje);
        this.hora = hora;
    }

    public Long getHora() {
        return hora;
    }

    public void setHora(Long hora) {
        this.hora = hora;
    }
}
