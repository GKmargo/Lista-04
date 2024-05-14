package br.edu.up.modelos;

import java.util.List;

public class Disciplina {
    private String nome;
    private String identificador;
    private String curriculo;
    private List<Competencia> competencias;
    private Professor professor;
    private List<Aluno> alunosMatriculados;

    public Disciplina(String nome, String identificador, String curriculo, List<Competencia> competencias, Professor professor, List<Aluno> alunosMatriculados) {
        this.nome = nome;
        this.identificador = identificador;
        this.curriculo = curriculo;
        this.competencias = competencias;
        this.professor = professor;
        this.alunosMatriculados = alunosMatriculados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public List<Competencia> getCompetencias() {
        return competencias;
    }

    public void setCompetencias(List<Competencia> competencias) {
        this.competencias = competencias;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }
}
