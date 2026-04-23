package com.mycompany.main;

public class NodoPila {
    public String texto;
    public NodoPila siguiente;

    public NodoPila(String texto) {
        this.texto = texto;
        this.siguiente = null;
    }
}