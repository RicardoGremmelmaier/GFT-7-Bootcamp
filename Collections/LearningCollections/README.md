# Programação Orientada a Objetos

Aqui terá um resumo sobre os conteúdos das aulas disponibilizadas nesse módulo, a fim de condensar e centralizar os conteúdos aprendidos.


## Collections

É possível ver diferentes classes do Collections dentro de `Object Oriented Programming/Collections and Others Classes`. Vamos focar aqui em classes que não foram vistas lá

### Comparable x Comparator

* O **Comparable** fornece uma única sequência de ordenação, ou seja, com base em um único elemento (id, nome, etc.). Ele modifica a classe e fornece o método `CompareTo()` para ordenar elementos. É possível ordenar os elementos da lista do tipo `Comparable` usando o método `Collections.sort(List)`.

```java
public class Livro implements Comparable<Livro>{
    ...
}
```

* O **Comparator** fornece o método `compare()` para ordenar elementos e fornece múltiplas sequências de ordenação, ou seja, pode se basear em diversos elementos (id, nome, etc.). Ele não afeta a classe original. É possível ordenar os elementos da lista do tipo `Comparator` usando o método `Collections.sort(List, Comparator)`.

## 

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

## LocalDate, LocalDateTime, LocalTime, OffsetDateTime, OffsetTime

São as maneiras mais atuais de trabalhar com datas e por isso mais utilizadas.

* O LocalDate permite fazer adições de datas, formatação de datas, entre outros. Alguns métodos são o **plus, plusYears, plusDays, minus, minusMonths**, além de métodos como **get, getMonth, getMonthValue, getYear**, etc. Também é possível comparações, como por exemplo **isBefore, isEqual**, entre outros. O isEqual permite que vc faça comparações com datas entre outros calendários, como por exemplo o calendário Budista, ou o calendário Japonês.

```java
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args){

       LocalDate localDate = LocalDate.now();
       var strDate = "11/08/2025";
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       System.out.println(formatter.format(LocalDate.parse(strDate, formatter))); 
    }
}
```

* O LocalTime serve mais para obtenção de horas, minutos, segundos e milisegundos. Ele também permite formatações e diversos métodos.

```java
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args){

       LocalTime localTime = LocalTime.now();
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
       System.out.println(formatter.format(localTime)); 
    }
}
```

* LocalDateTime é a mistura de ambos, possuindo tanto a data quanto o tempo, e de maneira similar, ele suporta formatações e diversos métodos. Do mesmo modo que podemos transformar o localTime e o localDate em localDateTime, é possível fazer o passo reverso.

```java
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args){

        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDate.atTime(localTime);
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(formatter.format(localDateTime)); 
    }
}
```

* A classe OffsetDateTime possui algumas diferenças comparando a LocalDateTime, já que a LocalDateTime não possui a TimeZone, enquanto a offsetTime possui a TimeZone.

```java
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args){

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println(offsetDateTime); //imprime com a TimeZone (-3) 
    }
}
```

## Thread e Interface Runnable

Para trabalhar com multithreads em java, precisamos utilizar a classe Thread e a interface Runnable

```java
public class Main{

    private static List<Integer> numbers = new ArrayList<>();

    //O Bloco pode ser sincronizado, ou o método pode ser sincronizado
    private static void inc(int number){ //Estruturas de controle para evitar condições de disputa
        synchronized (numbers){
            numbers.add(number);
        }
    }

    private synchronized static void show(){
            System.out.println(numbers);
    }

    public static void main(String[] args){

        Runnable inc = () -> {
            for (int i = 0; i < 100000; i++){
                inc(i);
            }
        };

        Runnable dec = () -> {
            for (int i = 100000; i > 0; i--){
                inc(i);
            }
        };

        Runnable show = () -> {
            for (int i = 0; i < 250000; i++){
                show();
            }
        };

        new Thread(inc).start();
        new Thread(dec).start();
        new Thread(show).start();
    }
}
```