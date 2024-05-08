package br.edu.up.modelos;

public class Compromisso {
    private String pessoa;
    private String local;
    private String assunto;
    private int hora;
    
    public Compromisso(String pessoa, String local, String assunto, int hora) {
        this.pessoa = pessoa;
        this.local = local;
        this.assunto = assunto;
        this.hora = hora;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }


    public void setHora(int hora) {
        this.hora = hora;
    }
    
}

