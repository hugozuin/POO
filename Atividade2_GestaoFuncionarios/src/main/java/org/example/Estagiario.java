package org.example;

public class Estagiario extends Funcionario {
    private String instituicaoEnsino;
    private double bolsaAuxilio;

    public Estagiario(String nome, String cpf, String instituicaoEnsino, double bolsaAuxilio) {
        super(nome, cpf, bolsaAuxilio);  // Salário base é o valor da bolsa auxílio
        this.instituicaoEnsino = instituicaoEnsino;
        this.bolsaAuxilio = bolsaAuxilio;
    }

    @Override
    public double calcularSalario() {
        return bolsaAuxilio;
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Instituição de Ensino: " + instituicaoEnsino);
        System.out.println("Bolsa Auxílio: " + bolsaAuxilio);
    }
}
