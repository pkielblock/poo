package br.com.fatec;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Proprietario> proprietarios = new HashSet<>();

        Proprietario p1 = new Proprietario("João", "123456789");
        p1.addVeiculo(new Veiculo("ABC1234", 10000));
        p1.addVeiculo(new Veiculo("ABC1235", 20000));
        p1.addVeiculo(new Veiculo("ABC1236", 30000));
        p1.addVeiculo(new Veiculo("ABC1237", 40000));
        p1.addVeiculo(new Veiculo("ABC1238", 50000));
        p1.addVeiculo(new Veiculo("ABC1239", 60000));

        //Adicionando um repetido
        p1.addVeiculo(new Veiculo("ABC1239", 60000));

        proprietarios.add(p1);

        for (Proprietario aux : proprietarios) {
            System.out.println("Valor total de bens: " + aux.valorBens());
        }

        //Finalizando programa
        System.exit(0);
    }
}
