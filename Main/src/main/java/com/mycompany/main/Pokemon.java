package com.mycompany.main;

public class Pokemon {
    public String nombre;
    public int vida;
    public int ataque;
    public int defensa;
    public int ataqueEspecial;
    public int defensaEspecial;

    public Pokemon(String nombre, int vida, int ataque, int defensa, int ataqueEspecial, int defensaEspecial) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
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