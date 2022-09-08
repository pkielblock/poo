package br.com.fatec;

public class Main {
    public static void main(String[] args) {
        Diretor diretor = new Diretor("João", 5600.00, 1, 600.00, new Secretaria("Kelly", 2500.00, 2));
        diretor.setVeiculo(new Veiculo("BMW X6", "BMW-0000"));

        System.out.println("Nome da Secretária: " + diretor.getSecretaria().getNome());
        System.out.println("Salário Atual Diretor: " + diretor.getSalarioComBonificacao());
        System.out.println("Salária Atual Secretária: " + diretor.getSecretaria().getSalario());
        System.out.println("Placa do Veiculo: " + diretor.getVeiculo().getPlaca());
        System.out.println("Salário Original Diretor: " + diretor.getSalario());
    }
}