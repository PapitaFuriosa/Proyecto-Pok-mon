package com.mycompany.main;

public class Jugador {
    public String nombre;
<<<<<<< HEAD
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
=======
    public Pokemon[] equipo;
    public int actual;

    public Jugador(String nombre, Pokemon[] equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.actual = 0;
    }

    public Pokemon getPokemonActual() {
        if (actual < equipo.length) {
            return equipo[actual];
        }
        return null;
    }

    public boolean tienePokemonesVivos() {
        for (int i = actual; i < equipo.length; i++) {
            if (equipo[i] != null && equipo[i].vivo()) {
                return true;
            }
        }
        return false;
    }

    public void pasarSiguientePokemon() {
        while (actual < equipo.length && !equipo[actual].vivo()) {
            actual++;
>>>>>>> 2d20a783bb75ab3f3d3b16d12efc433ac235daed
        }
    }
}