package br.edu.up.tela;

import br.edu.up.controles.ClienteControle;
import br.edu.up.modelos.ClientePessoa;
import br.edu.up.modelos.ClienteEmpresa;
import br.edu.up.modelos.Endereco;
import br.edu.up.modelos.Cidade;

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
                    incluirClientePessoa();
                    break;
                case 2:
                    incluirClienteEmpresa();
                    break;
                case 3:
                    mostrarDadosClientePessoa();
                    break;
                case 4:
                    mostrarDadosClienteEmpresa();
                    break;
                case 5:
                    emprestarParaClientePessoa();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 6);
    }

    private void incluirClientePessoa() {
        ClientePessoa cliente = new ClientePessoa();
        System.out.print("Nome: ");
        cliente.setNome(scanner.nextLine());
        System.out.print("Telefone: ");
        cliente.setTelefone(scanner.nextLine());
        System.out.print("Email: ");
        cliente.setEmail(scanner.nextLine());

        System.out.print("CPF: ");
        cliente.setCPF(scanner.nextLine());
        System.out.print("Peso: ");
        cliente.setPeso(scanner.nextDouble());
        System.out.print("Altura: ");
        cliente.setAltura(scanner.nextDouble());
        scanner.nextLine(); // Consume newline left-over

        Endereco endereco = new Endereco();
        System.out.print("Rua: ");
        endereco.setRua(scanner.nextLine());
        System.out.print("Número: ");
        endereco.setNumero(scanner.nextLine());
        System.out.print("Bairro: ");
        endereco.setBairro(scanner.nextLine());
        System.out.print("CEP: ");
        endereco.setCep(scanner.nextLine());
        
        Cidade cidade = new Cidade();
        System.out.print("Nome da cidade: ");
        cidade.setNome(scanner.nextLine());
        System.out.print("UF: ");
        cidade.setUF(scanner.nextLine());
        endereco.setCidade(cidade);

        cliente.setEndereco(endereco);

        clienteControle.incluirClientePessoa(cliente);
        System.out.println("Cliente Pessoa incluído com sucesso.");
    }

    private void incluirClienteEmpresa() {
        ClienteEmpresa cliente = new ClienteEmpresa();
        System.out.print("Nome: ");
        cliente.setNome(scanner.nextLine());
        System.out.print("Telefone: ");
        cliente.setTelefone(scanner.nextLine());
        System.out.print("Email: ");
        cliente.setEmail(scanner.nextLine());

        System.out.print("CNPJ: ");
        cliente.setCnpj(scanner.nextLine());
        System.out.print("Inscrição Estadual: ");
        cliente.setInscEstadual(scanner.nextLine());
        System.out.print("Ano de Fundação: ");
        cliente.setAnoFundacao(scanner.nextInt());
        scanner.nextLine(); // Consume newline left-over

        Endereco endereco = new Endereco();
        System.out.print("Rua: ");
        endereco.setRua(scanner.nextLine());
        System.out.print("Número: ");
        endereco.setNumero(scanner.nextLine());
        System.out.print("Bairro: ");
        endereco.setBairro(scanner.nextLine());
        System.out.print("CEP: ");
        endereco.setCep(scanner.nextLine());
        
        Cidade cidade = new Cidade();
        System.out.print("Nome da cidade: ");
        cidade.setNome(scanner.nextLine());
        System.out.print("UF: ");
        cidade.setUF(scanner.nextLine());
        endereco.setCidade(cidade);

        cliente.setEndereco(endereco);

        clienteControle.incluirClienteEmpresa(cliente);
        System.out.println("Cliente Empresa incluído com sucesso.");
    }

    private void mostrarDadosClientePessoa() {
        for (ClientePessoa cliente : clienteControle.getClientesPessoa()) {
            System.out.println(cliente);
        }
    }

    private void mostrarDadosClienteEmpresa() {
        for (ClienteEmpresa cliente : clienteControle.getClientesEmpresa()) {
            System.out.println(cliente);
        }
    }

    private void emprestarParaClientePessoa() {
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        ClientePessoa cliente = clienteControle.buscarClientePessoa(nome);
        if (cliente != null) {
            System.out.print("Valor a emprestar: ");
            double valor = scanner.nextDouble();
            scanner.nextLine(); // Consume newline left-over
            cliente.emprestar(valor);
            System.out.println("Operação realizada com sucesso.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}
