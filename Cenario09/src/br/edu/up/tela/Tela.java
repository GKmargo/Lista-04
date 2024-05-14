package br.edu.up.tela;

import br.edu.up.controles.ClienteControle;
import java.util.Scanner;

public class Tela {
    private ClienteControle clienteControle;
    private Scanner scanner;

    public Tela() {
        clienteControle = new ClienteControle();
        scanner = new Scanner(System.in);
    }

    public void executar() {
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Incluir cliente pessoa");
            System.out.println("2. Incluir cliente empresa");
            System.out.println("3. Mostrar dados cliente pessoa");
            System.out.println("4. Mostrar dados cliente empresa");
            System.out.println("5. Emprestar para cliente pessoa");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            switch (opcao) {
                case 1:
                    clienteControle.incluirClientePessoa();
                    break;
                case 2:
                    clienteControle.incluirClienteEmpresa();
                    break;
                case 3:
                    clienteControle.mostrarDadosClientePessoa();
                    break;
                case 4:
                    clienteControle.mostrarDadosClienteEmpresa();
                    break;
                case 5:
                    clienteControle.emprestarParaClientePessoa();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 6);
    }

    public static void main(String[] args) {
        Tela tela = new Tela();
        tela.executar();
    }
}
