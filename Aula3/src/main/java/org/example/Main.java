package org.example;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(2,2);


        System.out.println("Somar: " + calc.somar());
        System.out.println("Subtrair: " + calc.subtrair());
        System.out.println("Qual o valor de A? " + calc.getNumeroA());
        System.out.println("Qual o valor de B? " + calc.getNumeroB());
    }
}