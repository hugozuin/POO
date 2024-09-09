package org.example;

public class FuncionarioMeioPeriodo extends Funcionario {
    private int horasTrabalhadas;
    private double valorHora;

    public FuncionarioMeioPeriodo(String nome, String cpf, int horasTrabalhadas, double valorHora) {
        super(nome, cpf, horasTrabalhadas * valorHora); // Salário base calculado com base nas horas
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
        System.out.println("Valor por Hora: " + valorHora);
        System.out.println("Salário Calculado: " + calcularSalario());
    }
}
