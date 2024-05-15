package br.edu.up.Tela;

import java.util.Scanner;
import br.edu.up.Controles.EventoControle;
import br.edu.up.Controles.ReservaControle;

public class Tela {
    public void main() {
        Scanner scanner = new Scanner(System.in);
        EventoControle eventoControle = new EventoControle();
        ReservaControle reservaControle = new ReservaControle();

        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Criar evento");
            System.out.println("2. Listar eventos");
            System.out.println("3. Vender ingressos");
            System.out.println("4. Criar reserva");
            System.out.println("5. Listar reservas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do evento: ");
                    String nomeEvento = scanner.next();
                    System.out.print("Data do evento: ");
                    String dataEvento = scanner.next();
                    System.out.print("Local do evento: ");
                    String localEvento = scanner.next();
                    System.out.print("Lotação máxima do evento: ");
                    int lotacaoMaxima = scanner.nextInt();
                    System.out.print("Preço do ingresso: ");
                    double precoIngresso = scanner.nextDouble();
                    eventoControle.criarEvento(nomeEvento, dataEvento, localEvento, lotacaoMaxima, precoIngresso);
                    break;
                case 2:
                    eventoControle.listarEventos();
                    break;
                case 3:
                    eventoControle.listarEventos(); // Listar eventos para o usuário escolher
                    System.out.print("Selecione o número do evento: ");
                    int numeroEvento = scanner.nextInt() - 1;
                    System.out.print("Quantidade de ingressos a serem vendidos: ");
                    int quantidadeIngressos = scanner.nextInt();
                    eventoControle.venderIngressos(numeroEvento, quantidadeIngressos);
                    break;
                case 4:
                    eventoControle.listarEventos(); // Listar eventos para o usuário escolher
                    System.out.print("Selecione o número do evento: ");
                    numeroEvento = scanner.nextInt() - 1;
                    System.out.print("Nome do responsável pela reserva: ");
                    String responsavelReserva = scanner.next();
                    System.out.print("Quantidade de pessoas: ");
                    int quantidadePessoas = scanner.nextInt();
                    System.out.print("Data da reserva: ");
                    String dataReserva = scanner.next();
                    double precoIngressoReserva = eventoControle.getPrecoIngresso(numeroEvento);
                    double valorTotalReserva = quantidadePessoas * precoIngressoReserva;
                    reservaControle.criarReserva(responsavelReserva, quantidadePessoas, dataReserva, valorTotalReserva);
                    break;
                case 5:
                    reservaControle.listarReservas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
