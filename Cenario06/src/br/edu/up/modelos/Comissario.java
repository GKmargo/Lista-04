package br.edu.up.modelos;

public class Comissario extends Tripulante {
    private String idioma;

    public Comissario(String nome, String rg, String id, String martricula, String idioma) {
        super(nome, rg, id, martricula);
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

}
