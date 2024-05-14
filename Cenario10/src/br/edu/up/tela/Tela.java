package br.edu.up.tela;

import br.edu.up.controles.SeguroController;
import br.edu.up.modelos.Segurado;
import br.edu.up.modelos.Seguro;
import br.edu.up.modelos.SeguroVida;
import br.edu.up.modelos.SeguroVeiculo;
import br.edu.up.Util.Prompt;

import java.time.LocalDate;
import java.util.ArrayList;

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
        System.out.println("\nIncluir seguro selecionado.");
    
        System.out.println("Selecione o tipo de seguro:");
        System.out.println("1. Seguro de Vida");
        System.out.println("2. Seguro de Veículo");
        int tipoSeguro = Prompt.lerInteiro("Escolha uma opção: ");
    
        System.out.println("Digite o número da apólice:");
        String apolice = Prompt.lerLinha();
        System.out.println("Digite o nome do segurado:");
        String nomeSegurado = Prompt.lerLinha();
    
        Segurado segurado = new Segurado(nomeSegurado, nomeSegurado, nomeSegurado, null, nomeSegurado, nomeSegurado, nomeSegurado, nomeSegurado);
        SeguroController seguroController = new SeguroController();
    
        if (tipoSeguro == 1) {
            System.out.println("Informe se o seguro cobre doença (true/false):");
            boolean cobreDoenca = Prompt.lerCaractere() == 't';
    
            SeguroVida seguroVida = new SeguroVida(apolice, segurado, tipoSeguro, null, null, cobreDoenca, cobreDoenca);
            seguroController.incluirSeguro(seguroVida);
        } else if (tipoSeguro == 2) {
            System.out.println("Informe o valor da franquia:");
            double vlrFranquia = Prompt.lerDecimal();
    
            SeguroVeiculo seguroVeiculo = new SeguroVeiculo(apolice, segurado, vlrFranquia, null, null, vlrFranquia, false, false);
            seguroController.incluirSeguro(seguroVeiculo);
        } else {
            System.out.println("Opção inválida.");
        }
    }
    
    private void localizarSeguro() {
        Prompt.linhaEmBranco();
        Prompt.imprimir("Localizar seguro selecionado.");
    
        Prompt.imprimir("Digite o número da apólice:");
        String numeroApolice = Prompt.lerLinha();
    
        SeguroController seguroController = new SeguroController();

        Seguro seguroEncontrado = seguroController.localizarSeguro(numeroApolice);
    
        if (seguroEncontrado != null) {
            Prompt.imprimir("Seguro encontrado:");
            Prompt.imprimir(seguroEncontrado);
        } else {
            Prompt.imprimir("Seguro não encontrado.");
        }
    }
    

    private void excluirSeguro() {
        Prompt.linhaEmBranco();
        Prompt.imprimir("Excluir seguro selecionado.");
    
        Prompt.imprimir("Digite o número da apólice do seguro a ser excluído:");
        String numeroApolice = Prompt.lerLinha();
    
        SeguroController seguroController = new SeguroController();
    
        boolean excluiu = seguroController.excluirSeguro(numeroApolice);
    
        if (excluiu) {
            Prompt.imprimir("Seguro excluído com sucesso.");
        } else {
            Prompt.imprimir("Seguro não encontrado ou não pôde ser excluído.");
        }
    }
    

    private void excluirTodosSeguros() {
        Prompt.linhaEmBranco();
        Prompt.imprimir("Excluir todos os seguros selecionado.");
        Prompt.imprimir("Tem certeza de que deseja excluir todos os seguros? (s/n)");
        char confirmacao = Prompt.lerCaractere();
    
        if (confirmacao == 's') {
            SeguroController seguroController = new SeguroController();

            seguroController.excluirTodosSeguros();
            Prompt.imprimir("Todos os seguros foram excluídos com sucesso.");
        } else {
            Prompt.imprimir("Exclusão de todos os seguros cancelada.");
        }
    }
    

    private void listarTodosSeguros() {
    Prompt.linhaEmBranco();
    Prompt.imprimir("Listar todos os seguros selecionado.");

    SeguroController seguroController = new SeguroController();
    ArrayList<Seguro> seguros = seguroController.listarTodosSeguros();

    if (!seguros.isEmpty()) {
        Prompt.imprimir("Lista de todos os seguros:");
        for (Seguro seguro : seguros) {
            Prompt.imprimir(seguro);
        }
    } else {
        Prompt.imprimir("Nenhum seguro cadastrado.");
    }
}

    private void quantidadeSeguros() {
    Prompt.linhaEmBranco();
    Prompt.imprimir("Ver quantidade de seguros selecionado.");

    SeguroController seguroController = new SeguroController();
    int quantidade = seguroController.quantidadeSeguros();

    Prompt.imprimir("Quantidade de seguros cadastrados: " + quantidade);
}

}
