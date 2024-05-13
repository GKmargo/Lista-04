package br.edu.up.modelos;

public class Passageiro extends Pessoa {
    private String bagagem;
    private Aeronave aeronave;
    private Passagem passagem; // Adicionando o atributo passagem

    public Passageiro(String nome, String rg, String bagagem, Aeronave aeronave, Passagem passagem) {
        super(nome, rg);
        this.bagagem = bagagem;
        this.aeronave = aeronave;
        this.passagem = passagem;
    }

    public void adicionarPassagem(Passagem passagem) {
        this.passagem = passagem;
    }
    
    public String getBagagem() {
        return bagagem;
    }

    public void setBagagem(String bagagem) {
        this.bagagem = bagagem;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    public Passagem getPassagem() { // Método para obter a passagem
        return passagem;
    }

    public void setPassagem(Passagem passagem) { // Método para definir a passagem
        this.passagem = passagem;
    }
}
