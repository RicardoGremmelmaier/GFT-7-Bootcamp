# Sintaxe básica

Aqui terá um resumo sobre os conteúdos das aulas disponibilizadas nesse módulo, a fim de condensar e centralizar os conteúdos aprendidos.


## Estrutura condicional if else e else if

**If**, **else** e **else if** são estruturas utilizadas para verificação de condições booleanas (true or false). 

São utilizadas como condições (execute isso caso isso seja verdadeiro, ou não execute isso caso isso seja verdadeiro, por exemplo.)


```java
String name = "Ricardo";
int age = 24;

if (!(name.equals("Ricardo"))){
    System.out.println("Usuário indevido")
}
else {
    if (age < 18){
        System.out.println("Voce ainda nao pode dirigir, " + name);
    }
    else {
        System.out.println("Voce pode dirigir, " + name);
    }
}
```

É possível fazer também um **if ternário** em Java.

```java
var idade = 19;
var maiorDeIdade = (idade >= 18);
var podeDirigir = maiorDeIdade? true : false; // if ternário
```

## Estrutura de controle switch case

É utilizada para gerar uma seleção múltipla, que executa diferentes blocos de códigos com base no valor de uma expressão.

```java
var number = 4;

switch (option){
    case 1: 
        System.out.println("Domingo");
        break;
    case 2: 
        System.out.println("Segunda");
        break;
    case 3: 
        System.out.println("Terça");
        break;
    case 4: 
        System.out.println("Quarta");
        break;
    case 5: 
        System.out.println("Quinta");
        break;
    case 6: 
        System.out.println("Sexta");
        break;
    case 7: 
        System.out.println("Sábado");
        break;
    default: 
        System.out.println("Dia da semana inválido");
        break;
}
```

É possível também utilizar uma seta, que realiza o break de maneira invisível ao programador.

```java
switch(option){
    case 1, 2 -> System.out.println("Faça algo");
    case 3 -> {
        System.out.println("Faça outro algo");
        System.out.println("Faça mais outro algo");
    }
}
```

