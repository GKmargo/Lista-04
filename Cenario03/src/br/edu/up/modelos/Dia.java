package br.edu.up.modelos;

public class Dia{
    private int diaMes;
    private Compromisso[] compromissos;
    
    public Dia(int diaMes) {
        this.diaMes = diaMes;
    }

    public int getDiaMes() {
        return diaMes;
    }

    public void setDiaMes(int diaMes) {
        this.diaMes = diaMes;
    }
    
}