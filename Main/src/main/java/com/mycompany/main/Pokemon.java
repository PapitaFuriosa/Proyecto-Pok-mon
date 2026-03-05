package com.mycompany.main;

public class Pokemon {
    String nombre;
    int vida;
    int ataque;
    int defensa;

    public Pokemon(String n, int v, int a, int d) {
        nombre = n;
        vida = v;
        ataque = a;
        defensa = d;
    }

    public void recibirDanio(int d) {
        vida -= d;
        if (vida < 0) vida = 0;
    }

    public boolean vivo() {
        return vida > 0;
    }
}