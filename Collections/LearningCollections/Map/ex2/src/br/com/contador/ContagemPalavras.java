package br.com.contador;

import java.util.Map;
import java.util.HashMap;

public class ContagemPalavras {
    private Map<String, Palavra> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra) {        
        if (palavras.containsKey(palavra)) {
            palavras.get(palavra).incrementarContagem();
        } else {
            palavras.put(palavra, new Palavra(palavra));
        }
    }

    public void exibirContagemPalavras() {
        if (palavras.isEmpty()){return;}

        for (Palavra p : palavras.values()) {
            System.out.println(p.getPalavra() + ": " + p.getContagem());
        }
    }

    public Palavra encontrarPalavraMaisFrequente() {
        if (palavras.isEmpty()){return null;}

        Palavra maisFrequente = null;
        for (Palavra p : palavras.values()) {
            if (maisFrequente == null || p.getContagem() > maisFrequente.getContagem()) {
                maisFrequente = p;
            }
        }
        return maisFrequente;
    }
}
