package br.edu.up.modelos;

public class Competencia {
    private String descricao;
    private TipoCompetencia tipo;
    private StatusCompetencia status;

    public Competencia(String descricao, TipoCompetencia tipo, StatusCompetencia status) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoCompetencia getTipo() {
        return tipo;
    }

    public void setTipo(TipoCompetencia tipo) {
        this.tipo = tipo;
    }

    public StatusCompetencia getStatus() {
        return status;
    }

    public void setStatus(StatusCompetencia status) {
        this.status = status;
    }
}
