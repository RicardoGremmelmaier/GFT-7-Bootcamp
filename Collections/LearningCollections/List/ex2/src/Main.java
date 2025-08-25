import br.com.numbers.SomaNumeros;

public class Main {
    public static void main(String[] args) throws Exception {
        SomaNumeros soma = new SomaNumeros();
        soma.adicionarNumero(5);
        soma.adicionarNumero(10);
        soma.adicionarNumero(15);

        System.out.println("Soma: " + soma.calcularSoma());
        System.out.println("Maior: " + soma.encontraMaiorNumero());
        System.out.println("Menor: " + soma.encontraMenorNumero());
        System.out.println("Números: " + soma.exibirNumeros());
    }
}
