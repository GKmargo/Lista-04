package br.edu.up.modelos;

public class ClienteEmpresa extends Cliente {
    private String cnpj;
    private String inscEstadual;
    private int anoFundacao;

    public ClienteEmpresa() {
        this.vlrMaxCredito = 25000.0;
    }

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public String getInscEstadual() { return inscEstadual; }
    public void setInscEstadual(String inscEstadual) { this.inscEstadual = inscEstadual; }

    public int getAnoFundacao() { return anoFundacao; }
    public void setAnoFundacao(int anoFundacao) { this.anoFundacao = anoFundacao; }

    @Override
    public String toString() {
        return "ClienteEmpresa{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                ", cnpj='" + cnpj + '\'' +
                ", inscEstadual='" + inscEstadual + '\'' +
                ", anoFundacao=" + anoFundacao +
                ", vlrMaxCredito=" + vlrMaxCredito +
                ", vlrEmprestado=" + vlrEmprestado +
                '}';
    }
}
