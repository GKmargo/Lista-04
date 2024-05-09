package br.edu.up.modelos;

public class Pessoa extends Aeronave {
    private String nome;
    private String rg;
    
    public Pessoa(String codigo, String tipo, int qtdAcentos, String nome, String rg) {
        super(codigo, tipo, qtdAcentos);
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

}
