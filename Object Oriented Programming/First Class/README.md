# Programação Orientada a Objetos

Aqui terá um resumo sobre os conteúdos das aulas disponibilizadas nesse módulo, a fim de condensar e centralizar os conteúdos aprendidos.


## Primeira Classe

Classes são **"formas"** para criar abstrações na programação. 

Considerando a classe Person a seguir, podemos ter o seguinte caso:

```java
public class Person {
    public String name;
    public int age;
}
```

```java
public class Main {

    public static void main(String[] args){
        var male = new Person();
        male.name = "Ricardo";
        male.age = 24;

        var female = new Person();
        female.name = "Julia";
        female.age = 21;
    }
}
```

Diferente do exemplo acima, não é costumeiro deixar os **atributos** de uma classe como público, devido a proteção e segurança. Para isso, usamos métodos **getters** e **setters**.

```java
public class Person {
    private String name;
    private int age;

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}
```
```java
public class Main {

    public static void main(String[] args){
        var male = new Person();
        male.setName("Ricardo");
        male.setAge(24);

        var female = new Person();
        female.setName("Julia");
        female.setAge(21);
    }
}
```

O uso de **static** em um método é utilizado para caracterizar o uso pela Classe e não pela instância, ou seja, ele irá alterar para todas as posteriores instâncias, e não somente para aquela instância. Dentro do contexto estático, não é possível utilizar o **this**, já que é uma variável compartilhada e não de instância.

Os setters para métodos estáticos devem ser chamados pela classe (como por exemplo Person.setStatic()). Dentro de métodos estáticos só podem ser utilizados atributos estáticos ou criados dentro de seu contexto

**Métodos construtores** são muito utilizados também em POO. Eles servem para instanciar um objeto de maneira mais dinâmica e rápida, sem precisar acessar diversos setters.

```java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}
```
```java
public class Main {

    public static void main(String[] args){
        var male = new Person("Ricardo", 24);
        var female = new Person("Julia", 21);
    }
}
```

Podemos utilizar também **final** para garantir que as variáveis (ou atributos) irão se comportar como constantes, sem alterações.

## Trabalhando com Records

Um record é uma classe especial projetada para simplificar a criação de classes que representam dados, enquanto uma classe tradicional oferece mais flexibilidade e permite funcionalidades adicionais. Os records são imutáveis por padrão e vêm com alguns métodos gerados automaticamente.

```java
public record Person(String name, int age){
    //name e age são privados e final por padrão no record
}
```
```java
public Class Main{

    public static void main(String[] args){
        var Person = new Person("Ricardo", 22);
    }
}
```

É possível utilizar construtores para records, mas eles são utilizados como validadores de parâmetros colocados, e não como um construtor de fato.