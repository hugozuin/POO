package org.example;

public class Pontuacao {

    private int pontuacao;

    public Pontuacao() {
        this.pontuacao = 0;
    }

    public void adicionarPontos(int pontos) {
        this.pontuacao += pontos;
    }

    public void removerPontos(int pontos) {
        if (pontos > 0 && this.pontuacao >= pontos) {
            this.pontuacao -= pontos;
        }
    }

    public int getPontuacao() {
        return this.pontuacao;
    }
}