import java.util.Scanner;

public class Main {

    private static final String WELCOME_MESSAGE = "Olá, informe seu nome";
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        String nome = scanner.next();
        System.out.println("Informe sua idade");
        int idade = scanner.nextInt();
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");
        scanner.close();
    }
}