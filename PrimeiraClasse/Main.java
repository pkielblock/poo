/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Main {
    //Main method
    public static void main(String[] args) {
        //Instanciado um objeto
        Conta conta = new Conta();
        
        //Entrada de dados estatica
        conta.setNome("Pedro");
        conta.setNumero(155);
        conta.setLimite(5000);
        conta.setSaldo(4000);
        
        System.out.println("Nome: " + conta.getNome());
        System.out.println("Numero: " + conta.getNumero());
        System.out.println("Limite: " + conta.getLimite());
        System.out.println("Saldo: " + conta.getSaldo() + "\n");
        
        //Instanciando nova conta
        Conta conta2 = new Conta();
        
        //Criando uma entrada via teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do titular: ");
        conta2.setNome(sc.nextLine());
        
        //Limpa o buffer do teclado (antigo fflush()) | Limpar quando mudar tipo de dados
        //sc.nextLine();
       
        System.out.println("Digite o numero da conta: ");
        conta2.setNumero(sc.nextInt());
        
        conta2.setLimite(5000);
        

        if(conta.transferir(conta2, 700)){
            System.out.println("Transferencia efetuada");
        } else {
            System.out.println("Conta nao existe ou saldo insuficiente");
        }
        
        System.out.println("\nNome: " + conta2.getNome());
        System.out.println("Numero: " + conta2.getNumero());
        System.out.println("Limite: " + conta2.getLimite());
        System.out.println("Saldo: " + conta2.getSaldo() + "\n");
        
        System.out.println("\nNome: " + conta.getNome());
        System.out.println("Numero: " + conta.getNumero());
        System.out.println("Limite: " + conta.getLimite());
        System.out.println("Saldo: " + conta.getSaldo() + "\n");
    }
}
