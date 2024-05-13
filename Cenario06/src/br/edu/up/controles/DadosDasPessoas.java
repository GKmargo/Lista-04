package br.edu.up.controles;

import br.edu.up.modelos.Passageiro;
import br.edu.up.modelos.Tripulante;
import java.util.ArrayList;
import java.util.List;

public class DadosDasPessoas {
    private List<Passageiro> passageiros;
    private List<Tripulante> tripulacao;

    public DadosDasPessoas() {
        passageiros = new ArrayList<>();
        tripulacao = new ArrayList<>();
    }

    public void adicionarPassageiro(Passageiro passageiro) {
        passageiros.add(passageiro);
    }

    public void adicionarTripulante(Tripulante tripulante) {
        tripulacao.add(tripulante);
    }

    public List<Passageiro> listarPassageiros() {
        return passageiros;
    }

    public List<Tripulante> listarTripulacao() {
        return tripulacao;
    }
}
