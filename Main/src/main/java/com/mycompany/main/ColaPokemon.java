package com.mycompany.main;

public class ColaPokemon {
    private NodoColaPokemon frente;
    private NodoColaPokemon fin;

    public ColaPokemon() {
        frente = null;
        fin = null;
    }

    public void encolar(Pokemon pokemon) {
        NodoColaPokemon nuevo = new NodoColaPokemon(pokemon);

        if (fin == null) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public Pokemon verFrente() {
        if (frente == null) {
            return null;
        }
        return frente.pokemon;
    }

    public Pokemon desencolar() {
        if (frente == null) {
            return null;
        }

        Pokemon aux = frente.pokemon;
        frente = frente.siguiente;

        if (frente == null) {
            fin = null;
        }

        return aux;
    }

    public boolean estaVacia() {
        return frente == null;
    }
}