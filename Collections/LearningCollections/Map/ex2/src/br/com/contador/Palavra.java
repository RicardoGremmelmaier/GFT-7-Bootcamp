package br.com.contador;

public class Palavra {
    private String palavra;
    private Integer contagem;

    public Palavra(String palavra) {
        this.palavra = palavra;
        this.contagem = 1;
    }

    public String getPalavra() {
        return palavra;
    }

    public Integer getContagem() {
        return contagem;
    }

    public void incrementarContagem() {
        this.contagem++;
    }
}
