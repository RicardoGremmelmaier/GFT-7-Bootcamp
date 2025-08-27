import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.Objects.nonNull;
import static java.util.Objects.isNull;

import br.com.map.*;

import static br.com.map.BoardTemplate.BOARD_TEMPLATE;

public class Sudoku {

    private static Board board;
    private final static Scanner scanner = new Scanner(System.in);
    private final static int SIZE = 9;

    public static void main(String[] args) throws Exception {
        final var positions = Stream.of(args)
                                .collect(Collectors.toMap
                                                    (k -> k.split(";")[0], 
                                                     v -> v.split(";")[1]));

        var option = -1;
        while (true){
            System.out.println("Selecione uma das opções a seguir");
            System.out.println("1 - Iniciar um novo Jogo");
            System.out.println("2 - Colocar um novo número");
            System.out.println("3 - Remover um número");
            System.out.println("4 - Visualizar jogo atual");
            System.out.println("5 - Verificar status do jogo");
            System.out.println("6 - Limpar jogo");
            System.out.println("7 - Finalizar jogo");
            System.out.println("8 - Sair");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Iniciando um novo jogo...");
                    startGame(positions);
                    break;

                case 2:
                    System.out.println("Colocando um novo número...");
                    inputNumber();
                    break;

                case 3:
                    System.out.println("Removendo um número...");
                    removeNumber();
                    break;

                case 4:
                    System.out.println("Visualizando jogo atual...");
                    showCurrentGame();
                    break;

                case 5:
                    System.out.println("Verificando status do jogo...");
                    showCurrentStatus();
                    break;

                case 6:
                    System.out.println("Limpando jogo...");
                    clearGame();
                    break;

                case 7:
                    System.out.println("Finalizando jogo...");
                    System.out.println(board.isFinished());
                    break;

                case 8:
                    System.out.println("Saindo...");
                    return;

                default:
                    break;
            }
        }
    }

    private static void startGame(final Map<String, String> positions) {
        if (nonNull(board)){
            System.out.println("O jogo já foi iniciado");
            return;
        }

        List<List<Block>> blocks = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            blocks.add(new ArrayList<>());
            for (int j = 0; j < SIZE; j++) {
                var positionConfig = positions.get("%s,%s".formatted(i, j));
                var expected = Integer.parseInt(positionConfig.split(",")[0]);
                var fixed = Boolean.parseBoolean(positionConfig.split(",")[1]);
                var currentBlock = new Block(fixed, expected);
                blocks.get(i).add(currentBlock);
            }
        }

        board = new Board(blocks);
        System.out.println("O jogo está pronto para começar");
    }

    private static void inputNumber() {
        if (isNull(board)){
            System.out.println("O jogo ainda não foi iniciado iniciado");
            return;
        }

        System.out.println("Informe a linha que em que o número será inserido");
        var row = runUntilGetValidNumber(0, 8);
        System.out.println("Informe a coluna que em que o número será inserido");
        var col = runUntilGetValidNumber(0, 8);
        System.out.printf("Informe o número que vai entrar na posição [%s,%s]\n", row, col);
        var value = runUntilGetValidNumber(1, 9);
        if (!board.changeValue(row, col, value)){
            System.out.printf("A posição [%s,%s] tem um valor fixo\n", row, col);
        }
    }

    private static void removeNumber() {
        if (isNull(board)){
            System.out.println("O jogo ainda não foi iniciado iniciado");
            return;
        }

        System.out.println("Informe a linha que em que o número será removido");
        var row = runUntilGetValidNumber(0, 8);
        System.out.println("Informe a coluna que em que o número será removido");
        var col = runUntilGetValidNumber(0, 8);
        if (!board.clearValue(row, col)){
            System.out.printf("A posição [%s,%s] não pode ser removida\n", row, col);
        }
    }

    private static void showCurrentGame() {
        if (isNull(board)){
            System.out.println("O jogo ainda não foi iniciado iniciado");
            return;
        }

        var args = new Object[81];
        var argPos = 0;
        for (int i = 0; i < SIZE; i++) {
            for (var col: board.getBlocks()){
                args[argPos ++] = " " + ((isNull(col.get(i).getValue())) ? " " : col.get(i).getValue());
            }
        }
        System.out.println("Seu jogo se encontra da seguinte forma");
        System.out.printf((BOARD_TEMPLATE) + "\n", args);
    }

    private static void showCurrentStatus() {
        if (isNull(board)){
            System.out.println("O jogo ainda não foi iniciado iniciado");
            return;
        }

        System.out.println("O status atual do jogo é: " + board.getStatus().getLabel());
    }

    private static void clearGame() {
        if (isNull(board)){
            System.out.println("O jogo ainda não foi iniciado iniciado");
            return;
        }

        board.reset();
        System.out.println("O jogo foi reiniciado");
    }


    private static int runUntilGetValidNumber(final int min, final int max){
        var current = scanner.nextInt();
        while (current < min || current > max){
            System.out.printf("Informe um número entre %s e %s\n", min, max);
            current = scanner.nextInt();
        }
        return current;
    }
}
