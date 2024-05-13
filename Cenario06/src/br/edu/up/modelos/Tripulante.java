package br.edu.up.modelos;

public class Tripulante extends Pessoa{
    private String id;
    private String matricula;
    private Aeronave aeronave;

    public Tripulante(String nome, String rg, String id, String matricula, Aeronave aeronave) {
        super(nome, rg);
        this.id = id;
        this.matricula = matricula;
        this.aeronave = aeronave;
    }

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String martricula) {
        this.matricula = martricula;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    
}
