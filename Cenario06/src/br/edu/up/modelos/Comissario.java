package br.edu.up.modelos;

public class Comissario extends Tripulante {
    private String idioma;

    public Comissario(String codigo, String tipo, int qtdAcentos, String nome, String rg, String id, String martricula,
            String idioma) {
        super(codigo, tipo, qtdAcentos, nome, rg, id, martricula);
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

}
