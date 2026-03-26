package com.mycompany.main;

import Labels.Label_Info.Informacion;
import java.util.Random;

public class Batalla {
    String nombre;
    
    public Batalla(String nombreRecibido){
        this.nombre = nombreRecibido;
        
    }

    static String[] historial = new String[5000];
    static int top = -1;
    static Random random = new Random();

    public static void push(String texto) {
        top++;
        historial[top] = texto;
    }

    public static void reiniciar() {
        top = -1;
    }

    public static String obtenerHistorial() {
        String texto = "";
        for (int i = 0; i <= top; i++) {
            texto += historial[i] + "\n";
        }
        return texto;
    }

    public static void iniciar(Jugador jugador, Jugador cpu, String nombre) {
        reiniciar();
        int turno = 1;

        while (jugador.tienePokemonesVivos() && cpu.tienePokemonesVivos()) {

            jugador.pasarSiguientePokemon();
            cpu.pasarSiguientePokemon();

            Pokemon pJugador = jugador.getPokemonActual();
            Pokemon pCpu = cpu.getPokemonActual();

            if (pJugador == null || pCpu == null) {
                break;
            }

            push("========== TURNO " + turno + " ==========");
            push(nombre + " usa a " + pJugador.nombre + " | CPU usa a " + pCpu.nombre);

            atacar(jugador, cpu);

            if (cpu.getPokemonActual() != null && cpu.getPokemonActual().vivo()) {
                atacar(cpu, jugador);
            }

            jugador.pasarSiguientePokemon();
            cpu.pasarSiguientePokemon();

            push("Estado actual:");
            push(nombre + ": " + (jugador.getPokemonActual() != null ? jugador.getPokemonActual().nombre + " | Vida: " + jugador.getPokemonActual().vida : "Sin Pokémon"));
            push("CPU actual: " + (cpu.getPokemonActual() != null ? cpu.getPokemonActual().nombre + " | Vida: " + cpu.getPokemonActual().vida : "Sin Pokémon"));
            push("------------------------------------------");

            turno++;
        }
    }

public static void atacar(Jugador atacante, Jugador defensor) {
    Pokemon pAtaca = atacante.getPokemonActual();
    Pokemon pDefiende = defensor.getPokemonActual();

    if (pAtaca == null || pDefiende == null) {
        return;
    }

    boolean usaAtaqueEspecial = random.nextInt(100) < 20;
    boolean usaDefensaEspecial = random.nextInt(100) < 20;

    int ataqueUsado;
    int defensaUsada;
    String tipoAtaque;
    String tipoDefensa;

    if (usaAtaqueEspecial) {
        ataqueUsado = pAtaca.ataqueEspecial;
        tipoAtaque = "ataque especial";
    } else {
        ataqueUsado = pAtaca.ataque;
        tipoAtaque = "ataque normal";
    }

    if (usaDefensaEspecial) {
        defensaUsada = pDefiende.defensaEspecial;
        tipoDefensa = "defensa especial";
    } else {
        defensaUsada = pDefiende.defensa;
        tipoDefensa = "defensa normal";
    }

    int base = ataqueUsado - defensaUsada;

    int variacion = random.nextInt(11) - 5; // de -5 a +5
    int danio = base + variacion;

    if (danio < 1) {
        danio = 1;
    }

    pDefiende.recibirDanio(danio);

    push(atacante.nombre + " ataca con " + pAtaca.nombre + " usando " + tipoAtaque + ".");
    push(defensor.nombre + " se defiende con " + pDefiende.nombre + " usando " + tipoDefensa + ".");
    push("Daño causado: " + danio);
    push("Vida restante de " + pDefiende.nombre + ": " + pDefiende.vida);

    if (!pDefiende.vivo()) {
        push(pDefiende.nombre + " fue derrotado.");
    }
}

    public static String obtenerGanador(Jugador jugador, Jugador cpu) {
        if (jugador.tienePokemonesVivos()) {
            return jugador.nombre;
        }
        return cpu.nombre;
    }
}