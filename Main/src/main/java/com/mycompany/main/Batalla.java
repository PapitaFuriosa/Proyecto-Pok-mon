package com.mycompany.main;

public class Batalla {

    
    static String[] historial = new String[100];
    static int top = -1;

    
    static Jugador[] cola = new Jugador[2];
    static int frente = 0;

    public static void push(String texto) {
        top++;
        historial[top] = texto;
    }

    public static void mostrarHistorial() {
        System.out.println("\n=== HISTORIAL ===");
        for (int i = top; i >= 0; i--) {
            System.out.println(historial[i]);
        }
    }

    public static Jugador siguienteTurno() {
        Jugador j = cola[frente];
        frente = (frente + 1) % 2;
        return j;
    }

    public static void iniciar(Jugador j1, Jugador j2) {
        cola[0] = j1;
        cola[1] = j2;
        batalla(j1, j2, 1);
    }

    public static void batalla(Jugador j1, Jugador j2, int turno) {

        if (!j1.pokemon.vivo() || !j2.pokemon.vivo()) {
            return;
        }

        System.out.println("\n=== TURNO " + turno + " ===");

        Jugador actual = siguienteTurno();
        Jugador rival = (actual == j1) ? j2 : j1;

        int danio = actual.pokemon.ataque - rival.pokemon.defensa;
        if (danio < 1) danio = 1;

        rival.pokemon.recibirDanio(danio);

        String texto = actual.nombre + " ataca a " + rival.nombre +
                " con " + actual.pokemon.nombre +
                " causando " + danio + " de daño";

        System.out.println(texto);
        push(texto);

        System.out.println(j1.nombre + " vida: " + j1.pokemon.vida);
        System.out.println(j2.nombre + " vida: " + j2.pokemon.vida);

        batalla(j1, j2, turno + 1);
    }
}