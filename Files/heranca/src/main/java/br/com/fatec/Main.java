package br.com.fatec;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Pedro");

        gerente.setCpf("123.456.789-00");
        gerente.setSalario(5000);
        gerente.setSecretaria("Maria");

        gerente.listarDados();
    }
}