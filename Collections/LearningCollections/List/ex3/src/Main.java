import br.com.numbers.*;

public class Main {
    public static void main(String[] args) throws Exception {
        OrdenacaoNumeros ordenacao = new OrdenacaoNumeros();
        ordenacao.adicionarNumero(5);
        ordenacao.adicionarNumero(2);
        ordenacao.adicionarNumero(8);

        System.out.println("Números em ordem crescente: " + ordenacao.ordenarAscendente());
        System.out.println("Números em ordem decrescente: " + ordenacao.ordenarDescendente());
    }
}
