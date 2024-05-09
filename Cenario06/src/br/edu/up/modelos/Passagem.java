package br.edu.up.modelos;

public class Passagem extends Passageiro{
    private int numAcento;
    private String classeAcento;
    private double dataVoo;
    
    public Passagem(String codigo, String tipo, int qtdAcentos, String nome, String rg, String bagagem, int numAcento,
            String classeAcento, double dataVoo) {
        super(codigo, tipo, qtdAcentos, nome, rg, bagagem);
        this.numAcento = numAcento;
        this.classeAcento = classeAcento;
        this.dataVoo = dataVoo;
    }

    public int getNumAcento() {
        return numAcento;
    }

    public void setNumAcento(int numAcento) {
        this.numAcento = numAcento;
    }

    public String getClasseAcento() {
        return classeAcento;
    }

    public void setClasseAcento(String classeAcento) {
        this.classeAcento = classeAcento;
    }

    public double getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(double dataVoo) {
        this.dataVoo = dataVoo;
    }

    
}
