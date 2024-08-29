package org.example;

public class Biblioteca {

    public static void main(String[] args){
        Livro livro1 = new Livro("Dom casmurro", "Machado de Assis", "2022");
        Livro livro2 = new Livro("Código limpo", "Um cara ai", "1990");

        System.out.println("Qual o titulo do livro1: " + livro1.getTitulo());
        System.out.println("Qual o titulo do livro2: " + livro2.getTitulo());
    }
}
