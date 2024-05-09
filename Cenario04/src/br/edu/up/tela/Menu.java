package br.edu.up.tela;

import br.edu.up.Util.Prompt;

public class Menu {
    public void exibirMenu() {
        Prompt.imprimir("Escolha uma opção:");
        Prompt.imprimir("1. Registrar entrada de veículo");
        Prompt.imprimir("2. Registrar saída de veículo");
        Prompt.imprimir("3. Emitir relatório");
        Prompt.imprimir("0. Sair");
    }

    public int lerOpcao() {
        return Prompt.lerInteiro();
    }

    public String lerPlaca() {
        Prompt.imprimir("Digite a placa do veículo: ");
        return Prompt.lerLinha();
    }

    public void exibirMensagem(String mensagem) {
        Prompt.imprimir(mensagem);
    }
}
