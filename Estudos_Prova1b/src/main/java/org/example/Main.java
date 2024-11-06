package org.example;

public class Main {
    public static void main(String[] args) {
        /*   Classe e Objeto (Classe Cachorro)
        Cachorro meuCachorro = new Cachorro(); // Criando um objeto da classe Cachorro
        meuCachorro.nome = "Buddy"; // Definindo valores para o objeto
        meuCachorro.idade = 3;

        meuCachorro.latir(); // Chamando o metodo do objeto
        */

        /*   Encapsulamento (Classe Pessoa)
        Pessoa p = new Pessoa(); // Criando um objeto da classe Pessoa
        p.setNome("João"); // Usando o setter para definir o nome
        System.out.println(p.getNome()); // Usando o getter para obter o nome
        */

        Animal meuAnimal = new Animal();
        meuAnimal.emitirSom(); // Chama o metodo da superclasse Animal
        meuAnimal.acao();

        CachorroH meuCachorro = new CachorroH();
        meuCachorro.emitirSom(); // Chama o metodo sobrescrito da subclasse Cachorro

        Gato meuGato = new Gato();
        meuGato.emitirSom(); // Chama o metodo sobrescrito da subclasse Gato
        meuGato.acao();




    }
}