package br.com.fatec;

public class Diretor extends Funcionario {
    private double bonusSalarial;

    public Diretor(String nome) {
        super(nome);
    }

    public double getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(double bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }
}