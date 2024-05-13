package br.edu.up.tela;

import java.util.List;

import br.edu.up.Util.Prompt;
import br.edu.up.controles.DadosDasPessoas;
import br.edu.up.modelos.Passageiro;
import br.edu.up.modelos.Pessoa;
import br.edu.up.modelos.Tripulante;

public class Menu {
    DadosDasPessoas controller;

    public Menu() {
        controller = new DadosDasPessoas();
    }

    public void exibirMenu() {
        int opcao;
        do {
            Prompt.separador();
            Prompt.imprimir("===== Menu =====");
            Prompt.imprimir("1. Adicionar Passageiro");
            Prompt.imprimir("2. Adicionar Tripulante");
            Prompt.imprimir("3. Listar Passageiros");
            Prompt.imprimir("4. Listar Tripulação");
            Prompt.imprimir("5. Sair");
            opcao = Prompt.lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    adicionarPassageiro();
                    break;
                case 2:
                    adicionarTripulante();
                    break;
                case 3:
                    listarPassageiros();
                    break;
                case 4:
                    listarTripulacao();
                    break;
                case 5:
                    Prompt.imprimir("Saindo...");
                    break;
                default:
                    Prompt.imprimir("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }

    private void adicionarPassageiro() {
        Passageiro passageiro = new Passageiro(null, null, null);
       
        passageiro.setNome(Prompt.lerLinha("Nome do passageiro: "));
        passageiro.setRg(Prompt.lerLinha("RG do passageiro: "));
        passageiro.setBagagem(Prompt.lerLinha("Identificaddor da Bagagem:"));
        passageiro.setNumAcento(Prompt.lerInteiro("Numero do ascento:"));
        passageiro.setClasseAcento(Prompt.lerLinha("Classe do ascento:"));
        passageiro.setCodigoAeronave(Prompt.lerLinha("Código da aeronave: ")); 
        passageiro.setTipoAeronave(Prompt.lerLinha("Tipo da aeronave: ")) ;
        passageiro.setQtdAcentos(Prompt.lerInteiro("Quantidade de assentos: "));   

        controller.adicionarPassageiro(passageiro);
        Prompt.imprimir("Passageiro adicionado com sucesso!");
    }

    private void adicionarTripulante() {
        Tripulante tripulante = new Tripulante(null, null, 0, null, null, null, null);
        String nome = Prompt.lerLinha("Nome do tripulante: ");
        String rg = Prompt.lerLinha("RG do tripulante: ");
        String id = Prompt.lerLinha("ID do tripulante: ");
        String matricula = Prompt.lerLinha("Matrícula do tripulante: ");
        // Obter outros dados do tripulante...
        String codigoAeronave = Prompt.lerLinha("Código da aeronave: ");
        String tipoAeronave = Prompt.lerLinha("Tipo da aeronave: ");
        int qtdAcentos = Prompt.lerInteiro("Quantidade de assentos: ");

        Tripulante tripulante = new Tripulante(codigoAeronave, tipoAeronave, qtdAcentos, nome, rg, id, matricula);
        controller.adicionarTripulante(tripulante);
        Prompt.imprimir("Tripulante adicionado com sucesso!");
    }

    private void listarPassageiros() {
        List<Passageiro> passageiros = controller.listarPassageiros();
        if (passageiros.isEmpty()) {
            Prompt.imprimir("Não há passageiros cadastrados.");
        } else {
            Prompt.imprimir("===== Lista de Passageiros =====");
            for (Passageiro passageiro : passageiros) {
                Prompt.imprimir("Nome: " + passageiro.getNome());
                Prompt.imprimir("RG: " + passageiro.getRg());
                // Imprimir outros detalhes do passageiro...
            }
        }
    }

    private void listarTripulacao() {
        List<Tripulante> tripulacao = controller.listarTripulacao();
        if (tripulacao.isEmpty()) {
            Prompt.imprimir("Não há tripulantes cadastrados.");
        } else {
            Prompt.imprimir("===== Lista de Tripulação =====");
            for (Tripulante tripulante : tripulacao) {
                Prompt.imprimir("Nome: " + tripulante.getNome());
                Prompt.imprimir("RG: " + tripulante.getRg());
                // Imprimir outros detalhes do tripulante...
            }
        }
    }
}
