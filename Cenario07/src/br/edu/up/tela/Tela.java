package br.edu.up.tela;

import br.edu.up.controles.ControleAluno;
import br.edu.up.modelos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tela {

    public void executar() {
        Scanner scanner = new Scanner(System.in);

        // Criação do professor
        System.out.println("Digite os dados do professor:");
        System.out.print("Nome: ");
        String nomeProfessor = scanner.nextLine();
        System.out.print("RG: ");
        String rgProfessor = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matriculaProfessor = scanner.nextLine();
        System.out.print("ID do Currículo Lattes: ");
        String lattesIdProfessor = scanner.nextLine();

        System.out.println("Quantas titulações o professor possui?");
        int qtdTitulacoes = Integer.parseInt(scanner.nextLine());
        List<Titulacao> titulacoes = new ArrayList<>();
        for (int i = 0; i < qtdTitulacoes; i++) {
            System.out.println("Digite os dados da titulação " + (i + 1) + ":");
            System.out.print("Nome da Instituição: ");
            String nomeInstituicao = scanner.nextLine();
            System.out.print("Ano de Conclusão: ");
            int anoConclusao = Integer.parseInt(scanner.nextLine());
            System.out.print("Nome do Título: ");
            String nomeTitulo = scanner.nextLine();
            System.out.print("Título do Trabalho de Conclusão: ");
            String tituloTrabalho = scanner.nextLine();

            titulacoes.add(new Titulacao(nomeInstituicao, anoConclusao, nomeTitulo, tituloTrabalho));
        }
        Professor professor = new Professor(nomeProfessor, rgProfessor, matriculaProfessor, lattesIdProfessor, titulacoes);

        // Criação do aluno
        System.out.println("\nDigite os dados do aluno:");
        System.out.print("Nome: ");
        String nomeAluno = scanner.nextLine();
        System.out.print("RG: ");
        String rgAluno = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matriculaAluno = scanner.nextLine();
        System.out.print("Ano de Ingresso: ");
        int anoIngresso = Integer.parseInt(scanner.nextLine());
        System.out.print("Curso: ");
        String curso = scanner.nextLine();
        System.out.print("Turno: ");
        String turno = scanner.nextLine();
        Aluno aluno = new Aluno(nomeAluno, rgAluno, matriculaAluno, anoIngresso, curso, turno);

        // Criação de competências
        System.out.println("\nQuantas competências a disciplina possui?");
        int qtdCompetencias = Integer.parseInt(scanner.nextLine());
        List<Competencia> competencias = new ArrayList<>();
        for (int i = 0; i < qtdCompetencias; i++) {
            System.out.println("Digite os dados da competência " + (i + 1) + ":");
            System.out.print("Descrição: ");
            String descricao = scanner.nextLine();
            System.out.print("Tipo (1-Necessária, 2-Complementar): ");
            int tipo = Integer.parseInt(scanner.nextLine());
            TipoCompetencia tipoCompetencia = (tipo == 1) ? TipoCompetencia.NECESSARIA : TipoCompetencia.COMPLEMENTAR;
            System.out.print("Status (1-Atingida, 2-Não Atingida): ");
            int status = Integer.parseInt(scanner.nextLine());
            StatusCompetencia statusCompetencia = (status == 1) ? StatusCompetencia.ATINGIDA : StatusCompetencia.NAO_ATINGIDA;

            competencias.add(new Competencia(descricao, tipoCompetencia, statusCompetencia));
        }

        // Criação da disciplina
        System.out.println("\nDigite os dados da disciplina:");
        System.out.print("Nome: ");
        String nomeDisciplina = scanner.nextLine();
        System.out.print("Identificador: ");
        String identificadorDisciplina = scanner.nextLine();
        System.out.print("Currículo: ");
        String curriculoDisciplina = scanner.nextLine();
        List<Aluno> alunosMatriculados = new ArrayList<>();
        alunosMatriculados.add(aluno);
        Disciplina disciplina = new Disciplina(nomeDisciplina, identificadorDisciplina, curriculoDisciplina, competencias, professor, alunosMatriculados);

        // Avaliação do aluno
        ControleAluno controleAluno = new ControleAluno();
        controleAluno.avaliarAluno(aluno, competencias);

        scanner.close();
    }
}
