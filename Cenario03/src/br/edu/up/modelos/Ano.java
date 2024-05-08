package br.edu.up.modelos;

public class Ano {
    private int ano;
    private boolean bissexto;
    private Mes[] mes;
    
    public Ano(int ano, boolean bissexto) {
        this.ano = ano;
        this.bissexto = bissexto;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isBissexto() {
        return bissexto;
    }

    public void setBissexto(boolean bissexto) {
        this.bissexto = bissexto;
    }
    
}
