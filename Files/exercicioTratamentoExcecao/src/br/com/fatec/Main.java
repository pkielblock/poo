package br.com.fatec;

import br.com.fatec.exceptions.NomeException;
import br.com.fatec.exceptions.PrecoVendaException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Scanner teclado = new Scanner(System.in);


        try {
            System.out.println("Nome do Produto: ");
            p1.setNome(teclado.next());

            System.out.println("Preço de Custo: ");
            p1.setPrecoCusto(teclado.nextFloat());

            System.out.println("Preço de Venda: ");
            p1.setPrecoVenda(teclado.nextFloat());

            p1.calculaLucro();
            System.out.println("\nNome do Produto: " + p1.getNome());
            System.out.println("Lucro: " + p1.getLucro());
        } catch (NomeException ex) {
            System.out.println("Erro Nome: " + ex.getMessage());
        } catch (PrecoVendaException ex) {
            System.out.println("Erro Preço: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
}
