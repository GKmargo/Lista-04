package br.edu.up.tela;

import java.util.List;

import br.edu.up.controles.ControleAeroporto;
import br.edu.up.modelos.Aeronave;
import br.edu.up.modelos.Comandante;
import br.edu.up.modelos.Comissario;
import br.edu.up.modelos.Passagem;
import br.edu.up.modelos.Passageiro;
import br.edu.up.modelos.Tripulante;
import br.edu.up.Util.Prompt;

public class AeroportoView {
    private ControleAeroporto controleAeroporto;

    public AeroportoView() {
        controleAeroporto = new ControleAeroporto();
    }

    public void exibirMenu() {
        Prompt.separador();
        Prompt.imprimir("=== MENU ===");
        Prompt.imprimir("1. Adicionar Passageiro");
        Prompt.imprimir("2. Adicionar Tripulante");
        Prompt.imprimir("3. Exibir Passageiros");
        Prompt.imprimir("4. Exibir Tripulação");
        Prompt.imprimir("0. Sair");
        Prompt.separador();
    }

    public void executar() {
        int opcao;
        do {
            exibirMenu();
            opcao = Prompt.lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    adicionarPassageiro();
                    break;
                case 2:
                    adicionarTripulante();
                    break;
                case 3:
                    exibirPassageiros();;
                    break;
                case 4:
                    exibirTripulacao();
                    break;
                case 0:
                    Prompt.imprimir("Saindo...");
                    break;
                default:
                    Prompt.imprimir("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }

   private void adicionarPassageiro() {
    Prompt.separador();
    Prompt.imprimir("Adicionar Passageiro");

    String nome = Prompt.lerLinha("Nome: ");
    String rg = Prompt.lerLinha("RG: ");
    String bagagem = Prompt.lerLinha("Bagagem: ");
    String codigoAeronave = Prompt.lerLinha("Código da Aeronave: ");
    String tipoAeronave = Prompt.lerLinha("Tipo da Aeronave: ");
    int qtdAcentos = Prompt.lerInteiro("Quantidade de Assentos: ");
    int numAcento = Prompt.lerInteiro("Número do Assento: ");
    String classeAcento = Prompt.lerLinha("Classe do Assento: ");
    double dataVoo = Prompt.lerDecimal("Data do Voo: ");

    Aeronave aeronave = new Aeronave(codigoAeronave, tipoAeronave, qtdAcentos);
    Passagem passagem = new Passagem(nome, rg, bagagem, numAcento, classeAcento, dataVoo);
    Passageiro passageiro = new Passageiro(nome, rg, bagagem, aeronave, passagem);

    // Adicionando a passagem ao passageiro
    passageiro.adicionarPassagem(passagem);

    // Adicionando o passageiro e a aeronave ao controle do aeroporto
    controleAeroporto.adicionarPassageiro(passageiro);
    controleAeroporto.adicionarAeronave(aeronave);
    Prompt.imprimir("Passageiro adicionado com sucesso!");
    Prompt.separador();
}


    private void adicionarTripulante() {
        Prompt.separador();
        Prompt.imprimir("Adicionar Tripulante");
        String nome = Prompt.lerLinha("Nome: ");
        String rg = Prompt.lerLinha("RG: ");
        String id = Prompt.lerLinha("Identificação: ");
        String matricula = Prompt.lerLinha("Matrícula: ");
        String codigoAeronave = Prompt.lerLinha("Código da Aeronave: ");
        String tipoAeronave = Prompt.lerLinha("Tipo da Aeronave: ");
        int qtdAcentos = Prompt.lerInteiro("Quantidade de Assentos: ");

        Aeronave aeronave = new Aeronave(codigoAeronave, tipoAeronave, qtdAcentos);
        
        Prompt.separador();
        Prompt.imprimir("Tipo de Tripulante:");
        Prompt.imprimir("1. Comandante");
        Prompt.imprimir("2. Comissário");
        int tipoTripulante = Prompt.lerInteiro("Escolha o tipo de tripulante: ");

        switch (tipoTripulante) {
            case 1:
                double totalHoras = Prompt.lerDecimal("Total de Horas de Voo: ");
                Comandante comandante = new Comandante(nome, rg, id, matricula, aeronave, totalHoras);
                controleAeroporto.adicionarTripulante(comandante, aeronave);
                Prompt.imprimir("Comandante adicionado com sucesso!");
                break;
            case 2:
                String idioma = Prompt.lerLinha("Idiomas de Fluência: ");
                Comissario comissario = new Comissario(nome, rg, id, matricula, aeronave, idioma);
                controleAeroporto.adicionarTripulante(comissario, aeronave);
                Prompt.imprimir("Comissário adicionado com sucesso!");
                break;
            default:
                Prompt.imprimir("Opção inválida!");
                break;
        }

        Prompt.separador();
    }

    private void exibirPassageiros() {
        List<Passageiro> passageiros = controleAeroporto.obterPassageiros();
        Prompt.separador();
        Prompt.imprimir("Passageiros:");
        for (Passageiro passageiro : passageiros) {
            Prompt.imprimir("Nome: " + passageiro.getNome() + 
                            ", RG: " + passageiro.getRg() + 
                            ", Bagagem: " + passageiro.getBagagem() + 
                            ", Código da Aeronave: " + passageiro.getAeronave().getCodigoAeronave() +
                            ", Tipo da Aeronave: " + passageiro.getAeronave().getTipoAeronave() +
                            ", Quantidade de Assentos: " + passageiro.getAeronave().getQtdAcentos() +
                            ", Número do Assento: " + passageiro.getPassagem().getNumeroAssento() +
                            ", Classe do Assento: " + passageiro.getPassagem().getClasseAssento() +
                            ", Data do Voo: " + passageiro.getPassagem().getDataVoo());
        }
        Prompt.separador();
    }

    private void exibirTripulacao() {
        // Implemente a lógica para exibir tripulação
    }

}