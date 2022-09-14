
package br.com.fatec;

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
        Exemplo_List(); //LIST - Baseado em Arrays
        
        //Exemplo_Set(); //SET - Baseado em Ponteiro
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
        System.out.println("Elemento 2:" + nomes.get(2));
        System.out.println("Elemento 1:" + nomes.elementAt(1));
        
        //removendo um elemento
        nomes.remove(0);
        nomes.removeElement("Ana");
        if(nomes.remove("Antonio") == false) {
            System.out.println("Antonio não Removido");
        }
        else {
            System.out.println("Antonio Removido");
        }
        
        System.out.println("Qtd Elementos atual: " + nomes.size());
        
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
        nomes.forEach(aux -> {
            System.out.println("Nome: " + aux);
        });
        
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
        /*
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
        System.out.println("Total inserido: " + nomes.size());
        
        /**
         * NÃO É POSSÍVEL ACESSAR UM ELEMENTO
         * ESPECÍFICO
         * //exibindo alguns dados
         * System.out.println("Elemento 2:" + nomes.get(2));
         * System.out.println("Elemento 1:" + nomes.elementAt(1));
         */
        /*
        //removendo um elemento
        nomes.remove(0);
        nomes.removeElement("Ana");
        if(nomes.remove("Antonio") == false) {
            System.out.println("Antonio não Removido");
        }
        else {
            System.out.println("Antonio Removido");
        }
        
        System.out.println("Qtd Elementos atual: " + nomes.size());
        
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
        nomes.forEach(aux -> {
            System.out.println("Nome: " + aux);
        });
        
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
    */
    }
}