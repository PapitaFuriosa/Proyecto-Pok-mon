package com.mycompany.main;

public class ArbolTorneo {
    private final NodoTorneo hoja1;
    private final NodoTorneo hoja2;
    private final NodoTorneo hoja3;
    private final NodoTorneo hoja4;
    private final NodoTorneo hoja5;
    private final NodoTorneo hoja6;
    private final NodoTorneo hoja7;
    private final NodoTorneo hoja8;
    private final NodoTorneo cuarto1;
    private final NodoTorneo cuarto2;
    private final NodoTorneo cuarto3;
    private final NodoTorneo cuarto4;
    private final NodoTorneo semi1;
    private final NodoTorneo semi2;
    private final NodoTorneo raiz;

    public ArbolTorneo(Jugador participante1, Jugador participante2, Jugador participante3, Jugador participante4,
            Jugador participante5, Jugador participante6, Jugador participante7, Jugador participante8) {
        hoja1 = new NodoTorneo(participante1, "Participante 1");
        hoja2 = new NodoTorneo(participante2, "Participante 2");
        hoja3 = new NodoTorneo(participante3, "Participante 3");
        hoja4 = new NodoTorneo(participante4, "Participante 4");
        hoja5 = new NodoTorneo(participante5, "Participante 5");
        hoja6 = new NodoTorneo(participante6, "Participante 6");
        hoja7 = new NodoTorneo(participante7, "Participante 7");
        hoja8 = new NodoTorneo(participante8, "Participante 8");

        cuarto1 = new NodoTorneo("Cuartos 1");
        cuarto1.izquierda = hoja1;
        cuarto1.derecha = hoja2;

        cuarto2 = new NodoTorneo("Cuartos 2");
        cuarto2.izquierda = hoja3;
        cuarto2.derecha = hoja4;

        cuarto3 = new NodoTorneo("Cuartos 3");
        cuarto3.izquierda = hoja5;
        cuarto3.derecha = hoja6;

        cuarto4 = new NodoTorneo("Cuartos 4");
        cuarto4.izquierda = hoja7;
        cuarto4.derecha = hoja8;

        semi1 = new NodoTorneo("Semifinal 1");
        semi1.izquierda = cuarto1;
        semi1.derecha = cuarto2;

        semi2 = new NodoTorneo("Semifinal 2");
        semi2.izquierda = cuarto3;
        semi2.derecha = cuarto4;

        raiz = new NodoTorneo("Final");
        raiz.izquierda = semi1;
        raiz.derecha = semi2;
    }

    public NodoTorneo getRaiz() { return raiz; }
    public NodoTorneo getHoja1() { return hoja1; }
    public NodoTorneo getHoja2() { return hoja2; }
    public NodoTorneo getHoja3() { return hoja3; }
    public NodoTorneo getHoja4() { return hoja4; }
    public NodoTorneo getHoja5() { return hoja5; }
    public NodoTorneo getHoja6() { return hoja6; }
    public NodoTorneo getHoja7() { return hoja7; }
    public NodoTorneo getHoja8() { return hoja8; }
    public NodoTorneo getCuarto1() { return cuarto1; }
    public NodoTorneo getCuarto2() { return cuarto2; }
    public NodoTorneo getCuarto3() { return cuarto3; }
    public NodoTorneo getCuarto4() { return cuarto4; }
    public NodoTorneo getSemi1() { return semi1; }
    public NodoTorneo getSemi2() { return semi2; }

    public void definirGanadorCuarto(int indice, Jugador ganador) {
        if (indice == 0) {
            cuarto1.ganador = ganador;
        } else if (indice == 1) {
            cuarto2.ganador = ganador;
        } else if (indice == 2) {
            cuarto3.ganador = ganador;
        } else if (indice == 3) {
            cuarto4.ganador = ganador;
        }
    }

    public void definirGanadorSemi(int indice, Jugador ganador) {
        if (indice == 0) {
            semi1.ganador = ganador;
        } else if (indice == 1) {
            semi2.ganador = ganador;
        }
    }

    public void definirCampeon(Jugador ganador) {
        raiz.ganador = ganador;
    }

    public Jugador getGanadorCuarto(int indice) {
        if (indice == 0) {
            return cuarto1.ganador;
        }
        if (indice == 1) {
            return cuarto2.ganador;
        }
        if (indice == 2) {
            return cuarto3.ganador;
        }
        return cuarto4.ganador;
    }

    public Jugador getGanadorSemi(int indice) {
        if (indice == 0) {
            return semi1.ganador;
        }
        return semi2.ganador;
    }

    public Jugador getCampeon() {
        return raiz.ganador;
    }
}