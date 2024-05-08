package br.edu.up.modelos;

public class Ano {
    private int ano;
    private boolean bissexto;
    private Mes[] mes;
    
    public Ano(int ano, boolean bissexto) {
        this.ano = ano;
        this.bissexto = bissexto;
    }
    
}
