package com.mycompany.main;

public class Pokemon {
    public String nombre;
    public int vida;
    public int ataque;
    public int defensa;

    public Pokemon(String nombre, int vida, int ataque, int defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public void recibirDanio(int danio) {
        vida -= danio;
        if (vida < 0) {
            vida = 0;
        }
    }

    public boolean vivo() {
        return vida > 0;
    }
}