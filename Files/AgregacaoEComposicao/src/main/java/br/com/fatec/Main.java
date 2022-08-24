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
        Produto produto1 = new Produto();
        produto1.setCodigo(1);
        produto1.setDescricao("Regua");
        //Agregacao com fornecedor
        //Primeiro pegar o objeto em questao e entao chamar os metodos desse objeto para setar os atributos
        produto1.getFornecedor().setNome("Faber Castel");
        
        //Outra forma de fazer a mesma coisa de cima
        Produto produto2 = new Produto();
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("Pilot");
        produto2.setCodigo(2);
        produto2.setDescricao("Caneta para quadro branco");
        //Fazendo agragacao de outra forma
        produto2.setFornecedor(fornecedor);
        
        fornecedor.setNome("Bic");
    }
}
