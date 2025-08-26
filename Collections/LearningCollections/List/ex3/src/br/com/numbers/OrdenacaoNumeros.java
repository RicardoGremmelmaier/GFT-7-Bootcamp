package br.com.numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class OrdenacaoNumeros {
    List<Numero> numeros;

    public OrdenacaoNumeros() {
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(int valor) {
        numeros.add(new Numero(valor));
    }

    public List<Numero> ordenarAscendente() {
        List<Numero> numerosOrdenados = new ArrayList<>(numeros);
        Collections.sort(numerosOrdenados);
        return numerosOrdenados;
    }

    public List<Numero> ordenarDescendente() {
        List<Numero> numerosOrdenados = new ArrayList<>(numeros);
        Collections.sort(numerosOrdenados, Collections.reverseOrder());
        return numerosOrdenados;
    }
}

class Numero implements Comparable<Numero> {
    private int valor;

    public Numero(int valor) {
        this.valor = valor; 
    }

    public int getValor() {
        return valor;
    }

    @Override
    public int compareTo(Numero outro) {
        return Integer.compare(this.valor, outro.valor);
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}
