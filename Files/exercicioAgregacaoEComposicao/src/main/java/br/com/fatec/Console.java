package br.com.fatec;

public class Console {
    private String nome;
    private int anoLancamento;
    private Fabricante fabricante;
    private Jogo jogo = new Jogo();

    public Console (String nome, int anoLancamento, Fabricante fabricante) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.fabricante = fabricante;
    }

    public void dados() {
        System.out.println("Nome do Console: " + nome);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Fabricante: " + fabricante.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
}
