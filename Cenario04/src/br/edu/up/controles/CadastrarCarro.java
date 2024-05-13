// Estacionamento.java
package br.edu.up.controles;

import java.util.ArrayList;
import java.util.List;
import br.edu.up.modelos.Carro;

public class CadastrarCarro {
    private int NUM_VAGAS = 10;
    private List<Carro> vagas;
    private int totalEntradas = 0;
    private int totalSaidas = 0;

    public CadastrarCarro() {
        this.vagas = new ArrayList<>();
    }

    public boolean adcionarVeiculo(Carro veiculo) {
        if (vagas.size() < NUM_VAGAS) {
            vagas.add(veiculo);
            totalEntradas++;
            return true;
        }
        return false;
    }

    public Carro removerVeiculo(String placa) {
        for (int i = 0; i < vagas.size(); i++) {
            Carro veiculo = vagas.get(i);
            if (veiculo.getPlaca().equals(placa)) {
                vagas.remove(i);
                totalSaidas++;
                return veiculo;
            }
        }
        return null;
    }

    public int getTotalVeiculos() {
        return vagas.size();
    }

    public int getTotalEntradas() {
        return totalEntradas;
    }

    public int getTotalSaidas() {
        return totalSaidas;
    }

    public double getValorPagamentos() {
        return totalSaidas * 5.00;
    }
}
