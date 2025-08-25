import br.com.shop.*;

public class Main {

    public static void main(String[] args) throws Exception {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Produto 1", 10.0, 2);
        carrinho.adicionarItem("Produto 2", 20.0, 1);
        carrinho.adicionarItem("Produto 3", 15.0, 3);

        System.out.println("Itens no carrinho:");
        carrinho.exibirItens();

        double total = carrinho.calcularTotal();
        System.out.println("Total: " + total);

        carrinho.removerItem("Produto 2");
        System.out.println("Itens no carrinho após remoção:");
        carrinho.exibirItens();
    }
}
