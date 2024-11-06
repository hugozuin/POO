package org.example;

class Animal {
    // Metodo comum a todos os animais
    void emitirSom() {
        System.out.println("O animal faz um som.");
    }

    void acao(){
        System.out.println("\nO animal faz uma ação.");
    }
}

class CachorroH extends Animal{
    // Sobrescrita do metodo emitirSom
    @Override
    void emitirSom() {
        System.out.println("O cachorro late.");
    }

    @Override
    void acao(){
        System.out.println("O cachorro brinca.");
    }
}

class Gato extends Animal{
    @Override
    void emitirSom() {
        System.out.printf("O gato mia.");
    }

    @Override
    void acao(){
        System.out.println("\nO gato dorme.");
    }
}