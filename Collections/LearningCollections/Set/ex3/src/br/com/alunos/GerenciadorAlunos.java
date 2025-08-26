package br.com.alunos;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class GerenciadorAlunos {
    private Set<Alunos> alunos;

    public GerenciadorAlunos() {
        alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota) {
        alunos.add(new Alunos(nome, matricula, nota));
    }

    public void removerAluno(Alunos aluno) {
        alunos.remove(aluno);
    }

    public void exibirAlunosPorNome() {
        Set<Alunos> resultado = new TreeSet<>(alunos);
        for (Alunos aluno : resultado) {
            System.out.println(aluno);
        }
    }

    public void exibirAlunosPorNota() {
        Set<Alunos> resultado = new TreeSet<>(new ComparatorPorNota());
        resultado.addAll(alunos);
        for (Alunos aluno : resultado) {
            System.out.println(aluno);
        }
    }

    public void exibirAlunos() {
        for (Alunos aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
