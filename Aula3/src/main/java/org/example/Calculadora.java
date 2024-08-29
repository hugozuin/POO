package org.example;

public class Calculadora {
    private int numeroA;
    private int numeroB;

    public Calculadora(int numeroA, int numeroB){
        this.numeroA = numeroA;
        this.numeroB = numeroB;
    }


    public int somar(){
        return numeroA + numeroB;
    }

    public int subtrair(){
        return numeroA - numeroB;
    }

    public int getNumeroA(){
        return numeroA;
    }

    public void setNumeroA(int numeroA){
        this.numeroA = numeroA;
    }

    public int getNumeroB() {
        return numeroB;
    }

    public void setNumeroB(int numeroB) {
        this.numeroB = numeroB;
    }
}