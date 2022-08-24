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
public class Conta {
    private int numero;
    private String nome;
    private float saldo, limite;
    
    //Methods
    /**
     * Transfere um valor para uma conta de destino
     * @param conta - Conta que recebe o dinheiro
     * @param valor - Valor a ser transferido
     * @return True - A transferencia foi efetuada com sucesso <br>
     *         False - Saldo insuficiente
     */
    public boolean transferir(Conta conta, float valor) {
        if(this.saldo < valor) {
            return false; //Saldo insuficiente
        } else {
            //retira o valor da conta
            this.setSaldo(getSaldo() - valor);
            
            //faz o deposito na outra conta
            conta.setSaldo(conta.getSaldo() + valor);
            return true;
        }
    }
    
    //Getters
    public float getLimite() {
        return limite;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }
    
    //Setters
    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
