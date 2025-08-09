# Programação Orientada a Objetos

Aqui terá um resumo sobre os conteúdos das aulas disponibilizadas nesse módulo, a fim de condensar e centralizar os conteúdos aprendidos.


## Collection

Existem diversos tipos diferentes de Collections em Java. Dois deles são o **array** e o **list**.

* Os Arrays podem ser criados inicializando o seu array ou não. Caso não, é necessário definir seu tamanho.

```java
public class Main {

    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4};
        int[] otherNumbers = new int[2];
        otherNumbers[0] = 5;
        otherNumbers[1] = 6;
    }
}
```

* As listas precisam ter sua declaração de tipo na sua criação, e elas não conseguem trabalhar com o tipo primitivo int, tendo que trabalhar com Integer. O tamanho de uma lista é variável e pode aumentar ou diminuir dinamicamente, sendo que os novos elementos são adicionados no final da lista. Existem diversos tipos de Lista, como **ArrayList**, **LinkedList** (que é útil para quando se insere e remove vários elementos da lista), entre outros, com cada um tendo o seu melhor cenário de desempenho

```java
public class Main {
    
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
    }
}
```

* O **vector** é bem similar ao ArrayList, mas ele tem a propriedade de ser síncrono, ou seja, é uma implementação boa para threads.

É possível também trabalhar com **objetos** no tipo das listas, podendo então criar suas classes e gerar listas desses objetos.

Existem diversos métodos implementados para listas, como por exemplo **contains, size, isEmpty, add, remove, getFirst, getLast,** entre outros.

* O Set é um tipo de lista que não pode ter itens duplicados, ou seja, é utilizado quando queremos implementar uma coleção de elementos únicos. É possível utilizar HashSet, LinkedHashSet (mantém ordenado os valores), TreeSet.

```java
import java.util.Set;

public class Main{

    public static void main(String[] args){
        Set<User> users = new HashSet<>();
        users.add(new User(1, "João"));
        users.add(new User(2, "Maria"));
        users.add(new User(3, "Pedro"));
    }
}
```

## Map

Um mapa é uma associação de uma chave com um valor, ou seja, um par <V,K>, onde a chave deverá ser única, ou seja, não pode se repetir.

```java
import java.util.HashMap;
import java.util.Map;

public class Main{

    public static void main(String[] args){
        Map<String,User> users = new HashMap();
        users.put("joao@joao.com", new User("João", 22));
        users.put("maria@maria.com", new User("Maria", 22));
        users.put("pedro@pedro.com", new User("Pedro", 22));
    }
}
```

Podemos chamar os métodos keySet para visualizar as chaves e values para verificar os valores separadamente.

```java
users.keySet().forEach(System.out::println);
users.values().forEach(System.out::println);
```

Existem diversos outros métodos, como o **remove**, **replace**, entre outros.

## Wrappers

Em Java, classes wrapper são classes que envolvem tipos de dados primitivos (como int, double, char, etc.) em objetos. Elas permitem que tipos primitivos sejam usados onde objetos são necessários, como em coleções ou em métodos que requerem objetos.

As coleções em Java (como ArrayList, HashMap, etc.) só podem armazenar objetos, não tipos primitivos. As classes wrapper permitem que você use tipos primitivos dentro dessas coleções. As classes wrapper fornecem métodos úteis para manipulação dos tipos primitivos, como conversões de tipo, comparações, etc. Algumas APIs ou métodos podem exigir objetos como argumentos, e as classes wrapper permitem que você use tipos primitivos nessas situações. Tipos primitivos não podem receber o valor null, mas suas classes wrapper correspondentes podem. Isso é útil quando você precisa representar a ausência de um valor. 

Os tamanhos das variáveis aumentam e os Wrappers podem ser vistos a seguir:

Tipo primitivo | Wrapper
---------------|---------
boolean | Boolean
byte | Byte
int | Integer
char | Character
short | Short
long | Long
double | Double
float | Float

## String

É uma classe muito utilizada e possui muitos recursos que podem ser utilizados. Além dos mostrados abaixo, existem os métodos **toUpperCase, toLowerCase, contains, indexOf, endsWith, startsWith, isEmpty, isBlank, trim**.

```java

public class Main{

    public static void main(String[] args){
        var value = "java;java;java;java"
        value = value.replaceFirst("j","J") //Altera somente o primeiro
        value = value.replace("j","J") //Altera todos
        var values = value.split(";", 2); //Divide a string de acordo com o parâmetro, podendo ser limitada
        var jav = value.substring(0,3); //Inclusivo no inicio, exclusivo no fim, jav = jav

    }
}
```

É possível realizar concatenações de String, porém não é recomendado utilizar isso dentro de Loops. A concatenação de String gera um novo endereço de memória para o valor a ser gerado, já que uma String é imutável, e por isso, seria gerado diversos endereços de memória para realizar essas concatenações.

Para resolver isso, é possível utilizar uma classe StringBuilder ou StringBuffer. Diferente da String, ambas são mutáveis e melhor recomendadas para loops de concatenações de String. A diferença da StringBuilder para a StringBuffer é que a StringBuffer é recomendada para synchronize, ou seja, multithreads.

## BigDecimal, Enums e Optional

* Contas com números de pontos flutuantes nunca são exatas, por causa da precisão causada por culpa do tamanho dos tipos primitivos. Por isso, em java e em outras muitas linguagens, 0.1 + 0.2 é diferente de 0.3. Para resolver isso, é utilizado então a classe **BigDecimal**, em que aumenta essa precisão.

```java
public class Main{

    public static void main(String[] args){
        var value1 = new BigDecimal("0.1");
        var value2 = new BigDecimal("0.2");
        var

        System.out.println(value1.add(value2)); //Não usamos soma normal, utilizamos os métodos providos pela classe para realizar as operações
        //Printa 0.3
    }
}
```
* Os **Enum** servem para trabalhar com valores pré definidos. Por exemplo, gênero masculino e feminino é um exemplo de Enum, tipos de Pokémon, entre outros. Eles também podem ter propriedades associadas a essas constantes.

```java
public enum OperationEnum{

    SUM((Integer v1, Integer v2) -> v1 + v2, "+"), 
    SUBTRACTION((Integer v1, Integer v2) -> v1 - v2, "-"),
    MULTIPLY((Integer v1, Integer v2) -> v1 * v2, "*"),
    DIVISION((Integer v1, Integer v2) -> v1 / v2, "/");

    private final BiFunction<Integer, Integer, Integer> calculate;

    private final String symbol;

    OperationEnum(BiFunction<Integer, Integer, Integer> calculate, String symbol){
        this.calculate = calculate;
        this.symbol = symbol;
    }

    public BiFunction<Integer, Integer, Integer> getCalculate(){
        return calculate;
    }

    public String getSymbol(){
        return symbol;
    }
}
```

* A classe **Optional** em Java é um contêiner que pode ou não conter um valor não nulo. Ela foi projetada para evitar exceções de ponteiro nulo (NullPointerExceptions), oferecendo uma forma mais segura e explícita de lidar com valores que podem estar ausentes. 

```java
import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {
        String texto = "Olá, mundo!";
        Optional<String> optionalTexto = Optional.ofNullable(texto);

        if (optionalTexto.isPresent()) {
            String maiusculo = optionalTexto.get().toUpperCase();
            System.out.println(maiusculo);
        } else {
            System.out.println("Texto ausente");
        }

        String texto2 = null;
        Optional<String> optionalTexto2 = Optional.ofNullable(texto2);

        String resultado = optionalTexto2.orElse("Valor padrão");
        System.out.println(resultado); // Imprime "Valor padrão"
    }
}
```

## API de Stream e Generics

A API Stream em Java serve para processar sequências de elementos de forma declarativa e funcional, utilizando uma abordagem de mapeamento, filtragem e redução. Em vez de usar loops tradicionais para manipular coleções, a API Stream permite expressar operações de processamento de dados de maneira mais concisa e legível, seguindo o paradigma funcional. 

```java
import java.util.Random;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Main{
    public static void main(String[] args){
        //Os dois values fazem a mesma coisa, gerar um array de int aleatórios
        var value1 = Stream.generate(() -> new Random().nextInt())
        .limit(5)
        .toArray(Integer[]::new);

        for (var v: value1){
            System.out.println(v);
        }

        var value2 = IntStream.generate(() -> new Random().nextInt())
        .limit(5)
        .toArray();



        Stream.of("Maria","Pedro","Julia","Ricardo")
            .filter(name -> name.endsWith("a"))
            .toList(); //Insere em uma lista os nomes que terminam com a letra a

        var value = Stream.of(1,2,3,4,5,6,7,8,7,8,7)
            .map(numb -> numb*2)
            .toList();
    }
}
```

Existem diversos outros métodos, como o **reduce, filter, collect, peak** (para debug), entre outros.

Em Java, **generics** são um recurso que permite criar classes, interfaces e métodos que podem operar **com diferentes tipos de dados**, sem a necessidade de conversões (casting) explícitas, e garantindo a segurança de tipos em tempo de compilação. Isso significa que você pode escrever código mais flexível e reutilizável, evitando erros que poderiam ocorrer em tempo de execução devido a incompatibilidades de tipo. 

```java
import java.util.ArrayList;
import java.util.List;

public class Caixa<T> {
    private T item;

    public Caixa(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public static void main(String[] args) {
        // Cria uma caixa para Strings
        Caixa<String> caixaDeString = new Caixa<>("Olá, mundo!");
        String texto = caixaDeString.getItem();
        System.out.println(texto);

        // Cria uma caixa para inteiros
        Caixa<Integer> caixaDeInteiro = new Caixa<>(123);
        int numero = caixaDeInteiro.getItem();
        System.out.println(numero);
    }
}
```

## Date e Calendar

* Date é a classe mais antiga criada para fazer tratamentos com data. No entanto, ela é depreciada ja.

```java
import java.util.Date;

public class Main{
    public static void main(String[] args){

        var date = new Date(); //Thu Aug 07 17:31:22 BRT 2025
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss") //utilizar hh -> formato am, pm; utilizar HH -> formato 24 horas
        var formattedDate = formatter.format(date); // 07/08/2025 - 17:31:22

        var ms = System.currentTimeMillis();

        var date1 = new Date(ms);
        var date2 = new Date(ms);
        System.out.println(date1.before(newDate(ms + 1000))); //true
    }
}
```

* Calendar traz mais informações do que o Date, porém precisa de formatações para ser utilizado. É possível também fazer alterações de datas, como contas aritméticas.

```java
import java.util.Date;

public class Main{
    public static void main(String[] args){

        var calendar = Calendar.getInstance();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss Z"); 
        System.out.println(formatter.format(calendar.getTime()));

        System.out.println(formatter.format(calendar.get(Calendar.YEAR)));
        System.out.println(formatter.format(calendar.get(Calendar.MONTH)));
        System.out.println(formatter.format(calendar.get(Calendar.DAY_OF_MONTH)));
        System.out.println(formatter.format(calendar.get(Calendar.HOUR)));
        System.out.println(formatter.format(calendar.get(Calendar.SECOND)));

        calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) -5); //Setado para 5 anos atras
    }
}
```