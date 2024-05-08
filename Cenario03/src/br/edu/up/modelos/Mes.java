package br.edu.up.modelos;

public class Mes {
    private String nome;
    private int qtdDias;
    private Dia[] dias;
    
    public Mes(String nome, int qtdDias) {
        this.nome = nome;
        this.qtdDias = qtdDias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }
    
}
