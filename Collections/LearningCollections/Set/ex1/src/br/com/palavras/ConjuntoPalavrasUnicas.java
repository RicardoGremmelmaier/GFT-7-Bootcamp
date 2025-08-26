package br.com.palavras;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        palavras.remove(palavra);
    }

    public boolean contemPalavra(String palavra) {
        return palavras.contains(palavra);
    }

    public Set<String> getPalavrasUnicas() {
        return palavras;
    }
}
