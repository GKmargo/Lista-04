package br.edu.up.modelos;

public class Passageiro extends Pessoa{
    private String bagagem;

    public Passageiro(String codigoAeronave, String tipoAeronave, int qtdAcentos, String nome, String rg,
            String bagagem) {
        super(codigoAeronave, tipoAeronave, qtdAcentos, nome, rg);
        this.bagagem = bagagem;
    }

    public String getBagagem() {
        return bagagem;
    }

    public void setBagagem(String bagagem) {
        this.bagagem = bagagem;
    }

}
