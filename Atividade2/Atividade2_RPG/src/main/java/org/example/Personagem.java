package org.example;

public class Personagem {
    protected String nome;
    protected int nivel;
    protected int hp;
    protected int atk;
    protected int def;

    public Personagem(String nome, int nivel, int hp, int atk, int def) {
        this.nome = nome;
        this.nivel = nivel;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    public void atacar(Personagem inimigo) {
        int dano = Math.max(0, this.atk - inimigo.def);
        inimigo.receberDano(dano);
    }

    public void receberDano(int dano) {
        this.hp = Math.max(0, this.hp - dano);
    }

    public boolean estaVivo() {
        return this.hp > 0;
    }

    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("HP: " + hp);
        System.out.println("ATK: " + atk);
        System.out.println("DEF: " + def);
    }

    public int getHp() {
        return this.hp;
    }
}
