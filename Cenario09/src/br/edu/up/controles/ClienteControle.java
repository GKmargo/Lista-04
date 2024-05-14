package br.edu.up.controles;

import br.edu.up.modelos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteControle {
    private List<ClientePessoa> clientesPessoa;
    private List<ClienteEmpresa> clientesEmpresa;
    private Scanner scanner;

    public ClienteControle() {
        clientesPessoa = new ArrayList<>();
        clientesEmpresa = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void incluirClientePessoa() {
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

        clientesPessoa.add(cliente);
        System.out.println("Cliente Pessoa incluído com sucesso.");
    }

    public void incluirClienteEmpresa() {
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

        clientesEmpresa.add(cliente);
        System.out.println("Cliente Empresa incluído com sucesso.");
    }

    public void mostrarDadosClientePessoa() {
        for (ClientePessoa cliente : clientesPessoa) {
            System.out.println(cliente);
        }
    }

    public void mostrarDadosClienteEmpresa() {
        for (ClienteEmpresa cliente : clientesEmpresa) {
            System.out.println(cliente);
        }
    }

    public void emprestarParaClientePessoa() {
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        ClientePessoa cliente = buscarClientePessoa(nome);
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

    private ClientePessoa buscarClientePessoa(String nome) {
        for (ClientePessoa cliente : clientesPessoa) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                return cliente;
            }
        }
        return null;
    }
}
