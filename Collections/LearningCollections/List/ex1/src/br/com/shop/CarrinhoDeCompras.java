package br.com.shop;

import br.com.shop.Item;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoList;

    public CarrinhoDeCompras() {
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preço, int quantidade) {
        carrinhoList.add(new Item(nome, preço, quantidade));
    }

    public void removerItem(String nome) {
        for (Item item : carrinhoList) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                carrinhoList.remove(item);
            }
        }
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Item item : carrinhoList) {
            total += item.getPreço() * item.getQuantidade();
        }
        return total;
    }

    public void exibirItens() {
        for(Item item : carrinhoList){
            System.out.println("Nome: " + item.getNome() + ", Preço: " + item.getPreço() + ", Quantidade: " + item.getQuantidade());
        }
    }

}
