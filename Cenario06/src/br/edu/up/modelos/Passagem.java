package br.edu.up.modelos;

public class Passagem {
    private Passageiro passageiro;
    private int numeroAssento;
    private String classeAssento;
    private double dataVoo;

    public Passagem(Passageiro passageiro, int numeroAssento, String classeAssento, double dataVoo) {
        this.passageiro = passageiro;
        this.numeroAssento = numeroAssento;
        this.classeAssento = classeAssento;
        this.dataVoo = dataVoo;
    }

    public Passagem(String nome, String rg, String bagagem, int numAcento, String classeAcento, double dataVoo2) {
        //TODO Auto-generated constructor stub
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public int getNumeroAssento() {
        return numeroAssento;
    }

    public void setNumeroAssento(int numeroAssento) {
        this.numeroAssento = numeroAssento;
    }

    public String getClasseAssento() {
        return classeAssento;
    }

    public void setClasseAssento(String classeAssento) {
        this.classeAssento = classeAssento;
    }

    public double getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(double dataVoo) {
        this.dataVoo = dataVoo;
    }
}
