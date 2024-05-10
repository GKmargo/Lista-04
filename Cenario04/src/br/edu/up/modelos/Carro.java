// Veiculo.java
package br.edu.up.modelos;

public class Carro {
    private String modelo;
    private String placa;
    private String cor;

    public Carro(String modelo, String placa, String cor) {
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // metodo para retornar as informações do carro em uma string formatada
    @Override
    public String toString() {
        return "Veículo: [Modelo: " + modelo + ", Placa: " + placa + ", Cor: " + cor + "]";
    }
}
