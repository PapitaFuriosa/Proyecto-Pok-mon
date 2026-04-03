package com.mycompany.main;

public class NodoColaPokemon {
    public Pokemon pokemon;
    public NodoColaPokemon siguiente;

    public NodoColaPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
        this.siguiente = null;
    }
}