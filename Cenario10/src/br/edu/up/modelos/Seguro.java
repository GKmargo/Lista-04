package br.edu.up.modelos;

import java.time.LocalDate;

public abstract class Seguro {
    private String apolice;
    private Segurado segurado;
    private double vlrApolice;
    private LocalDate dtaInicio;
    private LocalDate dtaFinal;
   
    public Seguro(String apolice, Segurado segurado, double vlrApolice, LocalDate dtaInicio, LocalDate dtaFinal) {
        this.apolice = apolice;
        this.segurado = segurado;
        this.vlrApolice = vlrApolice;
        this.dtaInicio = dtaInicio;
        this.dtaFinal = dtaFinal;
    }

    public String getApolice() {
        return apolice;
    }

    public void setApolice(String apolice) {
        this.apolice = apolice;
    }

    public Segurado getSegurado() {
        return segurado;
    }

    public void setSegurado(Segurado segurado) {
        this.segurado = segurado;
    }

    public double getVlrApolice() {
        return vlrApolice;
    }

    public void setVlrApolice(double vlrApolice) {
        this.vlrApolice = vlrApolice;
    }

    public LocalDate getDtaInicio() {
        return dtaInicio;
    }

    public void setDtaInicio(LocalDate dtaInicio) {
        this.dtaInicio = dtaInicio;
    }

    public LocalDate getDtaFinal() {
        return dtaFinal;
    }

    public void setDtaFinal(LocalDate dtaFinal) {
        this.dtaFinal = dtaFinal;
    }  

    @Override
    public String toString() {
        return "Seguro{" +
                "apolice='" + apolice + '\'' +
                ", segurado=" + segurado +
                ", vlrApolice=" + vlrApolice +
                ", dtaInicio=" + dtaInicio +
                ", dtaFinal=" + dtaFinal +
                '}';
    }
}
