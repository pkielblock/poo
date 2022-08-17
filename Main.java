/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

/**
 *
 * @author Aluno
 */
public class Main {
    //Main method
    public static void main(String[] args) {
        //Instanciado um objeto
        
        Conta conta = new Conta();
        
        conta.setNome("Pedro");
        conta.setNumero(155);
        conta.setLimite(5000);
        conta.setSaldo(4000);
        
        System.out.println("Nome: " + conta.getNome());
        System.out.println("Numero: " + conta.getNumero());
        System.out.println("Limite: " + conta.getLimite());
        System.out.println("Saldo: " + conta.getSaldo());
    }
}