package br.com.fatec;

public class Jogo {
    private String nome;
    private int qtdJogadores;
    private boolean online;

    public Jogo() {
        this.nome = "Sem Informação";
        this.qtdJogadores = 0;
        this.online = false;
    }

    public Jogo(String nome) {
        this();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdJogadores() {
        return qtdJogadores;
    }

    public void setQtdJogadores(int qtdJogadores) {
        this.qtdJogadores = qtdJogadores;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }
}
