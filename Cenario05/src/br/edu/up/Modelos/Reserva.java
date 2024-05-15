package br.edu.up.Modelos;

public class Reserva {
    private String responsavel;
    private int quantidadePessoas;
    private String dataReserva;
    private double valorTotal;

    // Construtor
    public Reserva(String responsavel, int quantidadePessoas, String dataReserva, double valorTotal) {
        this.responsavel = responsavel;
        this.quantidadePessoas = quantidadePessoas;
        this.dataReserva = dataReserva;
        this.valorTotal = valorTotal;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getInfoReserva() {
        return "Responsável: " + responsavel + ", Quantidade de Pessoas: " + quantidadePessoas + ", Data da Reserva: " + dataReserva + ", Valor Total: " + valorTotal;
    }


    
}