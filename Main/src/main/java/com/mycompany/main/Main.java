package com.mycompany.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        Pokemon p1 = new Pokemon("Pikachu", 50, 15, 5);
        Pokemon p2 = new Pokemon("Charmander", 50, 14, 6);

        Jugador jugador = new Jugador(nombre, p1);
        Jugador cpu = new Jugador("CPU", p2);

        Batalla.iniciar(jugador, cpu);

        System.out.println("\n=== RESULTADO ===");
        if (jugador.pokemon.vivo()) {
            System.out.println("GANASTE");
        } else {
            System.out.println("PERDISTE");
        }

        Batalla.mostrarHistorial();

        sc.close();
    }
}