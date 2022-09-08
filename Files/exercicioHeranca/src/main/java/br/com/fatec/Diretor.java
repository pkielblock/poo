package br.com.fatec;

public class Diretor extends Gerente {
    public Veiculo veiculo;

    public Diretor(String nome, double salario, int registro, double bonificacao, Secretaria secretaria) {
        super(nome, salario, registro, bonificacao, secretaria);
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}