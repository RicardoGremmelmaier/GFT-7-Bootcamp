import java.util.Scanner;

enum TipoTelefone {
    FIXO, CELULAR, INVALIDO
}

class Telefone {
    private String numero;
    private TipoTelefone tipo;

    public Telefone(String numero, TipoTelefone tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public TipoTelefone getTipo() {
        return tipo;
    }
}

public class FormatadorTelefone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de telefone:");
        String entrada = sc.nextLine();

        Telefone tel = validarTelefone(entrada);
        if (tel.getTipo() == TipoTelefone.INVALIDO) {
            System.out.println("Número inválido!");
        } else {
            System.out.println("Número formatado: " + tel.getNumero());
            System.out.println("Tipo: " + tel.getTipo());
        }
        sc.close();
    }

    private static Telefone validarTelefone(String entrada) {
        String apenasNumeros = entrada.replaceAll("\\D", "");

        if (apenasNumeros.length() == 10) { // Fixo com DDD
            String formatado = String.format("(%s)%s-%s",
                    apenasNumeros.substring(0, 2),
                    apenasNumeros.substring(2, 6),
                    apenasNumeros.substring(6));
            return new Telefone(formatado, TipoTelefone.FIXO);

        } else if (apenasNumeros.length() == 8) { // Fixo sem DDD
            String formatado = String.format("%s-%s",
                    apenasNumeros.substring(0, 4),
                    apenasNumeros.substring(4));
            return new Telefone(formatado, TipoTelefone.FIXO);

        } else if (apenasNumeros.length() == 11) { // Celular com DDD
            String formatado = String.format("(%s)%s-%s",
                    apenasNumeros.substring(0, 2),
                    apenasNumeros.substring(2, 7),
                    apenasNumeros.substring(7));
            return new Telefone(formatado, TipoTelefone.CELULAR);

        } else if (apenasNumeros.length() == 9) { // Celular sem DDD
            String formatado = String.format("%s-%s",
                    apenasNumeros.substring(0, 5),
                    apenasNumeros.substring(5));
            return new Telefone(formatado, TipoTelefone.CELULAR);
        }

        return new Telefone(entrada, TipoTelefone.INVALIDO);
    }
}
