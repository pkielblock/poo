package br.com.fatec;

public class Gerente extends Funcionario {
    private String secretaria;

    public Gerente(String nome) {
        super(nome); //super(); chama o construtor da super classe assim como this(); chama o construtor da propria classe
    }
    //Polimorfismo de Sobrecarga (Propria Classe) - Mesmo nome de método, mas com parametros diferentes
    //Polimorfismo de Sobrescrita (Classe que herda) - Método com mesmo nome, mas com comportamento diferente
    @Override //Sobrescrevendo o método listarDados da classe pai
    public void listarDados() {
        //Chamando o metodo listarDados() da classe pai - Funcionario
        super.listarDados();
        System.out.println("Secretaria: " + this.secretaria);
    }

    public String getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(String secretaria) {
        this.secretaria = secretaria;
    }
}