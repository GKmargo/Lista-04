package br.edu.up.tela;

import br.edu.up.controles.SeguroController;
import br.edu.up.modelos.Segurado;
import br.edu.up.modelos.Seguro;
import br.edu.up.modelos.SeguroVida;
import br.edu.up.modelos.SeguroVeiculo;
import br.edu.up.Util.Prompt;

import java.time.LocalDate;

public class Tela {
    private SeguroController seguroController;

    public Tela() {
        seguroController = new SeguroController();
    }

    public void executar() {
        int opcao;
        do {
            exibirMenu();
            opcao = Prompt.lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    incluirSeguro();
                    break;
                case 2:
                    localizarSeguro();
                    break;
                case 3:
                    excluirSeguro();
                    break;
                case 4:
                    excluirTodosSeguros();
                    break;
                case 5:
                    listarTodosSeguros();
                    break;
                case 6:
                    quantidadeSeguros();
                    break;
                case 7:
                    Prompt.imprimir("Encerrando o programa...");
                    break;
                default:
                    Prompt.imprimir("Opção inválida.");
                    break;
            }
        } while (opcao != 7);
    }

    private void exibirMenu() {
        Prompt.linhaEmBranco();
        Prompt.separador();
        Prompt.imprimir("===== MENU =====");
        Prompt.imprimir("1. Incluir seguro");
        Prompt.imprimir("2. Localizar seguro");
        Prompt.imprimir("3. Excluir seguro");
        Prompt.imprimir("4. Excluir todos os seguros");
        Prompt.imprimir("5. Listar todos os seguros");
        Prompt.imprimir("6. Ver quantidade de seguros");
        Prompt.imprimir("7. Sair");
        Prompt.separador();
    }

    private void incluirSeguro() {
        Prompt.linhaEmBranco();
        Prompt.imprimir("Incluir seguro selecionado.");
        // Implemente aqui a lógica para coletar os dados do seguro
        // e criar uma instância de Seguro, SeguroVida ou SeguroVeiculo
    }

    private void localizarSeguro() {
        Prompt.linhaEmBranco();
        Prompt.imprimir("Localizar seguro selecionado.");
        // Implemente aqui a lógica para solicitar o número da apólice
        // e chamar o método localizarSeguro do SeguroController
    }

    private void excluirSeguro() {
        Prompt.linhaEmBranco();
        Prompt.imprimir("Excluir seguro selecionado.");
        // Implemente aqui a lógica para solicitar o número da apólice
        // e chamar o método excluirSeguro do SeguroController
    }

    private void excluirTodosSeguros() {
        Prompt.linhaEmBranco();
        Prompt.imprimir("Excluir todos os seguros selecionado.");
        // Implemente aqui a lógica para confirmar a exclusão de todos os seguros
        // e chamar o método excluirTodosSeguros do SeguroController
    }

    private void listarTodosSeguros() {
        Prompt.linhaEmBranco();
        Prompt.imprimir("Listar todos os seguros selecionado.");
        // Implemente aqui a lógica para chamar o método listarTodosSeguros do SeguroController
    }

    private void quantidadeSeguros() {
        Prompt.linhaEmBranco();
        Prompt.imprimir("Ver quantidade de seguros selecionado.");
        // Implemente aqui a lógica para chamar o método quantidadeSeguros do SeguroController
    }
}
