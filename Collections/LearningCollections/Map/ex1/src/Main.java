import br.com.dicionario.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Java", "Uma linguagem de programação.");
        dicionario.adicionarPalavra("Python", "Uma linguagem de programação de alto nível.");
        dicionario.exibirPalavras();

        String significado = dicionario.buscarSignificado("Java");
        System.out.println("Significado de Java: " + significado);

        dicionario.removerPalavra("Python");
        dicionario.exibirPalavras();
    }
}
