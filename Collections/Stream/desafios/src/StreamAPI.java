import java.util.Arrays;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) throws Exception {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Desafio 1
        numeros.stream().sorted().forEach(System.out::println);

        // Desafio 2
        System.out.println(numeros.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum));

        // Desafio 3
        System.out.println(numeros.stream().filter(n -> n < 0).count() > 0 ? "Temos números negativos" : "Não temos números negativos");
    
        // Desafio 4
        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        // Desafio 5
        long quantidade = numeros.stream().filter(n -> n > 5).count();
        long soma = numeros.stream().filter(n -> n > 5).reduce(0, (n1, n2) -> n1 + n2);
        System.out.println("Média n > 5: " + (quantidade > 0 ? (double) soma / quantidade : 0));

        // Desafio 6
        System.out.println(numeros.stream().anyMatch(n -> n > 10));

        // Desafio 7
        System.out.println(numeros.stream().sorted().limit(numeros.size() - 1).max(Integer::compare));

        // Desafio 9
        int quantidadeDistintos = (int) numeros.stream().distinct().count();
        System.out.println(numeros.stream().count() == quantidadeDistintos ? "Todos os números são distintos" : "Existem números repetidos");
    
        //Desafio 10
        System.out.println(numeros.stream().filter(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0)).reduce(0, (n1, n2) -> n1 + n2));

        // Desafio 11
        System.out.println(numeros.stream().map(n -> n * n).reduce(0, Integer::sum));

        // Desafio 12
        System.out.println(numeros.stream().reduce(1, (n1, n2) -> n1 * n2));

        // Desafio 13
        numeros.stream().filter(n -> n > 4 && n < 11).forEach(System.out::println);

        // Desafio 16
        List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).toList();
        List<Integer> numerosImpares = numeros.stream().filter(n -> n % 2 != 0).toList();
        System.out.println("Numeros pares: " + numerosPares);
        System.out.println("Numeros impares: " + numerosImpares);

        // Desafio 18
        System.out.println(numeros.stream().distinct().count() == 1 ? "Todos os números são iguais" : "Existem números diferentes");
    
        // Desafio 19
        System.out.println(numeros.stream().filter(n -> n % 3 == 0 || n % 5 == 0).reduce(0, Integer::sum));
    }
}
