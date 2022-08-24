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
public class Produto {

    private int codigo;
    private String descricao, fornecedor;
    
    //Construtores
    //
    /** 
     * Podemos ter quantos construtores quisermos
     * Precisamos alterar na hora de instanciar a classe qual metodo construtor sera utilizado
     * o que difere um do outro sao os parametros passados mais precisamentos os tipos de dados, as variaveis do parametro podem ter o mesmo nome
     * construtores com os mesmos tipos de dados porem em ordens diferentes significa que sao construtores diferentes
     * podemos chamar um construtor dentro de outro com o this(); ou this(parametros); | NECESSARIO ser o primeiro comando do metodo
     */
    public Produto() {
        this.fornecedor = "SEM INFORMAÇAO";
    }
    
    public Produto(int codigo, String descricao) {
        this(); //Chamando construtor dentro de outro - Precisa ser o primeiro comando do metodo
        this.codigo = codigo;
        //this.fornecedor = fornecedor;
        this.descricao = descricao;
    }
    
    //Getters and Setters
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
