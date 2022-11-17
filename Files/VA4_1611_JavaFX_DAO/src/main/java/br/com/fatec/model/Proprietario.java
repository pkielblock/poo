/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.model;

/**
 *
 * @author Viotti
 */
public class Proprietario {
    private int codProprietario;
    private String nome;
    
    //construtor
    public Proprietario() {    
    }

    @Override
    public String toString() {
        return nome;
    }

    
    public Proprietario(int codProprietario, String nome) {
        this.codProprietario = codProprietario;
        this.nome = nome;
    }
    
    //getters e setters
    public int getCodProprietario() {
        return codProprietario;
    }

    public void setCodProprietario(int codProprietario) {
        this.codProprietario = codProprietario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
