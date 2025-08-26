import br.com.contador.*;

public class App {
    public static void main(String[] args) throws Exception {
        ContagemPalavras contagem = new ContagemPalavras();
        contagem.adicionarPalavra("hello");
        contagem.adicionarPalavra("world");
        contagem.adicionarPalavra("hello");

        contagem.exibirContagemPalavras();

        Palavra maisFrequente = contagem.encontrarPalavraMaisFrequente();
        if (maisFrequente != null) {
            System.out.println("Palavra mais frequente: " + maisFrequente.getPalavra() + " - " + maisFrequente.getContagem());
        }
    }
}
