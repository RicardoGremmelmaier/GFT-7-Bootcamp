package br.com.livraria;

import java.util.Comparator;

public class Livro implements Comparable<Livro> {

    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco)  {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    @Override
    public int compareTo(Livro outro) {
        return Double.compare(this.preco, outro.preco);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

}

class ComparatorPorAutor implements Comparator<Livro> {
    @Override
    public int compare(Livro l1, Livro l2) {
        return l1.getAutor().compareTo(l2.getAutor());
    }
}
