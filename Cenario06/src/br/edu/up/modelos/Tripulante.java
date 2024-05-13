package br.edu.up.modelos;

public class Tripulante extends Pessoa{
    private String id;
    private String martricula;
    private Aeronave aeronave;

    public Tripulante(String nome, String rg, String id, String martricula, Aeronave aeronave) {
        super(nome, rg);
        this.id = id;
        this.martricula = martricula;
        this.aeronave = aeronave;
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

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    
}
