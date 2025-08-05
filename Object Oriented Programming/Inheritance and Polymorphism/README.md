# Programação Orientada a Objetos

Aqui terá um resumo sobre os conteúdos das aulas disponibilizadas nesse módulo, a fim de condensar e centralizar os conteúdos aprendidos.


## Herança

A herança são propriedades herdadas de uma classe por outra classe pai. Essas propriedades incluem os atributos e os métodos. Podemos por exemplo criar uma classe de empregado e uma classe de gerente, de vendedor,  como a seguir: 

```java
public class Employee {
    private String name;
    private String code;
    private String address;
    private int age;
    private double salary;

    public String getCode(){
        return this.code;
    }

    public void setCode(String code){
        this.code = code;
    }
}

public class Manager {
    private String login;
    private String password;
    private double comission;

    public String getLogin(){
        return this.login;
    }

    public String getPassword(){
        return this.password;
    }
}

public class Salesman {
    private double percentPerSold;

    public double getPercentPerSold(){
        return this.percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold){
        this.percentPerSold = percentPerSold;
    }
}
```

Ambas as classes **salesman** e **manager** precisam dos atributos e dos métodos inseridos em **employee**, mas a fim de evitar duplicação de códigos, inserimos então a herança de classe.

```java
public class Manager extends Employee{
    //Mesmo código de antes
}

public class Salesman extends Employee{
    //Mesmo código de antes
}
```

Desse modo, podemos utilizar os métodos e atributos de Employee dentro das outras duas classes, sem colocá-los diretamente no trecho de código.

Podemos também criar uma classe do tipo **abstract**, que é uma classe que não pode ser instanciada, ou seja, pode existir uma variável do seu tipo, mas ela não pode ser instanciada como objeto dessa classe.

Também é possível definir nossa classe como **final**, negando então quaisquer outras heranças posteriores.

Por fim, uma classe também pode ser **sealed**, onde geramos regras de permissão onde quem pode herdar e quem não pode herdar dessa classe. Além disso, as subclasses seladas devem ser definidas como **sealed**, **final** ou **non-sealed**.

```java
public sealed abstract class Employee permits Manager, Salesman{
    //Mesmo código de antes
    //Classe não pode ser instanciada, mas permite que Manager e Salesman possuam sua herança
}
```

Para fazer chamadas de métodos da classe pai, utilizamos a palavra reservada **super**, e para verificar qual a instância do objeto, verificamos utilizando **instanceof**. O instanceof ele verifica a hierarquia também, ou seja, ele também retorna verdadeiro caso você faça a verificação com a classe pai.

## Polimorfismo

O **Polimorfismo** é a capacidade de um objeto ser tratado como uma instância de sua própria classe ou de suas classes pai. Isso permite que um mesmo método seja chamado em diferentes objetos, com resultados distintos dependendo da classe do objeto.

Existem duas formas principais de polimorfismo: de **compilação** (Sobrecarga) e de **execução** (Substituição).

### Polimorfismo de compilação

Ocorre quando uma classe possui múltiplos métodos com o mesmo nome, mas com diferentes assinaturas (tipos e/ou número de parâmetros). A escolha do método a ser executado é feita em tempo de compilação, com base na assinatura do método chamado. 

```java
   class Calculadora {
       public int soma(int a, int b) {
           return a + b;
       }

       public double soma(double a, double b) {
           return a + b;
       }
   }
```

### Polimorfismo de execução

Ocorre quando uma subclasse redefine um método da sua superclasse. A escolha do método a ser executado é feita em tempo de execução, com base no tipo real do objeto. 

```java
   class Animal {
       public void fazerSom() {
           System.out.println("Som genérico de animal");
       }
   }

   class Cachorro extends Animal {
       @Override
       public void fazerSom() {
           System.out.println("Au au");
       }
   }

   class Gato extends Animal {
       @Override
       public void fazerSom() {
           System.out.println("Miau");
       }
   }
```

