/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

import java.util.Objects;

/**
 *
 * @author Aluno
 */
public class Corrente {
    private String nome;
    private double saldo;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Corrente corrente = (Corrente) o;
        return Objects.equals(nome, corrente.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    public Corrente(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}