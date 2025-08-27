import br.com.livraria.*;

public class App {
    public static void main(String[] args) throws Exception {
        LivrariaOnline livraria = new LivrariaOnline();

        livraria.adicionarLivro("link1", "Livro A", "Autor A", 29.90);
        livraria.adicionarLivro("link2", "Livro B", "Autor B", 39.90);
        livraria.adicionarLivro("link3", "Livro C", "Autor A", 19.90);

        System.out.println("Livros da Autor A:");
        livraria.exibirLivrosPorAutor("Autor A");

        System.out.println("Livro mais caro:");
        Livro maisCaro = livraria.obterLivroMaisCaro();
        if (maisCaro != null) {
            System.out.println(maisCaro.getTitulo() + " - " + maisCaro.getAutor() + " - " + maisCaro.getPreco());
        }

        System.out.println("Livro mais barato:");
        Livro maisBarato = livraria.obterLivroMaisBarato();
        if (maisBarato != null) {
            System.out.println(maisBarato.getTitulo() + " - " + maisBarato.getAutor() + " - " + maisBarato.getPreco());
        }

        System.out.println("Livros ordenados por preço:");
        livraria.exibirLivrosOrdenadosPorPreco();
    }
}
