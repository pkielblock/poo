package br.com.fatec;

import java.util.Objects;

public class Veiculo {
    private String placa;
    private float valor;

    //Constructor
    public Veiculo(String placa, float valor) {
        this.placa = placa;
        this.valor = valor;
    }

    //Equals and HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Veiculo veiculo)) return false;
        return Float.compare(veiculo.valor, valor) == 0 && Objects.equals(placa, veiculo.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa, valor);
    }

    //Getters and Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
