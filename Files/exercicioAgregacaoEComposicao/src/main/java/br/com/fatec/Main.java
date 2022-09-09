package br.com.fatec;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeConsole, nomeFabricante, nomeJogo;
        int anoLancamento;
        boolean jogoOnline;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do console: ");
        nomeConsole = scanner.nextLine();
        System.out.print("Digite o ano de lançamento do console: ");
        anoLancamento = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome do fabricante: ");
        nomeFabricante = scanner.nextLine();
        System.out.print("Digite o nome do jogo: ");
        nomeJogo = scanner.nextLine();
        System.out.print("Digite a quantidade de Jogadores: ");
        int qtdJogadores = scanner.nextInt();
        scanner.nextLine();
        System.out.print("O jogo é online? (true/false): ");
        jogoOnline = scanner.nextBoolean();

        Console console = new Console(nomeConsole, anoLancamento, new Fabricante());
        console.getFabricante().setNome(nomeFabricante);

        System.out.println("\n");
        console.dados();

        Jogo jogo = new Jogo(nomeJogo);
        jogo.setQtdJogadores(qtdJogadores);
        jogo.setOnline(jogoOnline);

        System.out.println("Nome do jogo: " + jogo.getNome());
        System.out.println("Quantidade de jogadores: " + jogo.getQtdJogadores());
        if (jogo.isOnline()) {
            System.out.println("Online: Sim");
        } else {
            System.out.println("Online: Não");
        }
    }
}
