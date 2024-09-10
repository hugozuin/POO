package org.example;

public class Mago extends Personagem {
    private int mana;
    private int poderMagico;

    public Mago(String nome, int nivel, int hp, int atk, int def, int mana, int poderMagico) {
        super(nome, nivel, hp, atk, def);
        this.mana = mana;
        this.poderMagico = poderMagico;
    }

    public void lancarMagia(Personagem inimigo) {
        if (this.mana >= 10) {
            int danoMagico = Math.max(0, this.poderMagico - inimigo.def); // Calcula dano mágico
            inimigo.receberDano(danoMagico);
            this.mana -= 10; // Reduz a mana
        }
    }

    public int getMana() {
        return this.mana;
    }
}
