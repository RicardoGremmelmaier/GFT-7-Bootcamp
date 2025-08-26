package br.com.tarefas;

import java.util.Set;
import java.util.HashSet;

public class ListaTarefas {
    private Set<Tarefas> tarefas;

    public ListaTarefas() {
        tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao) {
        tarefas.removeIf(tarefa -> tarefa.getDescricao().equals(descricao));
    }

    public void exibirTarefas() {
        tarefas.forEach(tarefa -> {
            String status = tarefa.isConcluida() ? "[Concluída]" : "[Pendente]";
            System.out.println(status + " " + tarefa.getDescricao());
        });
    }

    public int contarTarefas() {
        return tarefas.size();
    }

    public Set<Tarefas> obterTarefasConcluidas(){
        Set<Tarefas> tarefasConcluidas = new HashSet<>();
        for (Tarefas tarefa : tarefas) {
            if (tarefa.isConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefas> obterTarefasPendentes(){
        Set<Tarefas> tarefasPendentes = new HashSet<>();
        for (Tarefas tarefa : tarefas) {
            if (!tarefa.isConcluida()) {
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefas tarefa : tarefas) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefa.marcarComoConcluida();
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefas tarefa : tarefas) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefa.marcarComoPendente();
                break;
            }
        }
    }

    public void limparLista() {
        tarefas.clear();
    }
}
