/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author aluno
 */
public class Projeto {
    private String descricao;
    private float valor;
    //coelção
    private Set<Participante> participantes = new HashSet<>();
 
    //getters e setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Set<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Set<Participante> participantes) {
        this.participantes = participantes;
    }
    
    //metodos
    /**
     * Adiciona um participante ao projeto em questão
     * @param participante
     */
    public void adicionaParticipante(Participante participante) {
        //adicionar na coleção
        participantes.add(participante);
    }
    
    public Participante removeParticipante(int registro) {
        //cria um obj auxiliar para conter somente o num
        //do registro
        Participante partAux = new Participante();

        //coloca o num do registro dentro deste objeto
        partAux.setRegistro(registro);

        //vamos remover o participante da coleção
        for (Participante aux : participantes) {
            //verifica se o objeto dentro da coleção
            //é igual ao registro do parametro
            if(partAux.equals(aux)) {
                participantes.remove(partAux);
                return aux; //devolve o objeto encontrado
            }
        }

        return null; //não achou ninguem
    }
}
