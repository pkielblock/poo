package br.com.fatec;

public class Gerente extends Funcionario {
    private double bonificacao;
    private int ferias;
    private Secretaria secretaria;
    private double salarioComBonificacao;

    public Gerente(String nome, double salario, int registro, double bonificacao, Secretaria secretaria) {
        super(nome, salario, registro);
        this.secretaria = secretaria;
        this.bonificacao = bonificacao;
        this.setSalarioComBonificacao(salario, bonificacao);
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public double getSalarioComBonificacao() {
        return salarioComBonificacao;
    }

    public void setSalarioComBonificacao(double salario, double bonificacao) {
        this.salarioComBonificacao = (salario + bonificacao);
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    @Override
    public void setFerias() {
        this.ferias = 40;
    }
}
