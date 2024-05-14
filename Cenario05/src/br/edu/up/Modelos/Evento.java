package br.edu.up.Modelos;

import java.time.LocalDate;


public class Evento {
    private String nome;
    private String data;
    private String local;
    private int lotacaoMaxima;
    private int ingressosVendidos;
    private double precoIngresso;

    // Construtor
    public Evento(String nome, String data, String local, int lotacaoMaxima, double precoIngresso) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.lotacaoMaxima = lotacaoMaxima;
        this.precoIngresso = precoIngresso;
        this.ingressosVendidos = 0;
    }

    public String getInfoEvento() {
        return "Nome: " + nome + ", Data: " + data + ", Local: " + local + ", Lotação Máxima: " + lotacaoMaxima + ", Ingressos Vendidos: " + ingressosVendidos + ", Preço do Ingresso: " + precoIngresso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getLotacaoMaxima() {
        return lotacaoMaxima;
    }

    public void setLotacaoMaxima(int lotacaoMaxima) {
        this.lotacaoMaxima = lotacaoMaxima;
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setIngressosVendidos(int ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    
    public boolean haDisponibilidade(int quantidade) {
        return (lotacaoMaxima - ingressosVendidos) >= quantidade;
    }

    // Método para vender ingressos
    public void venderIngressos(int quantidade) {
        if (haDisponibilidade(quantidade)) {
            ingressosVendidos += quantidade;
            System.out.println("Ingressos vendidos com sucesso!");
        } else {
            System.out.println("Não há ingressos disponíveis para essa quantidade.");
        }
    }

    // Método para calcular o valor total da reserva
    public double calcularValorTotal(int quantidade) {
        return quantidade * precoIngresso;
    }
}
