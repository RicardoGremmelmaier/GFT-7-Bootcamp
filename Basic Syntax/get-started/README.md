# Sintaxe básica

Aqui terá um resumo sobre os conteúdos das aulas disponibilizadas nesse módulo, a fim de condensar e centralizar os conteúdos aprendidos.


## Padrões de desenvolvimento e conceitos

* Nomes de classe são **sempre em classe maiúscula**.

```java
public class MyClass{}
public class Class{}
```

* Nomes de métodos **iniciam em minúscula e utilizam CamelCase**

```java
public static void main(){}
public static void myMethod(){}
```

* Comentários podem ser de uma linha ou mais

```java
// Comentário de uma linha

/*
 * Comentário
 * de
 * mais
 * de
 * uma
 * linha
*/
```

* Os imports podem ser generalizados ou específicos. Vale ressaltar que o import generalizado não pega diretórios internos e somente as classes nesse diretório. **É melhor usar imports específicos do que generalizados**.

```java
package java.util.Scanner; //Import específico
package java.util.*; //Import generalizado
```

* O print pode ter diversas formatações. O *ln* no final garante que a linha será pulada, o *printf* permite associar parâmetros a variáveis dentro de um print (mas não pula linha). A *concatenação de strings* pode ocorrer naturalmente usando o operador de soma.

```java
String nome = "Ricardo"
System.out.println("Ola, " + nome); //Ola, Ricardo 
System.out.printf("Ola, %s \n", nome); //Ola, Ricardo
```

* É possível utilizar **var** ao invés dos tipos primitivos (*int, char, etc.*) ao declarar e instanciar uma variável.

```java
var scanner = new Scanner(System.in);
var name = scanner.next();
var age = scanner.nextInt();
```

* Constantes são utilizadas com todas as letras maiúsculas e separadas por underline.

```java
public class Main {
    private final static String WELCOME_MESSAGE = "Olá, bem vindo"

    public static void main(String[] args){
        System.out.println(WELCOME_MESSAGE);
    }
}
```