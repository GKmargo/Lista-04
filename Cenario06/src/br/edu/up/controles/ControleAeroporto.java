package br.edu.up.controles;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.modelos.Aeronave;
import br.edu.up.modelos.Passageiro;
import br.edu.up.modelos.Passagem;
import br.edu.up.modelos.Tripulante;

public class ControleAeroporto {
    private List<Passageiro> passageiros;
    private List<Tripulante> tripulacao;
    private List<Aeronave> aeronaves;
    private List<Passagem> passagens;

    public ControleAeroporto() {
        passageiros = new ArrayList<>();
        tripulacao = new ArrayList<>();
        aeronaves = new ArrayList<>();
        passagens = new ArrayList<>();
    }

    public void adicionarPassageiro(Passageiro passageiro) {
        passageiros.add(passageiro);
    }

    public List<Passageiro> obterPassageiros() {
        return passageiros;
    }

    public void removerPassageiro(Passageiro passageiro) {
        passageiros.remove(passageiro);
    }

    public void adicionarTripulante(Tripulante tripulante) {
        tripulacao.add(tripulante);
    }

    public List<Tripulante> obterTripulacao() {
        return tripulacao;
    }

    public void removerTripulante(Tripulante tripulante) {
        tripulacao.remove(tripulante);
    }

    public void adicionarAeronave(Aeronave aeronave) {
        aeronaves.add(aeronave);
    }

    public List<Aeronave> obterAeronaves() {
        return aeronaves;
    }

    public void removerAeronave(Aeronave aeronave) {
        aeronaves.remove(aeronave);
    }

    public void adicionarPassagem(Passagem passagem) {
        passagens.add(passagem);
    }

    public List<Passagem> obterPassagens() {
        return passagens;
    }

    public void removerPassagem(Passagem passagem) {
        passagens.remove(passagem);
    }
}
