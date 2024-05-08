package br.edu.up.tela;

import br.edu.up.Util.Prompt;

import br.edu.up.controle.CompromissoControle;
import br.edu.up.controle.DiaControle;

public class tela {
    public void execute(){

        CompromissoControle controle = new CompromissoControle();
        DiaControle diaControle = new DiaControle();


        System.out.println("Hello, World!");

        String continuar = "sim";

        while(continuar == "sim"){
            
        String pessoa = Prompt.lerLinha("Digite o nome da pessoa: ");

        String local = Prompt.lerLinha("Digite o local do compromisso: ");

        String assunto = Prompt.lerLinha("Digite o assunto do compromisso: ");

        int hora = Prompt.lerInteiro("Digite a hora do compromisso: ");

        int mes = Prompt.lerInteiro("Digite o mês do compromisso: ");

        int ano = Prompt.lerInteiro("Digite o ano do compromisso: ");


        controle.adicionarCompromisso(pessoa, local, assunto, hora);

        diaControle.adicionarCompromissos();

        continuar = Prompt.lerLinha("Deseja continuar? (sim/não) ");
        }


    }
}
