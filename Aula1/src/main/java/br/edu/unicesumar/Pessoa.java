package br.edu.unicesumar;

public class Pessoa{
    //ATRIBUTOS
    public String nome;

    //CONSTRUTOR
    public Pessoa(String parametroNome){
        this.nome = parametroNome;
    }

    //METODO
    public void imprimir(){
        System.out.println("Nome: " + nome);
    }
}
