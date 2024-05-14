package br.edu.up.controles;

import br.edu.up.modelos.Seguro;

import java.util.ArrayList;

public class SeguroController {
    private ArrayList<Seguro> seguros;

    public SeguroController() {
        seguros = new ArrayList<>();
    }

    public boolean incluirSeguro(Seguro seguro) {
        if (verificarNumeroApoliceExiste(seguro.getApolice())) {
            return false; 
        }

        seguros.add(seguro);
        return true;
    }

    public Seguro localizarSeguro(String numeroApolice) {
        for (Seguro seguro : seguros) {
            if (seguro.getApolice().equals(numeroApolice)) {
                return seguro;
            }
        }

        return null; 
    }

    public boolean excluirSeguro(String numeroApolice) {
        Seguro seguro = localizarSeguro(numeroApolice);
        if (seguro != null) {
            seguros.remove(seguro);
            return true; 
        }
        return false; 
    }

    public void excluirTodosSeguros() {
        seguros.clear();
    }

    public ArrayList<Seguro> listarTodosSeguros() {
        return seguros;
    }

    public int quantidadeSeguros() {
        return seguros.size();
    }

    private boolean verificarNumeroApoliceExiste(String numeroApolice) {
        for (Seguro seguro : seguros) {
            if (seguro.getApolice().equals(numeroApolice)) {
                return true;
            }
        }
        return false;
    }
}