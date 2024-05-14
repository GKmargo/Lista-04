package br.edu.up.modelos;

public class Passagem {
    private Passageiro passageiro;
    private int numeroAssento;
    private String classeAssento;
    private double dataVoo;

    public Passagem( int numeroAssento, String classeAssento, double dataVoo) {
        this.numeroAssento = numeroAssento;
        this.classeAssento = classeAssento;
        this.dataVoo = dataVoo;
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
