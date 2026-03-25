package com.mycompany.main;

public class Jugador {
    public String nombre;
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
        }
    }
}