package br.com.fatec;

import br.com.fatec.exceptions.CPFException;

import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        trataExcecaoDeClasses();
    }

    private static void trataExcecaoDeClasses() {
        Pessoa p = new Pessoa();

        //Atribuindo Dados
        p.setNome("Carlos da Silva");

        //Tratando Exceção
        try {
            p.setCpf("123.456.789-000");
            p.setIdade(44);
        } catch (IOException | CPFException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void trataExcecao() {
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int outroNumero = 0;
        boolean erro = true;

        while (erro) {
            try {
                System.out.println("Digite o valor de um número: ");
                numero = sc.nextInt();

                System.out.println("Digite outro valor de um número: ");
                outroNumero = sc.nextInt();

                erro = false;

                //Mostra divisão
                System.out.println("Divisão: " + (numero / outroNumero));

                //Acessar Arquivo
                FileReader f = new FileReader("C:\\teste.zip"); //Arquivo não existe
            } catch (InputMismatchException e) {
                System.out.println("O valor digitado não é um número inteiro.");
                System.out.println("Erro: " + e.getMessage());
                sc.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Não é possível dividir por zero.");
                System.out.println("Erro: " + e.getMessage());
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
                sc.nextLine();
            }
        }
        System.out.println("Numero Digitado: " + numero);
    }
}