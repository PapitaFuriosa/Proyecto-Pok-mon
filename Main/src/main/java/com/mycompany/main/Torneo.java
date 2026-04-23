package com.mycompany.main;

import java.util.Random;

public class Torneo {
    private final Random random = new Random();
    private final Jugador jugador;
    private final Jugador participante2;
    private final Jugador participante3;
    private final Jugador participante4;
    private final Jugador participante5;
    private final Jugador participante6;
    private final Jugador participante7;
    private final Jugador participante8;
    private final ArbolTorneo arbol;

    private Jugador campeon;
    private int rondaJugador = 0;
    private boolean torneoTerminado = false;
    private boolean jugadorCampeon = false;

    public Torneo(Jugador jugador) {
        this.jugador = jugador;
        this.participante2 = crearCpuCompleto(nombreCpuRandom());
        this.participante3 = crearCpuCompleto(nombreCpuRandom());
        this.participante4 = crearCpuCompleto(nombreCpuRandom());
        this.participante5 = crearCpuCompleto(nombreCpuRandom());
        this.participante6 = crearCpuCompleto(nombreCpuRandom());
        this.participante7 = crearCpuCompleto(nombreCpuRandom());
        this.participante8 = crearCpuCompleto(nombreCpuRandom());
        this.arbol = new ArbolTorneo(jugador, participante2, participante3, participante4, participante5, participante6, participante7, participante8);
        simularCuartosCpu();
    }

    public Jugador getJugador() { return jugador; }
    public ArbolTorneo getArbol() { return arbol; }
    public boolean isTorneoTerminado() { return torneoTerminado; }
    public boolean isJugadorCampeon() { return jugadorCampeon; }
    public int getRondaJugador() { return rondaJugador; }
    public String getNombreJugador() { return jugador.nombre; }

    public Jugador getOponenteActual() {
        if (rondaJugador == 0) {
            return participante2;
        }
        if (rondaJugador == 1) {
            return arbol.getGanadorCuarto(1);
        }
        if (rondaJugador == 2) {
            return arbol.getGanadorSemi(1);
        }
        return null;
    }

    public String getNombreCampeon() {
        return campeon != null ? campeon.nombre : "Pendiente";
    }

    public String getTextoRonda() {
        if (rondaJugador == 0) {
            return "Cuartos de final";
        }
        if (rondaJugador == 1) {
            return "Semifinal";
        }
        if (rondaJugador == 2) {
            return "Final";
        }
        return "Torneo finalizado";
    }

    public boolean jugadorSigueActivo() {
        return !torneoTerminado && jugador.tienePokemonesVivos();
    }

    public void registrarVictoriaJugador() {
        if (torneoTerminado) {
            return;
        }
        if (rondaJugador == 0) {
            arbol.definirGanadorCuarto(0, jugador);
            simularSemiCpu();
            rondaJugador = 1;
            return;
        }
        if (rondaJugador == 1) {
            arbol.definirGanadorSemi(0, jugador);
            rondaJugador = 2;
            return;
        }
        campeon = jugador;
        arbol.definirGanadorSemi(0, jugador);
        arbol.definirCampeon(jugador);
        torneoTerminado = true;
        jugadorCampeon = true;
    }

    public void registrarDerrotaJugador() {
        if (torneoTerminado) {
            return;
        }

        Jugador oponente = getOponenteActual();
        if (rondaJugador == 0) {
            arbol.definirGanadorCuarto(0, oponente);
            simularSemiCpu();
        } else if (rondaJugador == 1) {
            arbol.definirGanadorSemi(0, oponente);
        } else {
            campeon = oponente;
            arbol.definirGanadorSemi(0, jugador);
            arbol.definirCampeon(oponente);
            torneoTerminado = true;
            jugadorCampeon = false;
            return;
        }

        if (rondaJugador < 2) {
            campeon = elegirGanadorCpu(getGanadorSuperior(), getGanadorInferior());
            arbol.definirCampeon(campeon);
        } else {
            campeon = oponente;
            arbol.definirCampeon(oponente);
        }

        torneoTerminado = true;
        jugadorCampeon = false;
    }

    public void cerrarTorneoPorHuida() {
        if (!torneoTerminado) {
            registrarDerrotaJugador();
        }
    }

    private void simularCuartosCpu() {
        arbol.definirGanadorCuarto(1, elegirGanadorCpu(participante3, participante4));
        arbol.definirGanadorCuarto(2, elegirGanadorCpu(participante5, participante6));
        arbol.definirGanadorCuarto(3, elegirGanadorCpu(participante7, participante8));
    }

    private void simularSemiCpu() {
        arbol.definirGanadorSemi(1, elegirGanadorCpu(arbol.getGanadorCuarto(2), arbol.getGanadorCuarto(3)));
    }

    private Jugador elegirGanadorCpu(Jugador a, Jugador b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        return random.nextBoolean() ? a : b;
    }

    private Jugador getGanadorSuperior() {
        if (arbol.getGanadorSemi(0) != null) {
            return arbol.getGanadorSemi(0);
        }
        if (arbol.getGanadorCuarto(0) != null) {
            return arbol.getGanadorCuarto(0);
        }
        return getOponenteActual();
    }

    private Jugador getGanadorInferior() {
        if (arbol.getGanadorSemi(1) != null) {
            return arbol.getGanadorSemi(1);
        }
        if (arbol.getGanadorCuarto(2) != null && arbol.getGanadorCuarto(3) != null) {
            return elegirGanadorCpu(arbol.getGanadorCuarto(2), arbol.getGanadorCuarto(3));
        }
        return participante5;
    }

    private String nombreCpuRandom() {
        int opcion = random.nextInt(10);
        String base;
        if (opcion == 0) {
            base = "AshBot";
        } else if (opcion == 1) {
            base = "Gary";
        } else if (opcion == 2) {
            base = "Team Rocket";
        } else if (opcion == 3) {
            base = "Red Team";
        } else if (opcion == 4) {
            base = "Blue Team";
        } else if (opcion == 5) {
            base = "Dark Trainer";
        } else if (opcion == 6) {
            base = "Elite Bot";
        } else if (opcion == 7) {
            base = "Master ";
        } else if (opcion == 8) {
            base = "Rival XV";
        } else {
            base = "Legend player";
        }
        return base + " " + (100 + random.nextInt(900));
    }

    private Jugador crearCpuCompleto(String nombre) {
        Jugador cpu = new Jugador(nombre);
        int opcion1 = random.nextInt(10);
        int opcion2 = random.nextInt(10);
        while (opcion2 == opcion1) {
            opcion2 = random.nextInt(10);
        }
        int opcion3 = random.nextInt(10);
        while (opcion3 == opcion1 || opcion3 == opcion2) {
            opcion3 = random.nextInt(10);
        }
        int opcion4 = random.nextInt(10);
        while (opcion4 == opcion1 || opcion4 == opcion2 || opcion4 == opcion3) {
            opcion4 = random.nextInt(10);
        }

        cpu.agregarPokemon(FabricaPokemon.crearPokemonPorIndice(opcion1));
        cpu.agregarPokemon(FabricaPokemon.crearPokemonPorIndice(opcion2));
        cpu.agregarPokemon(FabricaPokemon.crearPokemonPorIndice(opcion3));
        cpu.agregarPokemon(FabricaPokemon.crearPokemonPorIndice(opcion4));
        return cpu;
    }
}