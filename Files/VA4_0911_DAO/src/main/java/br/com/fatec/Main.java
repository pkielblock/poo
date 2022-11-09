/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

import br.com.fatec.DAO.ProprietarioDAO;
import br.com.fatec.model.Proprietario;
import br.com.fatec.persistencia.Banco;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Viotti
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Conectando ....");
            //testar a conexao
            Banco.conectar();
            System.out.println("Conectado!!!");
            
            System.out.println("Fechando ....");
            Banco.desconectar();
            System.out.println("Fechado!!!!");
            
            //incluir();
            
            pesquisar(2);
            
            listar(""); //lista todo mundo
            listar("nome like '%a'"); //lista todo mundo que termina o nome com 'a'
        } catch (SQLException ex) {
            System.out.println("Erro na Conexao: " + ex.getMessage());
        }
    }

    public static void incluir() {
        ProprietarioDAO dao = new ProprietarioDAO();
        
        //objeto para incluir no banco, dados que podem vir da tela
        Proprietario p = new Proprietario(6, "Cleber Oliveira");
        
        try {
            if(dao.insere(p)) {
                System.out.println("Incluido com sucesso");
            }
            else {
                System.out.println("Não foi incluido");
            }
        } catch (SQLException ex) {
            System.out.println("Erro de Inclusão: " + ex.getMessage());
        }
    }
    
    public static void pesquisar(int chave) {
        ProprietarioDAO dao = new ProprietarioDAO();
        
        //objeto para incluir no banco
        Proprietario p = new Proprietario();
        p.setCodProprietario(chave);
        
        try {
            p = dao.buscaID(p);
            if(p != null) {
                System.out.println("Codigo: " + p.getCodProprietario());
                System.out.println("Nome: " + p.getNome());
            }
            else {
                System.out.println("Não foi encontrado");
            }
        } catch (SQLException ex) {
            System.out.println("Erro de Pesquisa: " + ex.getMessage());
        }
    }

    private static void listar(String criterio) {
        ProprietarioDAO dao = new ProprietarioDAO();
        ArrayList<Proprietario> listaProp;
        
        try {
            //faz a pesquisa
            listaProp = (ArrayList)dao.lista(criterio);
            
            for (Proprietario proprietario : listaProp) {
                System.out.println("Codigo: " + proprietario.getCodProprietario());
                System.out.println("Nome: " + proprietario.getNome());
                System.out.println("-----------------------------------------------------------");
            }
        } catch (SQLException ex) {
            System.out.println("Erro de Listagem: " + ex.getMessage());
        }
    }
}
