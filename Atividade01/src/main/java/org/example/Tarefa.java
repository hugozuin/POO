package org.example;

public class Tarefa {
    private String nome;
    private String prazo;
    private boolean  concluida;

    public Tarefa(String estudarJava, String date) {
        this.nome = nome;
        this.prazo = date;
        this.concluida = false;
    }

    public String getNome() {
        return nome;
    }

    public String getPrazo() {
        return prazo;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void concluirTarefa() {
        concluida = true;
    }

    public void alterarPrazo(String date) {

    }
}
