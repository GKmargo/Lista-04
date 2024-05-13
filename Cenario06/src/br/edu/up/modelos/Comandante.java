package br.edu.up.modelos;

public class Comandante extends Tripulante {
    private double totalHoras;

    public Comandante(String nome, String rg, String id, String martricula, Aeronave aeronave, double totalHoras) {
        super(nome, rg, id, martricula, aeronave);
        this.totalHoras = totalHoras;
    }

    public double getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(double totalHoras) {
        this.totalHoras = totalHoras;
    }

    
}
