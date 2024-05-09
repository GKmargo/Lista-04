package br.edu.up.modelos;

public class Aeronave {
    private String codigo;
    private String tipo;
    private int qtdAcentos = 0;
    
    public Aeronave(String codigo, String tipo, int qtdAcentos) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.qtdAcentos = qtdAcentos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQtdAcentos() {
        return qtdAcentos;
    }

    public void setQtdAcentos(int qtdAcentos) {
        this.qtdAcentos = qtdAcentos;
    }

    
}
