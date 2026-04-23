package com.mycompany.main;

public class Pokemon {
    public String nombre;
    public String tipo;
    public int vida;
    public int vidaMaxima;
    public int ataque;
    public int defensa;
    public int ataqueEspecial;
    public int defensaEspecial;

    public int contadorAtaquesNormales;
    public int contadorDefensasNormales;

    public Pokemon(String nombre, String tipo, int vida, int ataque, int defensa, int ataqueEspecial, int defensaEspecial) {
        this.nombre = nombre;
        this.tipo = tipo;
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
        return contadorAtaquesNormales >= 2;
    }

    public boolean puedeUsarDefensaEspecial() {
        return contadorDefensasNormales >= 2;
    }

    public void consumirAtaqueEspecial() {
        contadorAtaquesNormales = 0;
    }

    public void consumirDefensaEspecial() {
        contadorDefensasNormales = 0;
    }

    public boolean esFuerteContra(String tipoRival) {
        return FabricaPokemon.obtenerFuerteContra(tipo).equals(tipoRival);
    }

    public boolean esDebilContra(String tipoRival) {
        return FabricaPokemon.obtenerDebilContra(tipo).equals(tipoRival);
    }

    public int getAtaqueContra(String tipoRival, boolean especial) {
        int valor = especial ? ataqueEspecial : ataque;

        if (especial && esFuerteContra(tipoRival)) {
            if ("Agua".equals(tipo)) {
                return ataqueEspecial + 10;
            }
            return ataqueEspecial + 5;
        }

        if (!especial) {
            if (esFuerteContra(tipoRival)) {
                valor += 10;
            } else if (esDebilContra(tipoRival)) {
                valor -= 10;
            }
        }

        return Math.max(1, valor);
    }

    public int getDefensaEspecialContra(String tipoAtacante) {
        if (esFuerteContra(tipoAtacante)) {
            if ("Fuego".equals(tipo) || "Agua".equals(tipo)) {
                return defensaEspecial + 10;
            }
            return defensaEspecial + 5;
        }
        return defensaEspecial;
    }
}