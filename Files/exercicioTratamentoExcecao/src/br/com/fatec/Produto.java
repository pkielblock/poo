package br.com.fatec;

import br.com.fatec.exceptions.NomeException;
import br.com.fatec.exceptions.PrecoVendaException;

public class Produto {
    private String nome;
    private float lucro;
    private float precoCusto;
    private float precoVenda;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws NomeException {
        if(nome.length() < 5) {
            throw new NomeException("Tamanho do nome inválido");
        }
        else {
            this.nome = nome;
        }
    }

    public float getLucro() {
        return lucro;
    }

    private void setLucro(float lucro) {
        this.lucro = lucro;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) throws PrecoVendaException {
        if(precoVenda <= precoCusto) {
            throw new PrecoVendaException("Preço venda menor que de custo");
        }
        else {
            this.precoVenda = precoVenda;
        }
    }

    public void calculaLucro() throws Exception {
        if((precoVenda - precoCusto) < 150) {
            throw new Exception("Diferença entre Custo " + "\nVenda não pode ser menor que 150");
        }
        else {
            setLucro(precoVenda - precoCusto);
        }
    }
}
