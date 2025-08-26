import br.com.alunos.*;

public class Main {
    public static void main(String[] args) throws Exception {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();

        gerenciador.adicionarAluno("Alice", 1L, 8.5);
        gerenciador.adicionarAluno("Bob", 2L, 9.0);
        gerenciador.adicionarAluno("Charlie", 3L, 7.5);

        System.out.println("Alunos cadastrados:");
        gerenciador.exibirAlunos();

        System.out.println("\nBuscando alunos por nota:");
        gerenciador.exibirAlunosPorNota();

        System.out.println("\nBuscando alunos por nome:");
        gerenciador.exibirAlunosPorNome();
    }
}
