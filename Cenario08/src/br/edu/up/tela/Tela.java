package br.edu.up.tela;

import java.util.List;

import br.edu.up.Util.Prompt;
import br.edu.up.controles.Agenda;
import br.edu.up.modelos.Comercial;
import br.edu.up.modelos.Contato;
import br.edu.up.modelos.Pessoal;

public class Tela {
    private Agenda agenda;

    public Tela(Agenda agenda) {
        this.agenda = agenda;
    }

    public void executarMenu() {
        int opcao;
        do {
            opcao = exibirMenu();
            switch (opcao) {
                case 1:
                    incluirContatoPessoal();
                    break;
                case 2:
                    incluirContatoComercial();
                    break;
                case 3:
                    excluirContato();
                    break;
                case 4:
                    consultarContato();
                    break;
                case 5:
                    listarContatos();
                    break;
                case 6:
                    Prompt.imprimir("Saindo do programa...");
                    break;
                default:
                    Prompt.imprimir("Opção inválida! Por favor, escolha uma opção entre 1 e 6.");
            }
        } while (opcao != 6);
    }

    public int exibirMenu() {
        Prompt.imprimir("Escolha uma opção:");
        Prompt.imprimir("1. Incluir um contato pessoal");
        Prompt.imprimir("2. Incluir um contato comercial");
        Prompt.imprimir("3. Excluir um contato pelo código");
        Prompt.imprimir("4. Consultar um contato pelo código");
        Prompt.imprimir("5. Listar todos os contatos");
        Prompt.imprimir("6. Sair do programa");
        return Prompt.lerInteiro();
    }

    public void incluirContatoPessoal() {
        Prompt.separador();
        int codigo = Prompt.lerInteiro("Digite o código do contato pessoal:");
        String nome = Prompt.lerLinha("Digite o nome do contato pessoal:");
        String telefone = Prompt.lerLinha("Digite o telefone do contato pessoal:");
        String aniversario = Prompt.lerLinha("Digite o aniversário do contato pessoal:");
        agenda.incluirContatoPessoal(codigo, nome, telefone, aniversario);
        Prompt.imprimir("Contato pessoal incluído com sucesso!");
    }

    public void incluirContatoComercial() {
        Prompt.separador();
        int codigo = Prompt.lerInteiro("Digite o código do contato comercial:");
        String nome = Prompt.lerLinha("Digite o nome do contato comercial:");
        String telefone = Prompt.lerLinha("Digite o telefone do contato comercial:");
        String cnpj = Prompt.lerLinha("Digite o CNPJ do contato comercial:");
        agenda.incluirContatoComercial(codigo, nome, telefone, cnpj);
        Prompt.imprimir("Contato comercial incluído com sucesso!");
    }

    public void excluirContato() {
        Prompt.separador();
        int codigo = Prompt.lerInteiro("Digite o código do contato a ser excluído:");
        boolean excluidoComSucesso = agenda.excluirContato(codigo);
        if (excluidoComSucesso) {
            Prompt.imprimir("Contato excluído com sucesso!");
        } else {
            Prompt.imprimir("Contato não encontrado.");
        }
    }
    

    public void consultarContato() {
        Prompt.separador();
        int codigo = Prompt.lerInteiro("Digite o código do contato a ser consultado:");
        Contato contato = agenda.consultarContato(codigo);
        if (contato != null) {
            Prompt.imprimir("Detalhes do contato:");
            exibirDetalhesContato(contato);
        } else {
            Prompt.imprimir("Contato não encontrado.");
        }
    }

    public void listarContatos() {
        Prompt.separador();
        List<Contato> contatos = agenda.listarContatos();
        if (!contatos.isEmpty()) {
            Prompt.imprimir("Listagem de contatos:");
            for (Contato contato : contatos) {
                exibirResumoContato(contato);
            }
        } else {
            Prompt.imprimir("Nenhum contato cadastrado.");
        }
    }

    private void exibirDetalhesContato(Contato contato) {
        Prompt.imprimir("Código: " + contato.getCodigo());
        Prompt.imprimir("Nome: " + contato.getNome());
        Prompt.imprimir("Telefone: " + contato.getTelefone());
        if (contato instanceof Pessoal) {
            Prompt.imprimir("Aniversário: " + ((Pessoal) contato).getAniversario());
        } else if (contato instanceof Comercial) {
            Prompt.imprimir("CNPJ: " + ((Comercial) contato).getCnpj());
        }
    }

    private void exibirResumoContato(Contato contato) {
        Prompt.imprimir("Código: " + contato.getCodigo() + " | Nome: " + contato.getNome());
    }
}
