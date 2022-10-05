package br.com.fatec;

import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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