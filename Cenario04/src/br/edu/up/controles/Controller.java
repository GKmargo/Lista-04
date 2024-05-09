package br.edu.up.controles;

import br.edu.up.modelos.Carro;
import br.edu.up.tela.Menu;

public class Controller {
    private Estacionamento estacionamento;
    private Menu menu;

    public Controller() {
        this.estacionamento = new Estacionamento();
        this.menu = new Menu();
    }

    public void executar() {
        while (true) {
            menu.exibirMenu();
            int opcao = menu.lerOpcao();

            switch (opcao) {
                case 1:
                    String modelo = menu.lerModelo();
                    String placa = menu.lerPlaca();
                    String cor = menu.lerCor();
                    Carro veiculo = new Carro(modelo, placa, cor);
                    if (estacionamento.registrarEntrada(veiculo)) {
                        menu.exibirMensagem("Veículo registrado com sucesso!");
                    } else {
                        menu.exibirMensagem("Estacionamento cheio. Não é possível registrar entrada.");
                    }
                    break;
                case 2:
                    placa = menu.lerPlaca();
                    Carro veiculoEncontrado = estacionamento.buscarVeiculoPorPlaca(placa);
                    if (veiculoEncontrado != null) {
                        menu.exibirMensagem("Veículo encontrado: " + veiculoEncontrado.getModelo());
                    } else {
                        menu.exibirMensagem("Veículo não encontrado.");
                    }
                    break;
                case 3:
                    menu.exibirMensagem("Vagas disponíveis: " + estacionamento.getVagasDisponiveis());
                    break;
                case 0:
                    menu.exibirMensagem("Encerrando o programa.");
                    return;
                default:
                    menu.exibirMensagem("Opção inválida. Tente novamente.");
            }
        }
    }
}
