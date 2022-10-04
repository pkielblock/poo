/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        //chamando os exemplos
        //Exemplo_List();

        //Exemplo_Set();

        Exemplo_Generics();
    }

    public static void Exemplo_List() {
        //Coleção de String
        Vector nomes = new Vector();

        //adicionando dados
        nomes.add("João");
        nomes.add("Pedro");
        nomes.add("Ana");
        nomes.add("Joana");
        nomes.add("Pedro"); //aceita duplicados

        nomes.add(100);
        nomes.add(10.87);

        //quantos elementos existem
        System.out.println("Total inserido: " +
                nomes.size());

        //exibindo alguns dados
        System.out.println("Elemento 2:" +
                nomes.get(2)); //Ana
        System.out.println("Elemento 1:" +
                nomes.elementAt(1)); //Pedro

        //removendo um elemento
        nomes.remove(0);
        nomes.removeElement("Ana");
        if(nomes.remove("Antonio") == false)
            System.out.println("Antonio não Removido");
        else
            System.out.println("Antonio Removido");

        System.out.println("Qtd Elementos atual: " +
                nomes.size());


        //listando todos os elementos
        //usando for normal (só funciona para LIST)
        System.out.println("Listando");
        for(int i=0; i < nomes.size(); i++) {
            System.out.println("Nome: " + nomes.get(i));
        }

        //usando foreach (enhanced for)
        System.out.println("Listando_2");
        for (Object aux : nomes) {
            System.out.println("Nome: " + aux);
        }

        //usando ITERADORES
        System.out.println("Listando_3");
        Iterator it = nomes.iterator(); //cria um obj iterador
        while(it.hasNext()) { //verifica se tem prx elmt
            Object aux = it.next(); //lê o prx elemento
            System.out.println("Nome: " + aux);
        }

        //usnado expressão lambda
        System.out.println("Listando_4");
        nomes.forEach(aux -> {
            System.out.println("Nome: " + aux);
        });
    }

    public static void Exemplo_Set(){

        //Coleção de String
        HashSet nomes = new HashSet();

        //adicionando dados
        nomes.add("João");
        nomes.add("Pedro");
        nomes.add("Ana");
        nomes.add("Joana");
        nomes.add("Pedro"); //NÃO aceita duplicados

        nomes.add(100);
        nomes.add(10.87);

        //quantos elementos existem
        System.out.println("Total inserido: " +
                nomes.size());

        /**
         * NÃO É POSSÍVEL ACESSAR UM ELEMENTO
         * ESPECÍFICO
         * //exibindo alguns dados
         * System.out.println("Elemento 2:" +
         *       nomes.get(2));
         * System.out.println("Elemento 1:" +
         *       nomes.elementAt(1));
         */

        //removendo um elemento
        nomes.remove(0); //não remove ninguem, pois não existe o
        //conteudo '0'
        //nomes.removeElement("Ana"); não existe esse método
        if(nomes.remove("Antonio") == false)
            System.out.println("Antonio não Removido");
        else
            System.out.println("Antonio Removido");

        System.out.println("Qtd Elementos atual: " +
                nomes.size());

        //listando todos os elementos
        /*
        //usando for normal (só funciona para LIST)
        System.out.println("Listando");
        for(int i=0; i < nomes.size(); i++) {
            System.out.println("Nome: " + nomes.get(i));
        }
        */

        //usando foreach (enhanced for)
        System.out.println("Listando_2");
        for (Object aux : nomes) {
            System.out.println("Nome: " + aux);
        }

        //usando ITERADORES
        System.out.println("Listando_3");
        Iterator it = nomes.iterator(); //cria um obj iterador
        while(it.hasNext()) { //verifica se tem prx elmt
            Object aux = it.next(); //lê o prx elemento
            System.out.println("Nome: " + aux);
        }

        //usnado expressão lambda
        System.out.println("Listando_4");
        nomes.forEach(aux -> {
            System.out.println("Nome: " + aux);
        });

    }

    /**
     * Exemplo do uso de coleções LIST ou SET com Parâmetros (GENERICS)
     */
    private static void Exemplo_Generics() {
        //cria uma coleção que aceita somente objetos do tipo Corrente
        //HashSet<Corrente> contas = new HashSet<>();
        //HashSet<String> nomes = new HashSet<>();
        Collection<Corrente> contas = new Vector<>();
        Collection<String> nomes = new ArrayList<>();

        //criando algumas contas
        Corrente c1 = new Corrente("Carlos", 4500);
        Corrente c2 = new Corrente("Pedro", 7200);
        Corrente c3 = new Corrente("Pedro", 2400);
        //***ATENÇÃO c2 é diferente de c3!!!!

        nomes.add("Heloisa");
        //nomes.add(c1); //dá erro, pois aceita somente String

        contas.add(c3);
        contas.add(c1);
        contas.add(c2);
        //contas.add("Mario");dá erro, pois aceita somente Corrente

        //listar os dados Contas
        for (Corrente conta : contas) {
            System.out.println("Nome:" + conta.getNome());
            System.out.println("Saldo: " + conta.getSaldo());
        }

        System.out.println("----------------------------");

        //outra forma com CAST
        for (Object conta : contas) {
            System.out.println("Nome:" + ((Corrente)conta).getNome());
            System.out.println("Saldo: " + ((Corrente)conta).getSaldo());
        }

        //eliminado os objetos iniciais
        c1 = null;
        c2 = null;
        c3 = null;
        //removendo um elemento
        Corrente procura = new Corrente("Pedro", 0);
        System.out.println("HashCode da procura: " + procura.hashCode());

        //remove todos os pedros
        //while(contas.remove(procura));

        if(contas.remove(procura))
            System.out.println("Pedro foi Removido");
        else
            System.out.println("Não encontrei o pedro");

        System.out.println("Listado depois de remover");
        //listando o que sobrou
        for (Corrente conta : contas) {
            System.out.println("HashCode: " + conta.hashCode());
            System.out.println("Nome:" + conta.getNome());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println("------------------------");
        }
    }
}