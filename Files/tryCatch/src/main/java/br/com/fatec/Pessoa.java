package br.com.fatec;

import br.com.fatec.exceptions.CPFException;

import java.io.IOException;

public class Pessoa {
    private String nome, cpf;
    private int idade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws IOException {
        if(idade < 0) {
            //Lança uma exceção para ser:
            //Verificada se usa IOException
            //NÃO verificada se usa RuntimeException
            throw new IOException("Idade não pode ser negativa");
        }
        this.idade = idade;
    }

    public String getCpf() throws CPFException{
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.length() != 14) {
            throw new CPFException("CPF Inválido");
        }
        this.cpf = cpf;
    }
}
