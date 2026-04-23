package com.mycompany.main;

import java.util.Random;

public class Batalla {
    public static PilaHistorial historial = new PilaHistorial();
    public static Random random = new Random();

    public static void reiniciar() {
        historial.vaciar();
    }

    public static void push(String texto) {
        historial.push(texto);
    }

    public static String obtenerHistorial() {
        return historial.obtenerTexto();
    }

    public static int calcularDanio(int ataque, int defensa) {
        int base = ataque - defensa;
        int variacion = random.nextInt(11) - 5;
        int danio = base + variacion;

        if (danio < 1) {
            danio = 1;
        }

        return danio;
    }

    public static void ataqueNormal(Pokemon atacante, Pokemon defensor) {
        atacante.aumentarAtaqueNormal();

        int danio = calcularDanio(atacante.ataque, defensor.defensa);
        defensor.recibirDanio(danio);

        push(atacante.nombre + " uso³ ataque normal.");
        push("Daño causado: " + danio);
        push("Vida restante de " + defensor.nombre + ": " + defensor.vida);
        push("Contador ataque normal de " + atacante.nombre + ": " + atacante.contadorAtaquesNormales + "/2");
    }

    public static void ataqueEspecial(Pokemon atacante, Pokemon defensor) {
        if (!atacante.puedeUsarAtaqueEspecial()) {
            push(atacante.nombre + " todavia no puede usar ataque especial.");
            push("Necesita 2 ataques normales.");
            return;
        }

        atacante.consumirAtaqueEspecial();

        int danio = calcularDanio(atacante.ataqueEspecial, defensor.defensa);
        defensor.recibirDanio(danio);

        push(atacante.nombre + " usara³ ataque especial.");
        push("Daño causado: " + danio);
        push("Vida restante de " + defensor.nombre + ": " + defensor.vida);
    }

    public static void defensaNormal(Pokemon pokemon) {
        pokemon.aumentarDefensaNormal();
        push(pokemon.nombre + " usara³ defensa normal.");
        push("Contador defensa normal de " + pokemon.nombre + ": " + pokemon.contadorDefensasNormales + "/2");
    }

    public static void defensaEspecial(Pokemon pokemon) {
        if (!pokemon.puedeUsarDefensaEspecial()) {
            push(pokemon.nombre + " todavia no puede usar defensa especial.");
            push("Necesita 2 defensas normales.");
            return;
        }

        pokemon.consumirDefensaEspecial();
        push(pokemon.nombre + " usara³ defensa especial.");
    }

    public static boolean hayGanador(Jugador jugador, Jugador cpu) {
        return !jugador.tienePokemonesVivos() || !cpu.tienePokemonesVivos();
    }

    public static String obtenerGanador(Jugador jugador, Jugador cpu) {
        if (jugador.tienePokemonesVivos()) {
            return jugador.nombre;
        }
        return cpu.nombre;
    }
}