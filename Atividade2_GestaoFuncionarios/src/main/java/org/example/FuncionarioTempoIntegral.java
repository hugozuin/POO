package org.example;

public class FuncionarioTempoIntegral extends Funcionario {
    private double bonusPercentual;

    public FuncionarioTempoIntegral(String nome, String cpf, double salarioBase, double bonusPercentual) {
        super(nome, cpf, salarioBase);
        this.bonusPercentual = bonusPercentual;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (getSalarioBase() * bonusPercentual / 100);
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Salário Base: " + getSalarioBase());
        System.out.println("Bônus Percentual: " + bonusPercentual + "%");
        System.out.println("Salário Calculado: " + calcularSalario());
    }
}
