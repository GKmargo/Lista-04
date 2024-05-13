package br.edu.up.controle;
import br.edu.up.modelos.Compromisso;
import br.edu.up.modelos.Dia;
import br.edu.up.modelos.Mes;
import br.edu.up.modelos.Ano;

public class CompromissoControle {

    public Compromisso adicionarCompromisso(String pessoa, String local, String assunto, int hora) {
        Compromisso compromisso = new Compromisso(pessoa, local, assunto, hora);
        return compromisso;
    }

    public Dia adicionarDia(int dia) {
        Dia day = new Dia(dia);
        return day;
    }

    public Mes adicionarMes(int mes) {
        Mes month = new Mes(mes);
        return month;
    }

    public Ano adicionarAno(int ano) {
        Ano year = new Ano(ano);
        return year;
    }

    
    

 

}
