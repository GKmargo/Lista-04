package br.edu.up.modelos;

public class Tripulante extends Pessoa{
    private String id;
    private String martricula;

    public Tripulante(String codigoAeronave, String tipoAeronave, int qtdAcentos, String nome, String rg, String id,
            String martricula) {
        super(codigoAeronave, tipoAeronave, qtdAcentos, nome, rg);
        this.id = id;
        this.martricula = martricula;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMartricula() {
        return martricula;
    }

    public void setMartricula(String martricula) {
        this.martricula = martricula;
    }

    
}
