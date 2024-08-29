package org.example;

public class Livro {
    private String titulo;
    private String autor;
    private String anoPublicacao;
    private boolean disponibilidade;


    public Livro(String titulo, String autor, String ano){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = ano;
        this.disponibilidade = true;
    }

    public Livro(boolean disponibilidade, String anoPublicacao, String autor, String titulo) {
        this.disponibilidade = disponibilidade;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getTitulo(){
        return  titulo;
    }
}
