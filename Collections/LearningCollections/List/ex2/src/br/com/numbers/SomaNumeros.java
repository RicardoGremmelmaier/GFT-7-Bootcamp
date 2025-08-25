package br.com.numbers;

import java.util.List;
import java.util.ArrayList;

public class SomaNumeros {
    List<Integer> numeros;

    public SomaNumeros() {
        numeros = new ArrayList<Integer>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        return soma;
    }

    public int encontraMaiorNumero(){
        int maior = Integer.MIN_VALUE;
        for(int num : numeros){
            if(num > maior){
                maior = num;
            }
        }
        return maior;
    }

    public int encontraMenorNumero(){
        int menor = Integer.MAX_VALUE;
        for(int num : numeros){
            if(num < menor){
                menor = num;
            }
        }
        return menor;
    }

    public List<Integer> exibirNumeros(){
        return numeros;
    }
}
