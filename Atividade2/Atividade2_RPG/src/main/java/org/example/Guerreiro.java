package org.example;

public class Guerreiro extends Personagem {
    private int forcaExtra;
    private int armadura;

    public Guerreiro(String nome, int nivel, int hp, int atk, int def, int forcaExtra, int armadura) {
        super(nome, nivel, hp, atk, def);
        this.forcaExtra = forcaExtra;
        this.armadura = armadura;
    }

    @Override
    public void atacar(Personagem inimigo) {
        int dano = Math.max(0, this.atk + this.forcaExtra - inimigo.def);
        inimigo.receberDano(dano);
    }

    @Override
    public void receberDano(int dano) {
        int danoFinal = Math.max(0, dano - this.armadura);
        super.receberDano(danoFinal);
    }
}
