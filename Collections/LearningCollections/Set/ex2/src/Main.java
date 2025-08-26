import br.com.tarefas.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ListaTarefas lista = new ListaTarefas();
        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Fazer exercícios");
        lista.adicionarTarefa("Revisar anotações");

        lista.exibirTarefas();

        System.out.println("Tarefas pendentes:");
        System.out.println(lista.obterTarefasPendentes());

        lista.marcarTarefaConcluida("Estudar Java");

        System.out.println("\nTarefas concluídas:");
        System.out.println(lista.obterTarefasConcluidas());

        lista.limparLista();

        System.out.println("\nTarefas após limpar:");
        lista.exibirTarefas();
    }
}
