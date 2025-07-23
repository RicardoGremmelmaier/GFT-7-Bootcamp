/* Autor: Ricardo Marthus Gremmelmaier, Data: 23/7/2025
 * Programa realizado para resolver as atividades do Bootcamp GFT 7 da DIO.
 * Exercício 1: Escreva um código que recebe um número e seja gerada a tabuada de 1 a 10 desse número.
 * Exercício 2: Escreva um código que receba a altura e o peso de um usuario e imprima uma mensagem de 
 * acordo com o resultado do IMC:
 * Menor ou igual a 18.5: Abaixo do peso
 * Entre 18.5 e 24.9: Peso normal
 * Entre 25 e 29.9: Sobrepeso
 * Entre 30 e 34.9: Obesidade grau 1
 * Entre 35 e 39.9: Obesidade grau 2
 * Maior ou igual a 40: Obesidade grau 3
 * Exercício 3: Escreva um código que o usuário entra com um primeio numero, um segundo numero maior que o primeiro
 * e escolhe a opção entre par e impar. Com isso, o código deve gerar todos os números pares ou ímpares entre os dois números 
 * (incluindo os números digitados) e em ordem decrescente.
 * Exercício 4: Escreva um código que recebe um numero inicial, posteriormente inforrmando outros N numeros. A execução do código
 * irá continuar até que o numero informado dividido pelo prrimeiro numero tenha resto diferente de zero na divisão.
 * Numeros menores que o primeiro devem ser ignorados.
 */

import java.util.Scanner;

public class Structures {
    public static void main(String[] args){
        //Exercício 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para gerar a tabuada de 1 a 10 desse número:");
        int number = scanner.nextInt();
        System.out.println("Tabuada do " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }

        //Exercício 2
        System.out.println("Digite a sua altura");
        float altura = scanner.nextFloat();
        System.out.println("Digite o seu peso");
        float peso = scanner.nextFloat();
        float imc = peso / (altura * altura);

        String resultado;

        if (imc <= 18.5) resultado = "Abaixo do peso";
        else if (imc <= 24.9) resultado = "Peso normal";
        else if (imc <= 29.9) resultado = "Levemente acima do peso";
        else if (imc <= 34.9) resultado = "Obesidade grau 1";
        else if (imc <= 39.9) resultado = "Obesidade grau 2";
        else resultado = "Obesidade grau 3";

        System.out.println("Seu IMC é: " + imc + " e você está classificado como: " + resultado);
        //Exercício 3
        System.out.println("Digite o primeiro número:");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Digite o segundo número (maior que o primeiro):");
        int segundoNumero = scanner.nextInt();

        System.out.println("Escolha a opção (1 - Par, 2 - Ímpar):");
        int opcao = scanner.nextInt();

        for (int i = segundoNumero; i >= primeiroNumero; i--) {
            if (opcao == 1 && i % 2 == 0) {
                System.out.println(i);
            } else if (opcao == 2 && i % 2 == 1) {
                System.out.println(i);
            }
        }

        //Exercício 4
        System.out.println("Digite um número inicial:");
        int numeroInicial = scanner.nextInt();
        int numero;
        while (true) {
            System.out.println("Digite um número:");
            numero = scanner.nextInt();
            if (numero < numeroInicial) {
                continue;
            }
            if (numero % numeroInicial != 0) {
                break;
            }
        }
        scanner.close();
    }
}