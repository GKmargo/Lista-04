package br.edu.up.modelos;

public class ClientePessoa extends Cliente {
    private String CPF;
    private double peso;
    private double altura;

    public ClientePessoa() {
        this.vlrMaxCredito = 10000.0;
    }

    public String getCPF() { return CPF; }
    public void setCPF(String CPF) { this.CPF = CPF; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    @Override
    public String toString() {
        return "ClientePessoa{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                ", CPF='" + CPF + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", vlrMaxCredito=" + vlrMaxCredito +
                ", vlrEmprestado=" + vlrEmprestado +
                '}';
    }
}
