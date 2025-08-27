## Stream

* A Stream API serve para manipular coleções em Java seguindo os princípios da programação funcional.
* Trata-se de uma poderosa solução para processar coleções de maneira declarativa, ao invés da tradicional e burocrática maneira imperativa.

```java
// Forma imperativa
public class CarrinhoDeCompras{

    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList();
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        if(itemList.isEmpty()){throw new RuntimeException ("A lista esta vazia.");}

        for (Item item : itemList){
            valorTotal += item.getPreco() * item.getQuant();
        }
        return valorTotal;
    }
}
```

```java
public class CarrinhoDeCompras{
    
    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList();
    }

    public double calcularValorTotal(){
        if (itemList.isEmpty()){throw new RuntimeException ("A lista esta vazia.");}
        return itemList.stream()
        .mapToDouble(item -> item.getPreco() * item.getQuant())
        .sum();
    }
    
}
```

## Lambda

* As expressões Lambda permitem representar interfaces funcionais (com um unico método abstrato) de forma mais concisa.
* As interfaces funcionais servem de base para o uso de expressões lambda.
* A função lambda não possui declaração e a ideia é que esse método seja usado no mesmo lugar em que for declarado.
* Tem a sintaxe definida como `(argumento) -> (corpo)`

```java
public class OrdenacaoPessoa{

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa(){
        pessoaList = new ArrayList<>();
    }

    public List<Pessoa> ordenarPorAltura(){
        if (pessoaList.isEmpty()){throw new RuntimeException ("Lista vazia")}

        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        pessoasPorAltura.sort((p1, p2) -> Double.compare(p1.getAltura(), p2.getAltura()));
        return pessoasPorAltura;
    }
}
```

## Method Reference

* Permite fazer a referência a um método ou construtor de uma classe e assim indicar que ele deve ser utilizado num ponto específico do código, deixando o mais simples.
* Para utilizá-lo, basta informar uma classe ou referência seguida de `::` e o nome do método sem os parênteses no final.

```java
public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa(){
        pessoaList = new ArrayList<>();
    }

    public List<Pessoa> ordenarPorAltura(){
        if (pessoaList.isEmpty()){
            throw new RuntimeException ("Lista vazia");
        }

        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        pessoasPorAltura.sort(Comparator.comparingDouble(Pessoa::getAltura));
        return pessoasPorAltura;
    }
}
```

Existem diversos métodos para as interfaces funcionais, com cada um com seu uso. Existem as operações intermediárias (retornam uma nova Stream) e operações terminais (encerram o pipeline). Alguns exemplos são

* ForEach
* generate
* filter
* reduce
* map
* limit
* sort
* toArray
* count
* anyMatch
