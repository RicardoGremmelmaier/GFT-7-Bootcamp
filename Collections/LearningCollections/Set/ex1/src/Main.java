import br.com.palavras.ConjuntoPalavrasUnicas;
import br.com.tarefas.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
        conjunto.adicionarPalavra("hello");
        conjunto.adicionarPalavra("world");
        conjunto.adicionarPalavra("w0rld");
        conjunto.adicionarPalavra("hello"); // Não será adicionada
        conjunto.adicionarPalavra("hell1"); 

        System.out.println(conjunto.contemPalavra("world"));
        conjunto.removerPalavra("world");
        conjunto.removerPalavra("w0rld");

        System.out.println(conjunto.contemPalavra("hell1"));
        System.out.println(conjunto.contemPalavra("world"));

        System.out.println("Palavras únicas: " + conjunto.getPalavrasUnicas());
    }
}
