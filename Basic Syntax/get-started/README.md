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

## Keywords e Tipos primitivos

Existem diversos tipos de **Keywords** e **tipos primitivos** no Java. Essas palavras são reservadas e possuem um uso específico, não podendo serem reutilizadas como nomes de variáveis (por exemplo). 

Podemos ver as palavras reservadas do Java no site da [W3schools](https://www.w3schools.com/java/java_ref_keywords.asp). Alguns exemplos são o **break**,o **continue**, etc.

Os tipos primitivos podem ser vistos no site da [DIO](https://www.dio.me/articles/java-tipos-primitivos). Alguns exemplos são o **byte**, o **int**, o **short**, etc.

* É interessante utilizar um *L* ao final de uma variável **long**, já que o Java reconhece que essa variável será um long.

```java
var number = 1L;
```
* Do mesmo modo pode ser feito para variáveis **float**, adicionando um *f* ao final dela.

```java
var number = 1.0f;
```

* Para **char**, utilizamos aspas simples.

```java
char c = 'a';
```

* Para **String**, utilizamos aspas duplas.

```java
char s = "a";
```

## Operadores de atribuição e lógicos

Os operadores são a base da programação. É com eles que fazemos a lógica dos nossos algoritmos e o uso indevido deles podem acarretar bugs. A seguir seguem os operadores de atribuição e lógicos.

* O operador **=** é o operador de **atribuição**.

```java
var scanner = new Scanner(System.in);
```

* O operador **==** é o operador de igualdade.

```java
boolean isRight = result == 4;
```

* O operador **!=** é o operador de diferente.

```java
boolean isDiff = result != 4;
```

* O operador **!** é o operador de inversão.

```java
boolean isTrue = true; //true
boolean isNotTrue = !isTrue; //false
```

* Os operadores **>** (maior), **>=** (maior ou igual), **<** (menor) e **<=** (menor ou igual) servem para retornar um booleano comparando valores de números.

```java
int number = 10;
var greater = 12 > number; //true
var less = 9 < number; //true
var equal = 10 >= number; //true
var anotherEqual = 10 >= number; //true
```

* O operador **||** e o operador de **OU** lógico, e segue a tabela verdade desta operação lógica.

A    | B    | Resultado
-----|------|--------
0    |0     | 0
0    |1     | 1
1    |0     | 1
1    |1     | 1

```java
int number = 10;
boolean isGreaterThan = number > 12; //false
boolean isLessThan = number < 15; //true

var isTrue = isGreaterThan || isLessThan; //false or true = true
```

* O operador **&&** e o operador de **AND** lógico, e segue a tabela verdade desta operação lógica.

A    | B    | Resultado
-----|------|--------
0    |0     | 0
0    |1     | 0
1    |0     | 0
1    |1     | 1

```java
int number = 10;
boolean isGreaterThan = number > 12; //false
boolean isLessThan = number < 15; //true

var isTrue = isGreaterThan && isLessThan; //false and true = false
```

## Operadores aritméticos

De maneira simila aos operadores lógicos, os opeadores aritméticos são muito importantes para a lógica dos algoritmos.

* O operador **+** realiza a soma entre dois números. Ele também pode servir como concatenador de Strings.

```java
int numero1 = 10;
int numero2 = 20;
int soma = numero1 + numero2;

System.out.println("A soma de " + numero1 + " com " + numero2 "é " + soma); //A soma de 10 com 20 é 30
System.out.println("A soma de " + numero1 + " com " + numero2 "é " + (numero1 + numero2)); //A soma de 10 com 20 é 30
```

* O operador **-** serve somente para subtrações, ele não realiza concatenações de String.

```java
int numero1 = 20;
int numero2 = 10;
int subtracao = numero1 - numero2; //20 - 10 = 10
```

* O operador **/** realiza a divisão entre dois números (inteiro com inteiro retorna inteiro, se tiver um float retorna um float), enquanto o operador **%** retorna o resto da divisão.

```java
int dividendo = 55;
int divisor = 2;
int resultado = dividendo/divisor; //27
int resto = dividendo%divisor; //1
```

* O operador * serve somente para multiplicações.

```java
int numero1 = 20;
int numero2 = 10;
int subtracao = numero1 * numero2; //20 * 10 = 200
```

* O operador **++** ou **--** é utilizado para incrementar ou decrementar em um o valor atual da variável. Ele pode ser usado pós e pré ao valor, dependendo de como utilizado;

```java
int contador = 1;
contador++; //soma na próxima linha
++contador++; //soma nessa linha
contador--; //subtrai na linha seguinte
--contador; //subtrai nessa linha
```

## Operadores Bitwise (Bit a Bit)

São menos utilizados no ambiente de WebDev, mas muito utilizados em sistemas embarcados, microcontrolados ou no ambiente de processadores.

* O operador **&** realiza um AND bit a bit (vide tabela acima), o operador **|** realiza um OR bit a bit (vide tabela acima), o operador **^** realiza um XOR (OU exclusivo) bit a bit.

A    | B    | Resultado XOR
-----|------|--------
0    |0     | 0
0    |1     | 1
1    |0     | 1
1    |1     | 0

* O operador **~** realiza um complemento, ou seja, ele inverte todos que são 0 para 1 e todos que são 1 para 0

A    | Resultado
-----|-------
0    |1
1    |0  

* Os operadores **<<** e **>>** realizam a operação de deslocamento de bits para a esquerda ou direita. Eles podem ser associados a multiplicações múltiplas por dois e divisão múltiplas por dois, respectivamente. O Right shift operator faz a verificação de números positivos ou negativos e preenche de acordo (1 se for negativo, 0 se for positivo). O operador **>>>** (unsigned right shift) preenche todos com 0, independente do sinal do valor original.