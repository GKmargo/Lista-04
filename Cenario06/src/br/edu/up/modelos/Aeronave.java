package br.edu.up.modelos;

public class Aeronave {
    private String codigoAeronave;
    private String tipoAeronave;
    private int qtdAcentos = 0;
    
    public Aeronave(String codigoAeronave, String tipoAeronave, int qtdAcentos) {
        this.codigoAeronave = codigoAeronave;
        this.tipoAeronave = tipoAeronave;
        this.qtdAcentos = qtdAcentos;
    }

    public String getCodigoAeronave() {
        return codigoAeronave;
    }

    public void setCodigoAeronave(String codigoAeronave) {
        this.codigoAeronave = codigoAeronave;
    }

    public String getTipoAeronave() {
        return tipoAeronave;
    }

    public void setTipoAeronave(String tipoAeronave) {
        this.tipoAeronave = tipoAeronave;
    }

    public int getQtdAcentos() {
        return qtdAcentos;
    }

    public void setQtdAcentos(int qtdAcentos) {
        this.qtdAcentos = qtdAcentos;
    }

    
    
}
