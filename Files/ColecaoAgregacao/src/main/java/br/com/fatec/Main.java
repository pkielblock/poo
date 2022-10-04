/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //cria o projeto
        Projeto prj = new Projeto();
        prj.setDescricao("Reformulação do SIGA");
        prj.setValor(15000);
        //colocar os participantes;
        Participante part = new Participante();
        
        part.setRegistro(30);
        part.setNome("Ana");
        //adiciona
        prj.adicionaParticipante(part);
        
        part = new Participante();
        part.setRegistro(10);
        part.setNome("Paula");
        //adiciona
        prj.adicionaParticipante(part);

        part = new Participante();
        part.setRegistro(1);
        part.setNome("Claudio");
        //adiciona
        prj.adicionaParticipante(part);
        
        part = new Participante();
        part.setRegistro(13);
        part.setNome("José");
        //adiciona
        prj.adicionaParticipante(part);

        System.out.println("Quem excluir? (registro):");
        int reg = teclado.nextInt();
        
        //excluindo
        Participante aux = prj.removeParticipante(reg);
        if(aux == null) 
            System.out.println("Participante não existe");
        else {
            System.out.println("Nome do excluido: " + aux.getNome());
        }

        //Listando os participantes
        System.out.println("\nParticipantes do projeto:");
        for (Participante p : prj.getParticipantes()) {
            System.out.println("Registro: " + p.getRegistro() + " - Nome: " + p.getNome());
            System.out.println("==================================");
        }
    }
}
