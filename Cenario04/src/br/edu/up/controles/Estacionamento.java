package br.edu.up.controles;

import br.edu.up.modelos.Carro;

public class Estacionamento {
    private Carro[] vagas = new Carro[10];

    public boolean registrarEntrada(Carro veiculo) {
        for (int i = 0; i < 10; i++) {
            if (vagas[i] == null) {
                vagas[i] = veiculo;
                return true;
            }
        }
        return false; 
    }

    public Carro buscarVeiculoPorPlaca(String placa) {
        for (Carro veiculo : vagas) {
            if (veiculo != null && veiculo.getPlaca().equals(placa)) {
                return veiculo;
            }
        }
        return null; 
    }

    public boolean registrarSaida(Carro veiculo) {
        for (int i = 0; i < 10; i++) {
            if (vagas[i] == veiculo) {
                vagas[i] = null;
                return true;
            }
        }
        return false; 
    }

    public int getVagasDisponiveis() {
        int vagasDisponiveis = 0;
        for (Carro veiculo : vagas) {
            if (veiculo == null) {
                vagasDisponiveis++;
            }
        }
        return vagasDisponiveis;
    }
}
