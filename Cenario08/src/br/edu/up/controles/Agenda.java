package br.edu.up.controles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.edu.up.modelos.Comercial;
import br.edu.up.modelos.Contato;
import br.edu.up.modelos.Pessoal;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void incluirContatoPessoal(int codigo, String nome, String telefone, String aniversario) {
        contatos.add(new Pessoal(codigo, nome, telefone, aniversario));
    }

    public void incluirContatoComercial(int codigo, String nome, String telefone, String cnpj) {
        contatos.add(new Comercial(codigo, nome, telefone, cnpj));
    }

    public boolean excluirContato(int codigo) {
        Iterator<Contato> iterator = contatos.iterator();
        while (iterator.hasNext()) {
            Contato contato = iterator.next();
            if (contato.getCodigo() == codigo) {
                iterator.remove();
                return true; // Contato excluído com sucesso
            }
        }
        return false; // Contato não encontrado
    }
    

    public Contato consultarContato(int codigo) {
        for (Contato contato : contatos) {
            if (contato.getCodigo() == codigo) {
                return contato;
            }
        }
        return null;
    }

    public List<Contato> listarContatos() {
        return new ArrayList<>(contatos);
    }
}
