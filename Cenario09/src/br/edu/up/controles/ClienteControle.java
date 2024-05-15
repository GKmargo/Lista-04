package br.edu.up.controles;

import br.edu.up.modelos.*;

import java.util.ArrayList;
import java.util.List;

public class ClienteControle {
    private List<ClientePessoa> clientesPessoa;
    private List<ClienteEmpresa> clientesEmpresa;

    public ClienteControle() {
        clientesPessoa = new ArrayList<>();
        clientesEmpresa = new ArrayList<>();
    }

    public void incluirClientePessoa(ClientePessoa cliente) {
        clientesPessoa.add(cliente);
    }

    public void incluirClienteEmpresa(ClienteEmpresa cliente) {
        clientesEmpresa.add(cliente);
    }

    public List<ClientePessoa> getClientesPessoa() {
        return clientesPessoa;
    }

    public List<ClienteEmpresa> getClientesEmpresa() {
        return clientesEmpresa;
    }

    public ClientePessoa buscarClientePessoa(String nome) {
        for (ClientePessoa cliente : clientesPessoa) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                return cliente;
            }
        }
        return null;
    }
}
