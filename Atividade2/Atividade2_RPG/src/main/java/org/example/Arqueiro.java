package org.example;

public class Arqueiro extends Personagem {
    private int precisao;
    private int alcance;

    public Arqueiro(String nome, int nivel, int hp, int atk, int def, int precisao, int alcance) {
        super(nome, nivel, hp, atk, def);
        this.precisao = precisao;
        this.alcance = alcance;
    }

    public void atirarFlecha(Personagem inimigo) {
        int dano = Math.max(0, this.atk + this.precisao - inimigo.def);
        inimigo.receberDano(dano);
    }
}