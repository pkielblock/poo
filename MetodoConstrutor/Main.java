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
    public static void main(String[] args) {
        //Criando dois objetos
        
        Produto p1, p2;
        p1 = new Produto(1, "Poco X4 GT");
        p2 = new Produto(2, "Mi 12");
        
        //Mostrando os dados
        System.out.println("Codigo de P1: " + p1.getCodigo());
        System.out.println("Fornecedor de P1: " + p1.getFornecedor());
        System.out.println("Descricao de P1: " + p1.getDescricao());
        
        System.out.println("\nCodigo de P2: " + p2.getCodigo());
        System.out.println("Fornecedor de P2: " + p2.getFornecedor());
        System.out.println("Descricao de P2: " + p2.getDescricao());
    }
}
