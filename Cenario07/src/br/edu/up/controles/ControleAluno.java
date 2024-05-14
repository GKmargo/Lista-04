package br.edu.up.controles;

import br.edu.up.modelos.*;

import java.util.List;

public class ControleAluno {
    public void avaliarAluno(Aluno aluno, List<Competencia> competencias) {
        int necessariasAtingidas = 0;
        int complementaresAtingidas = 0;
        int necessariasTotal = 0;
        int complementaresTotal = 0;

        for (Competencia c : competencias) {
            if (c.getTipo() == TipoCompetencia.NECESSARIA) {
                necessariasTotal++;
                if (c.getStatus() == StatusCompetencia.ATINGIDA) {
                    necessariasAtingidas++;
                }
            } else {
                complementaresTotal++;
                if (c.getStatus() == StatusCompetencia.ATINGIDA) {
                    complementaresAtingidas++;
                }
            }
        }

        String situacao;
        if (necessariasAtingidas == necessariasTotal && complementaresAtingidas >= (complementaresTotal / 2)) {
            situacao = "Aprovado";
        } else if (necessariasAtingidas < (necessariasTotal / 2) || complementaresAtingidas < (complementaresTotal / 2)) {
            situacao = "Reprovado";
        } else {
            situacao = "Pendente";
        }

        System.out.println("Aluno: " + aluno.getNome() + " - Situação: " + situacao);
    }
}
