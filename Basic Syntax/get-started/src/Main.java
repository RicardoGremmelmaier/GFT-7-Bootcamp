/* Autor: Ricardo Marthus Gremmelmaier, Data: 22/7/2025
 * Programa realizado para resolver as atividades do Bootcamp GFT 7 da DIO.
 * Exercício 1: Escreva um código que recebe o nome e idade de alguem e imprima na tela
 * "Olá, pessoa, você tem idade anos."
 * Exercício 2: Escreva um código que receba o tamanho do lado de um quadrado e calcula a área do quadrado.
 * Exercício 3: Escreva um código que recebe a base e a altura de um triângulo e calcula a área do retângulo.
 * Exercício 4: Escreva um código que recebe o nome e a idade de 2 pessoa e imprima a diferença de idade entre elas.
 * 
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Exercício 1
        var scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String nome = scanner.next();
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");

        //Exercício 2
        System.out.println("Digite o tamanho do lado do quadrado:");
        double lado = scanner.nextFloat();
        scanner.nextLine();
        double areaQuadrado = lado * lado;
        System.out.println("A área do quadrado é: " + areaQuadrado);

        //Exercício 3
        System.out.println("Digite a base do retângulo:");
        double base = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Digite a altura do retângulo:");
        double altura = scanner.nextFloat();
        scanner.nextLine();
        double areaRetangulo = base * altura;
        System.out.println("A área do retângulo é: " + areaRetangulo);

        //Exercício 4
        System.out.println("Digite o nome da primeira pessoa:");
        String nome1 = scanner.next();
        System.out.println("Digite a idade da primeira pessoa:");
        int idade1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome da segunda pessoa:");
        String nome2 = scanner.next();
        System.out.println("Digite a idade da segunda pessoa:");
        int idade2 = scanner.nextInt();
        scanner.nextLine();

        int diferencaIdade = Math.abs(idade1 - idade2);
        System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é de " + diferencaIdade + " anos.");
    
        scanner.close();
    }
}