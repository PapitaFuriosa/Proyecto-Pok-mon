package com.mycompany.main;

public class FabricaPokemon {
    public static Pokemon crearPokemon(String nombre) {
        String tipo = obtenerTipo(nombre);

        if ("Fuego".equals(tipo)) {
            return new Pokemon(nombre, tipo, 115, 70, 45, 80, 60);
        }
        if ("Agua".equals(tipo)) {
            return new Pokemon(nombre, tipo, 190, 55, 45, 75, 65);
        }
        return new Pokemon(nombre, tipo, 150, 50, 35, 70, 60);
    }

    public static Pokemon crearPokemonPorIndice(int indice) {
        switch (indice) {
            case 0:
                return crearPokemon("Charmander");
            case 1:
                return crearPokemon("Squirtle");
            case 2:
                return crearPokemon("Pidgey");
            case 3:
                return crearPokemon("Pikachu");
            case 4:
                return crearPokemon("Sandshrew");
            case 5:
                return crearPokemon("Diglett");
            case 6:
                return crearPokemon("Ponyta");
            case 7:
                return crearPokemon("Psyduck");
            case 8:
                return crearPokemon("Spearow");
            default:
                return crearPokemon("Jolteon");
        }
    }

    public static String obtenerTipo(String nombre) {
        if ("Charmander".equals(nombre) || "Ponyta".equals(nombre)) {
            return "Fuego";
        }
        if ("Squirtle".equals(nombre) || "Psyduck".equals(nombre)) {
            return "Agua";
        }
        return "Normal";
    }

    public static String obtenerFuerteContra(String tipo) {
        if ("Fuego".equals(tipo)) {
            return "Normal";
        }
        if ("Agua".equals(tipo)) {
            return "Fuego";
        }
        return "Agua";
    }

    public static String obtenerDebilContra(String tipo) {
        if ("Fuego".equals(tipo)) {
            return "Agua";
        }
        if ("Agua".equals(tipo)) {
            return "Normal";
        }
        return "Fuego";
    }
}