package br.edu.up.tela;

import br.edu.up.Util.Prompt;
import br.edu.up.controles.CadastrarCarro;
import br.edu.up.modelos.Carro;

public class Menu {
    public void mostrarMenu(){
        while (true) {
            Prompt.separador();
            Prompt.imprimir("=== Menu ===");
            Prompt.imprimir("1. Registrar Entrada de um veículo");
            Prompt.imprimir("2. Remover veículo");
            Prompt.imprimir("3. Emitir relatório");
            Prompt.imprimir("4. Sair");
            Prompt.separador();

            int opcao = Prompt.lerInteiro("Escolha uma das opções:");

            switch (opcao) {
                case 1:
                    String modelo = Prompt.lerLinha("Digite o modelo do veículo:");
                    String placa = Prompt.lerLinha("Digite a placa do veículo:");
                    String cor = Prompt.lerLinha("Digite a cor do veículo:");
                    cadastrarVeiculo(modelo, placa, cor);
                    break;
                case 2:
                    String placaSaida = Prompt.lerLinha("Digite a placa do veículo que deseja retirar:");
                    sairVeiculo(placaSaida);
                    break;
                case 3:
                    emitirRelatorio();
                    break;
                case 4:
                    Prompt.imprimir("Encerrando o programa...");
                    System.exit(0);
                default:
                    Prompt.imprimir("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }
   
    public void cadastrarVeiculo(String modelo, String placa, String cor) {
        CadastrarCarro CadastrarCarro = new CadastrarCarro();
        Carro veiculo = new Carro(modelo, placa, cor);
        if (CadastrarCarro.entraVeiculo(veiculo)) {
            Prompt.imprimir("Veículo estacionado com sucesso.");
        } else {
            Prompt.imprimir("CadastrarCarro cheio.");
        }
    }

    public void sairVeiculo(String placa) {
        CadastrarCarro CadastrarCarro = new CadastrarCarro();
        Carro veiculoSaiu = CadastrarCarro.saiVeiculo(placa);
        if (veiculoSaiu != null) {
            Prompt.imprimir("Veículo com placa " + placa + " retirado com sucesso.");
        } else {
            Prompt.imprimir("Veículo não encontrado no Estacionamento.");
        }
    }

    public void emitirRelatorio() {
        CadastrarCarro CadastrarCarro = new CadastrarCarro();
        int totalEntradas = CadastrarCarro.getTotalEntradas();
        int totalSaidas = CadastrarCarro.getTotalSaidas();
        double valorPagamentos = CadastrarCarro.getValorPagamentos();

        Prompt.imprimir("Relatório do período:");
        Prompt.imprimir("Total de entradas: " + totalEntradas);
        Prompt.imprimir("Total de saídas: " + totalSaidas);
        Prompt.imprimir("Valor total dos pagamentos: R$ " + valorPagamentos);
    }
}

