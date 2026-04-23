package com.mycompany.main;

public class Jugador {
    public String nombre;
    public ColaPokemon equipo;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.equipo = new ColaPokemon();
    }

    public void agregarPokemon(Pokemon pokemon) {
        equipo.encolar(pokemon);
    }

    public Pokemon getPokemonActual() {
        return equipo.verFrente();
    }

    public boolean tienePokemonesVivos() {
        return !equipo.estaVacia();
    }

    public void pasarSiguientePokemon() {
        if (!equipo.estaVacia()) {
            equipo.desencolar();
        }
    }
}