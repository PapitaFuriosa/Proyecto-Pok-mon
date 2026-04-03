package com.mycompany.main;

public class PilaHistorial {
    private NodoPila cima;

    public PilaHistorial() {
        cima = null;
    }

    public void push(String texto) {
        NodoPila nuevo = new NodoPila(texto);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public void vaciar() {
        cima = null;
    }

    public String obtenerTexto() {
        String texto = "";
        NodoPila actual = cima;

        while (actual != null) {
            texto = actual.texto + "\n" + texto;
            actual = actual.siguiente;
        }

        return texto;
    }
}