package com.project.rafi.com.recyclerview;

/**
 * Created by rafic on 29/10/2017.
 */

public class Vista {
    private String mensaje;
    private String hora;

    public Vista(String mensaje, String hora) {
        this.mensaje = mensaje;
        this.hora = hora;
    }

    public Vista(String hora) {
        this.hora = hora;
        this.mensaje = "Alarma";
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
