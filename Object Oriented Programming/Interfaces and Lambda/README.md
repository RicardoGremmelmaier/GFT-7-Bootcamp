# Programação Orientada a Objetos

Aqui terá um resumo sobre os conteúdos das aulas disponibilizadas nesse módulo, a fim de condensar e centralizar os conteúdos aprendidos.


## Interfaces

A principal diferença entre classe abstrata e interface reside em sua natureza e propósito. Uma classe abstrata pode conter implementação de métodos e variáveis, além de métodos abstratos, servindo como um modelo para subclasses que podem ou não fornecer implementação para esses métodos. Já uma interface, por outro lado, define apenas um contrato, um conjunto de métodos que as classes que a implementam devem obrigatoriamente fornecer implementação. 

As interfaces não pode conter implementação de métodos ou variáveis (exceto constantes), elas definem um conjunto de métodos que devem ser implementados pelas classes que a utilizam. Não pode ter construtores ou destrutores. Todas as constantes criadas em interfaces são públicas, estáticas e final.

```java
public interface MusicPlayer {
    void playMusic();
    void stopMusic();
    void pauseMusic();
}

// É possível q uma interface herde outra
public interface VideoPlayer extends MusicPlayer{
    void playVideo();
    void stopVideo();
    void pauseVideo();
}

// É possível implementar mais de uma interface, tendo que implementar todos os métodos
public class Smartphone implements VideoPlayer, MusicPlayer{
    //Implementação dos métodos
}
```

## Interfaces Funcionais

Em Java, uma interface funcional é uma interface que possui exatamente um método abstrato, também conhecido como método único abstrato (SAM). Essa interface serve como base para a programação funcional, permitindo o uso de expressões lambda e referências de métodos. 

```java
@FunctionalInterface
interface Calculadora {
    int calcular(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        Calculadora soma = (a, b) -> a + b;
        int resultado = soma.calcular(5, 3);
        System.out.println(resultado); // Output: 8
    }
}
```