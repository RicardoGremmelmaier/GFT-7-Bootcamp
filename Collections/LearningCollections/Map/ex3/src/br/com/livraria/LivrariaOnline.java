package br.com.livraria;

import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

public class LivrariaOnline {

    private Map<String, Livro> catalogo;

    public LivrariaOnline() {
        this.catalogo = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        catalogo.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        if (catalogo.isEmpty()){return;}

        for (Map.Entry<String, Livro> entry : catalogo.entrySet()) {
            if (entry.getValue().getTitulo().equals(titulo)) {
            catalogo.remove(entry.getKey());
            break;
            }
        }
    }

    public void exibirLivrosOrdenadosPorPreco(){
        Map<String, Livro> resultado = new HashMap<>(catalogo);
        resultado.values().stream()
            .sorted((l1, l2) -> Double.compare(l1.getPreco(), l2.getPreco()))
            .forEach(livro -> System.out.println(livro.getTitulo() + " - " + livro.getAutor() + " - " + livro.getPreco()));
    }

    public void exibirLivrosPorAutor(String autor) {
        for (Livro livro : catalogo.values()) {
            if (livro.getAutor().equals(autor)) {
                System.out.println(livro.getTitulo() + " - " + livro.getAutor() + " - " + livro.getPreco());
            }
        }
    }

    public Livro obterLivroMaisCaro() {
        Livro maisCaro = null;
        for (Livro livro : catalogo.values()) {
            if (maisCaro == null || livro.getPreco() > maisCaro.getPreco()) {
                maisCaro = livro;
            }
        }
        return maisCaro;
    }

    public Livro obterLivroMaisBarato() {
        Livro maisBarato = null;
        for (Livro livro : catalogo.values()) {
            if (maisBarato == null || livro.getPreco() < maisBarato.getPreco()) {
                maisBarato = livro;
            }
        }
        return maisBarato;
    }

}
