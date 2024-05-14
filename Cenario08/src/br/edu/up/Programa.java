package br.edu.up;

import br.edu.up.tela.Tela;
import br.edu.up.controles.Agenda;

public class Programa {
    public static void main(String[] args) throws Exception {
        Agenda agenda = new Agenda(); // Crie uma instância válida de Agenda aqui
        Tela tela = new Tela(agenda);

        tela.executarMenu();
    }
}
