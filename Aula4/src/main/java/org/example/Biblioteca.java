package org.example;

public class Biblioteca {

    public static void main(String[] args) {

        Livro livro = new Livro("É assim que acaba","Colleen Hoover","2021");
        Livro livro2 = new Livro("Algum ai", "Zé Ninguém", "1957");

        System.out.println("Qual o nome do livro? " + livro.getTitulo() +
                "\n Qual o livro 2? " + livro2.getTitulo());
        System.out.println("Qual o autor do livro? " + livro.getAutor());
        System.out.println("Qual o ano de publicação do livro? " + livro.getAnoPublicacao());
        System.out.println("O Livro está disponível? " + livro.isDisponibilidade());
    }

}
