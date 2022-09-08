package br.com.fatec;

public class Funcionario {
    private String nome;
    private double salario;
    private int registro;
    private int ferias;

    public Funcionario (String nome, double salario, int registro) {
        this.nome = nome;
        this.salario = salario;
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public int getFerias() {
        return ferias;
    }

    public void setFerias() {
        this.ferias = 30;
    }
}
