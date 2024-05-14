package br.edu.up.modelos;

import java.util.List;

public class Professor extends Pessoa {
    private String lattesId;
    private List<Titulacao> titulacoes;

    public Professor(String nome, String rg, String matricula, String lattesId, List<Titulacao> titulacoes) {
        super(nome, rg, matricula);
        this.lattesId = lattesId;
        this.titulacoes = titulacoes;
    }

    public String getLattesId() {
        return lattesId;
    }

    public void setLattesId(String lattesId) {
        this.lattesId = lattesId;
    }

    public List<Titulacao> getTitulacoes() {
        return titulacoes;
    }

    public void setTitulacoes(List<Titulacao> titulacoes) {
        this.titulacoes = titulacoes;
    }
}
