package br.edu.up.tela;

import br.edu.up.Util.Prompt;

import br.edu.up.controle.CompromissoControle;
import br.edu.up.modelos.Compromisso;
import br.edu.up.modelos.Dia;
import br.edu.up.modelos.Mes;
import br.edu.up.modelos.Ano;


public class Tela {
    public void execute(){

        CompromissoControle controleCompromisso = new CompromissoControle();

            
        String pessoa = Prompt.lerLinha("Digite o nome da pessoa: ");

        String local = Prompt.lerLinha("Digite o local do compromisso: ");

        String assunto = Prompt.lerLinha("Digite o assunto do compromisso: ");

        int hora = Prompt.lerInteiro("Digite a hora do compromisso: ");

        int dia = Prompt.lerInteiro("Digite o dia do compromisso: ");

        int mes = Prompt.lerInteiro("Digite o mês do compromisso: ");

        int ano = Prompt.lerInteiro("Digite o ano do compromisso: ");


        Compromisso compromisso = controleCompromisso.adicionarCompromisso(pessoa, local, assunto, hora );

        Dia day = controleCompromisso.adicionarDia(dia);

        Mes month = controleCompromisso.adicionarMes(mes);

        Ano year = controleCompromisso.adicionarAno(ano);




        Prompt.imprimir(compromisso);

        Prompt.imprimir("Dia: " + day);
        Prompt.imprimir("Mês: " + month);
        Prompt.imprimir("Ano: " + year);


    }
}
