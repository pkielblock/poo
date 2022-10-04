package br.com.fatec;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Proprietario {
    private String nome;
    private String cpf;
    private Set<Veiculo> veiculos = new HashSet<>();

    public Proprietario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void addVeiculo(Veiculo veiculo) {
        int cont = 0;
        for (Veiculo aux : veiculos) {
            cont++;
        }
        if (cont < 5) {
            if (veiculos.add(veiculo)) {
                System.out.println("Veículo adicionado com sucesso!");
            } else {
                System.out.println("Veículo já cadastrado!");
            }
        } else {
            JFrame frame = new JFrame();
            int confirm = JOptionPane.showConfirmDialog(frame, "Deseja adicionar mais de 5 veículos?");
            if (confirm == JOptionPane.YES_OPTION) {
                if (veiculos.add(veiculo)) {
                    System.out.println("Veículo adicionado com sucesso!");
                } else {
                    System.out.println("Veículo já cadastrado! (Não será adicionado)");
                }
            }
        }
    }

    public float valorBens() {
        float valor = 0;
        Iterator<Veiculo> it = veiculos.iterator();
        while (it.hasNext()) {
            Veiculo veiculo = (Veiculo) it.next();
            valor += veiculo.getValor();
        }

        return valor;
    }

    public Set<Veiculo> removeVeiculo(String placa) {
        for (Veiculo aux : veiculos) {
            if (aux.getPlaca().equals(placa)) {
                veiculos.remove(aux);
                break;
            }
        }
        return veiculos;
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Set<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Set<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
}
