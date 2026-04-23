package com.mycompany.main;

public class NodoTorneo {
    public Jugador participante;
    public Jugador ganador;
    public NodoTorneo izquierda;
    public NodoTorneo derecha;
    public String etiqueta;

    public NodoTorneo(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public NodoTorneo(Jugador participante, String etiqueta) {
        this.participante = participante;
        this.ganador = participante;
        this.etiqueta = etiqueta;
    }

    public boolean esHoja() {
        return izquierda == null && derecha == null;
    }

    public String getNombreVisible() {
        if (ganador != null) {
            return ganador.nombre;
        }
        if (participante != null) {
            return participante.nombre;
        }
        return "Pendiente";
    }
}
