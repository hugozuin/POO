package org.example;

public class Livro {
   private String titulo; //atributo
   private String autor;
   private String anoPublicacao;
   private boolean disponibilidade;

    public Livro(String titulo, String autor, String anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponibilidade = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

}
