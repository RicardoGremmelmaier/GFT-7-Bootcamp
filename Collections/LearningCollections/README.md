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

