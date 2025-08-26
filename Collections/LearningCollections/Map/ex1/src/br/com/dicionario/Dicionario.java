package br.com.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario() {
        dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String significado) {
        dicionario.put(palavra, significado);
    }

    public void removerPalavra(String palavra) {
        if (!dicionario.isEmpty()){
            dicionario.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionario);
    }

    public String buscarSignificado(String palavra) {
        if (!dicionario.isEmpty()){
            String significado;
            significado = dicionario.get(palavra);
            return significado;
        }
        return null;
    }

}
