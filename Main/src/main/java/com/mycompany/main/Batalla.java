package com.mycompany.main;

<<<<<<< HEAD
import java.util.Random;

public class Batalla {
    public static PilaHistorial historial = new PilaHistorial();
    public static Random random = new Random();

    public static void reiniciar() {
        historial.vaciar();
    }
=======

import java.util.Random;

public class Batalla {
    String nombre;
    
    public Batalla(String nombreRecibido){
        this.nombre = nombreRecibido;
        
    }

    static String[] historial = new String[5000];
    static int top = -1;
    static Random random = new Random();
>>>>>>> 2d20a783bb75ab3f3d3b16d12efc433ac235daed

    public static void push(String texto) {
        historial.push(texto);
    }

<<<<<<< HEAD
    public static String obtenerHistorial() {
        return historial.obtenerTexto();
    }

    public static int calcularDanio(int ataque, int defensa) {
        int base = ataque - defensa;
        int variacion = random.nextInt(11) - 5;
        int danio = base + variacion;

        if (danio < 1) {
            danio = 1;
=======
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
>>>>>>> 2d20a783bb75ab3f3d3b16d12efc433ac235daed
        }

        return danio;
    }

<<<<<<< HEAD
    public static void ataqueNormal(Pokemon atacante, Pokemon defensor) {
        atacante.aumentarAtaqueNormal();

        int danio = calcularDanio(atacante.ataque, defensor.defensa);
        defensor.recibirDanio(danio);

        push(atacante.nombre + " usó ataque normal.");
        push("Daño causado: " + danio);
        push("Vida restante de " + defensor.nombre + ": " + defensor.vida);
        push("Contador ataque normal de " + atacante.nombre + ": " + atacante.contadorAtaquesNormales + "/3");
    }

    public static void ataqueEspecial(Pokemon atacante, Pokemon defensor) {
        if (!atacante.puedeUsarAtaqueEspecial()) {
            push(atacante.nombre + " todavía no puede usar ataque especial.");
            push("Necesita 3 ataques normales.");
            return;
        }

        atacante.consumirAtaqueEspecial();

        int danio = calcularDanio(atacante.ataqueEspecial, defensor.defensa);
        defensor.recibirDanio(danio);

        push(atacante.nombre + " usó ataque especial.");
        push("Daño causado: " + danio);
        push("Vida restante de " + defensor.nombre + ": " + defensor.vida);
    }

    public static void defensaNormal(Pokemon pokemon) {
        pokemon.aumentarDefensaNormal();
        push(pokemon.nombre + " usó defensa normal.");
        push("Contador defensa normal de " + pokemon.nombre + ": " + pokemon.contadorDefensasNormales + "/3");
    }

    public static void defensaEspecial(Pokemon pokemon) {
        if (!pokemon.puedeUsarDefensaEspecial()) {
            push(pokemon.nombre + " todavía no puede usar defensa especial.");
            push("Necesita 3 defensas normales.");
            return;
        }

        pokemon.consumirDefensaEspecial();
        push(pokemon.nombre + " usó defensa especial.");
    }

    public static boolean hayGanador(Jugador jugador, Jugador cpu) {
        return !jugador.tienePokemonesVivos() || !cpu.tienePokemonesVivos();
    }

    public static String obtenerGanador(Jugador jugador, Jugador cpu) {
        if (jugador.tienePokemonesVivos()) {
            return jugador.nombre;
        }
=======
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

    int variacion = random.nextInt(11) - 5; 
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
>>>>>>> 2d20a783bb75ab3f3d3b16d12efc433ac235daed
        return cpu.nombre;
    }
}