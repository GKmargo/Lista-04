package br.edu.up.modelos;

public abstract class Cliente {
    protected String nome;
    protected String telefone;
    protected String email;
    protected Endereco endereco;
    protected double vlrMaxCredito;
    protected double vlrEmprestado;

    public Cliente() {
        this.vlrEmprestado = 0.0;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }

    public double getVlrMaxCredito() { return vlrMaxCredito; }
    public void setVlrMaxCredito(double vlrMaxCredito) { this.vlrMaxCredito = vlrMaxCredito; }

    public double getVlrEmprestado() { return vlrEmprestado; }
    public void setVlrEmprestado(double vlrEmprestado) { this.vlrEmprestado = vlrEmprestado; }

    public void emprestar(double valor) {
        if (this.vlrEmprestado + valor <= this.vlrMaxCredito) {
            this.vlrEmprestado += valor;
        } else {
            System.out.println("Valor excede o limite de crédito.");
        }
    }

    public void devolver(double valor) {
        if (this.vlrEmprestado - valor >= 0) {
            this.vlrEmprestado -= valor;
        } else {
            System.out.println("Valor a devolver é maior que o valor emprestado.");
        }
    }

    public double getSaldo() {
        return this.vlrMaxCredito - this.vlrEmprestado;
    }
}
