package br.com.fatec;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Objects;

/**
 *
 * @author aluno
 */
public class Participante {
    private int registro;
    private String nome;
    
    //criar equals e hashcode baseado em 'registro'
    //para comparação de objetos
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participante that = (Participante) o;
        return registro == that.registro;
    }

    @Override
    public int hashCode() {
        return Objects.hash(registro);
    }

    //getters e setters
    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
