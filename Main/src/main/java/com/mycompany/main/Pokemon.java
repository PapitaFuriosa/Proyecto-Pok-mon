package com.mycompany.main;

public class Pokemon {
    public String nombre;
    public int vida;
    public int vidaMaxima;
    public int ataque;
    public int defensa;
    public int ataqueEspecial;
    public int defensaEspecial;

    public int contadorAtaquesNormales;
    public int contadorDefensasNormales;

    public Pokemon(String nombre, int vida, int ataque, int defensa, int ataqueEspecial, int defensaEspecial) {
        this.nombre = nombre;
        this.vida = vida;
        this.vidaMaxima = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.contadorAtaquesNormales = 0;
        this.contadorDefensasNormales = 0;
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

    public void aumentarAtaqueNormal() {
        contadorAtaquesNormales++;
    }

    public void aumentarDefensaNormal() {
        contadorDefensasNormales++;
    }

    public boolean puedeUsarAtaqueEspecial() {
        return contadorAtaquesNormales >= 3;
    }

    public boolean puedeUsarDefensaEspecial() {
        return contadorDefensasNormales >= 3;
    }

    public void consumirAtaqueEspecial() {
        contadorAtaquesNormales = 0;
    }

    public void consumirDefensaEspecial() {
        contadorDefensasNormales = 0;
    }
}