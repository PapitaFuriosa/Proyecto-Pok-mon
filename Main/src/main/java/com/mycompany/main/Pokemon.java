package com.mycompany.main;

public class Pokemon {
    public String nombre;
    public int vida;
<<<<<<< HEAD
    public int vidaMaxima;
=======
>>>>>>> 2d20a783bb75ab3f3d3b16d12efc433ac235daed
    public int ataque;
    public int defensa;
    public int ataqueEspecial;
    public int defensaEspecial;

<<<<<<< HEAD
    public int contadorAtaquesNormales;
    public int contadorDefensasNormales;

    public Pokemon(String nombre, int vida, int ataque, int defensa, int ataqueEspecial, int defensaEspecial) {
        this.nombre = nombre;
        this.vida = vida;
        this.vidaMaxima = vida;
=======
    public Pokemon(String nombre, int vida, int ataque, int defensa, int ataqueEspecial, int defensaEspecial) {
        this.nombre = nombre;
        this.vida = vida;
>>>>>>> 2d20a783bb75ab3f3d3b16d12efc433ac235daed
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
<<<<<<< HEAD
        this.contadorAtaquesNormales = 0;
        this.contadorDefensasNormales = 0;
=======
>>>>>>> 2d20a783bb75ab3f3d3b16d12efc433ac235daed
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