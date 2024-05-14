package br.edu.up.tela;

import br.edu.up.controles.SeguroController;
import br.edu.up.modelos.Segurado;
import br.edu.up.modelos.Segurado.Sexo;
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
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 7);
    }

    private void exibirMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Incluir seguro");
        System.out.println("2. Localizar seguro");
        System.out.println("3. Excluir seguro");
        System.out.println("4. Excluir todos os seguros");
        System.out.println("5. Listar todos os seguros");
        System.out.println("6. Ver quantidade de seguros");
        System.out.println("7. Sair");
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
        System.out.println("Digite o RG do segurado:");
        String rgSegurado = Prompt.lerLinha();
        System.out.println("Digite o CPF do segurado:");
        String cpfSegurado = Prompt.lerLinha();
        System.out.println("Digite o sexo do segurado (MASCULINO/FEMININO):");
        Sexo sexoSegurado = Sexo.valueOf(Prompt.lerLinha().toUpperCase());
        System.out.println("Digite o telefone do segurado:");
        String telefoneSegurado = Prompt.lerLinha();
        System.out.println("Digite o endereço do segurado:");
        String enderecoSegurado = Prompt.lerLinha();
        System.out.println("Digite o CEP do segurado:");
        String cepSegurado = Prompt.lerLinha();
        System.out.println("Digite a cidade do segurado:");
        String cidadeSegurado = Prompt.lerLinha();
    
        Segurado segurado = new Segurado(nomeSegurado, rgSegurado, cpfSegurado, sexoSegurado, telefoneSegurado, enderecoSegurado, cepSegurado, cidadeSegurado);
    
        if (tipoSeguro == 1) {
            System.out.println("Informe se o seguro cobre doença (V/F):");
            boolean cobreDoenca = Prompt.lerCaractere() == 'v';
            System.out.println("Informe o valor da apólice:");
            double vlrApolice = Prompt.lerDecimal();
            System.out.println("Informe a data de início do seguro (formato YYYY-MM-DD):");
            LocalDate dtaInicio = LocalDate.parse(Prompt.lerLinha());
            System.out.println("Informe a data final do seguro (formato YYYY-MM-DD):");
            LocalDate dtaFinal = LocalDate.parse(Prompt.lerLinha());
    
            SeguroVida seguroVida = new SeguroVida(apolice, segurado, vlrApolice, dtaInicio, dtaFinal, cobreDoenca, cobreDoenca);
            seguroController.incluirSeguro(seguroVida);
        } else if (tipoSeguro == 2) {
            System.out.println("Informe o valor da franquia:");
            double vlrFranquia = Prompt.lerDecimal();
            System.out.println("O seguro tem carro reserva? (V/F):");
            boolean temCarroReserva = Prompt.lerCaractere() == 'v';
            System.out.println("O seguro cobre vidros? (V/F):");
            boolean cobreVidros = Prompt.lerCaractere() == 'v';
            System.out.println("Informe o valor da apólice:");
            double vlrApolice = Prompt.lerDecimal();
            System.out.println("Informe a data de início do seguro (formato YYYY-MM-DD):");
            LocalDate dtaInicio = LocalDate.parse(Prompt.lerLinha());
            System.out.println("Informe a data final do seguro (formato YYYY-MM-DD):");
            LocalDate dtaFinal = LocalDate.parse(Prompt.lerLinha());
    
            SeguroVeiculo seguroVeiculo = new SeguroVeiculo(apolice, segurado, vlrApolice, dtaInicio, dtaFinal, vlrFranquia, temCarroReserva, cobreVidros);
            seguroController.incluirSeguro(seguroVeiculo);
        } else {
            System.out.println("Opção inválida.");
        }
    }

    private void localizarSeguro() {
        System.out.println("\nLocalizar seguro selecionado.");

        System.out.println("Digite o número da apólice:");
        String numeroApolice = Prompt.lerLinha();

        Seguro seguroEncontrado = seguroController.localizarSeguro(numeroApolice);

        if (seguroEncontrado != null) {
            System.out.println("Seguro encontrado:");
            System.out.println(seguroEncontrado);
        } else {
            System.out.println("Seguro não encontrado.");
        }
    }

    private void excluirSeguro() {
        System.out.println("\nExcluir seguro selecionado.");

        System.out.println("Digite o número da apólice do seguro a ser excluído:");
        String numeroApolice = Prompt.lerLinha();

        boolean excluiu = seguroController.excluirSeguro(numeroApolice);

        if (excluiu) {
            System.out.println("Seguro excluído com sucesso.");
        } else {
            System.out.println("Seguro não encontrado ou não pôde ser excluído.");
        }
    }

    private void excluirTodosSeguros() {
        System.out.println("\nExcluir todos os seguros selecionado.");
        System.out.println("Tem certeza de que deseja excluir todos os seguros? (s/n)");
        char confirmacao = Prompt.lerCaractere();

        if (confirmacao == 's') {
            seguroController.excluirTodosSeguros();
            System.out.println("Todos os seguros foram excluídos com sucesso.");
        } else {
            System.out.println("Exclusão de todos os seguros cancelada.");
        }
    }

    private void listarTodosSeguros() {
        System.out.println("\nListar todos os seguros selecionado.");

        ArrayList<Seguro> seguros = seguroController.listarTodosSeguros();

        if (!seguros.isEmpty()) {
            System.out.println("Lista de todos os seguros:");
            for (Seguro seguro : seguros) {
                System.out.println(seguro);
            }
        } else {
            System.out.println("Nenhum seguro cadastrado.");
        }
    }

    private void quantidadeSeguros() {
        System.out.println("\nVer quantidade de seguros selecionado.");

        int quantidade = seguroController.quantidadeSeguros();

        System.out.println("Quantidade de seguros cadastrados: " + quantidade);
    }
}