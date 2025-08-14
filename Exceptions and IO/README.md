# Exceções

Aqui terá um resumo sobre os conteúdos das aulas disponibilizadas nesse módulo, a fim de condensar e centralizar os conteúdos aprendidos.


## Entendendo exceções

Em Java, exceções são eventos anormais que ocorrem durante a execução de um programa, interrompendo o fluxo normal do código. Elas são tratadas usando blocos try, catch, e finally para garantir que o programa possa lidar com erros e continuar a execução de forma controlada.

Existem as exceções verificadas em tempo de compilação e as exceções verificadas em tempo de execução. Um exemplo de exceção em tempo de compilação é a exception de fileNotFound, enquanto um exemplo de exceção de tempo de execução é divisão por 0, que é a exception de arithmeticException.

```java
public class Main {

    public static void main(String[] args){
        test();
        System.out.println("Finalizou"); //Não roda
    }

    private static void test(){
        System.out.println(10/0); //Exception de Runtime
    }
}
```
```java
public class Main {

    public static void main(String[] args){
        test();
        System.out.println("Finalizou"); //Não roda
    }

    private static void test() throws FileNotFoundExecption{
        var stream = new FileOutputStream(""); //Exception de fileNotFound caso não exista o arquivo
    }
}
```

Podemos ver a seguir o tratamento de uma exception.

```java
try {
    // Código que pode lançar uma exceção
    int resultado = 10 / 0; // Isso lançará ArithmeticException
    System.out.println("Resultado: " + resultado);
} catch (ArithmeticException e) {
    // Trata a exceção
    System.err.println("Erro: Divisão por zero!");
    e.printStackTrace(); // Imprime o rastreamento da pilha
} finally {
    // Código a ser executado sempre
    System.out.println("Bloco finally executado.");
}
```

Exceções podem ser lançadas explicitamente usando a palavra-chave throw. É comum criar classes de exceção personalizadas para representar erros específicos do seu domínio. 


```java
public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}

public class ContaBancaria {
    private double saldo;

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        saldo -= valor;
    }
}
```

* Use exceções personalizadas para erros específicos do seu aplicativo. 
* Lide com exceções de forma apropriada, evitando apenas imprimir o rastreamento da pilha. 
* Feche recursos em blocos finally ou utilize o recurso de try-with-resources para garantir que recursos sejam liberados. (Finally sempre ocorrem, independente de cair no catch ou não)
* Evite lançar exceções desnecessariamente. 

## java.io

O pacote **java.io** em Java fornece classes para operações de entrada e saída (E/S), permitindo que programas Java leiam e escrevam dados de diversas fontes e destinos, como arquivos, consoles e redes. Ele oferece classes para lidar com fluxos de bytes e caracteres, além de classes para manipulação de arquivos e diretórios. 

Alguns de seus principais conceitos são:

* **Fluxos de Entrada e Saída (Streams)**:
Representam um fluxo contínuo de dados, podendo ser de entrada (leitura) ou saída (escrita). 

* **Classes de Fluxo:**

    * InputStream e OutputStream: Classes base para fluxos de entrada e saída de bytes, respectivamente. 
    * Reader e Writer: Classes base para fluxos de entrada e saída de caracteres. 
    * FileInputStream, FileOutputStream, FileReader, FileWriter: Classes para ler e escrever dados de e para arquivos. 

* **Classes para Manipulação de Arquivos e Diretórios**:
File: Representa um arquivo ou diretório no sistema de arquivos, permitindo operações como criação, exclusão, renomeação, etc. 


* **Tratamento de Exceções**:
Operações de E/S podem lançar IOException, que deve ser tratada para evitar erros no programa. 

```java
// Leitura de um arquivo
import java.io.*;

public class LeituraArquivo {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("arquivo.txt");
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

```java
// Escrita de um arquivo
import java.io.*;

public class EscritaArquivo {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("saida.txt");
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bw = new BufferedWriter(osw)) {
            bw.write("Olá, mundo!");
            bw.newLine();
            bw.write("Este é um exemplo de escrita em arquivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

O pacote java.io é considerado o sistema de E/S original do Java. 
Para operações mais avançadas de E/S, como acesso não bloqueante, o Java NIO (New I/O) pode ser mais adequado. 
É fundamental tratar as exceções IOException ao trabalhar com operações de E/S para garantir a robustez do seu código. 

### java.nio

O pacote **java.nio** em Java, também conhecido como New Input/Output, introduz um conjunto de APIs para operações de entrada e saída (E/S) não bloqueantes e otimizadas. Ele complementa as classes de E/S tradicionais do pacote java.io, oferecendo alternativas para lidar com grandes volumes de dados e melhorar o desempenho em aplicações que exigem alta taxa de transferência de E/S. 

Alguns de seus principais conceitos são:

* **Buffers**:
São áreas de memória que armazenam dados para operações de E/S. Diferentemente dos fluxos de java.io, que operam em sequência, os buffers permitem acesso aleatório aos dados, otimizando operações como leitura e gravação. 

* **Seletor (Selector)**:
Permite que uma única thread monitore múltiplos canais simultaneamente. Isso é crucial para implementar E/S não bloqueante, onde a thread pode realizar outras tarefas enquanto espera que os canais fiquem prontos para leitura ou escrita.  

* **Charsets**:
Permitem a conversão entre caracteres e bytes, facilitando a manipulação de dados em diferentes conjuntos de caracteres. 


* **NIO.2** (Java SE 7):
Introduz uma nova API de sistema de arquivos, com foco em operações mais avançadas, como arquivos mapeados em memória e E/S assíncrona. 

```java
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

public class LerArquivoNIO {
    public static void main(String[] args) {
        Path path = Paths.get("exemplo.txt");
        try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ)) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int bytesRead = fileChannel.read(buffer);
            while (bytesRead != -1) {
                buffer.flip(); // Prepara o buffer para leitura
                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());
                }
                buffer.clear(); // Prepara o buffer para escrita
                bytesRead = fileChannel.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

Quando usar java.nio:
* Aplicações com alta taxa de transferência de E/S:
* Quando a aplicação precisa lidar com um grande volume de dados, como servidores web, bancos de dados ou aplicações de rede, o java.nio pode oferecer melhor desempenho. 
* Implementação de protocolos de rede complexos:
* Canais e seletor são úteis para implementar protocolos que exigem múltiplas conexões e operações simultâneas. 
* Aplicações que exigem E/S não bloqueante:
* Quando a aplicação precisa continuar executando outras tarefas enquanto aguarda que as operações de E/S sejam concluídas. 