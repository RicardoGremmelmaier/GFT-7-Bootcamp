package br.com.map;

import java.util.List;

import static br.com.map.GameStatus.COMPLETED;
import static br.com.map.GameStatus.IN_PROGRESS;
import static br.com.map.GameStatus.NOT_STARTED;

public class Board {

    private final List<List<Block>> blocks;

    public Board(List<List<Block>> blocks) {
        this.blocks = blocks;
    }

    public List<List<Block>> getBlocks() {
        return blocks;
    }

    public GameStatus getStatus() {
        long fixedBlocks = blocks.stream()
                .flatMap(List::stream)
                .filter(Block::isFixed)
                .count();
        long filledBlocks = blocks.stream()
                .flatMap(List::stream)
                .filter(block -> block.getValue() != null && !block.isFixed())
                .count();

        if (filledBlocks == 0) {
            return NOT_STARTED;
        } else if (filledBlocks < 81 - fixedBlocks) {
            return IN_PROGRESS;
        } else {
            boolean allCorrect = blocks.stream()
                    .flatMap(List::stream)
                    .allMatch(block -> block.getValue() != null && block.getValue().equals(block.getExpected()));
            return allCorrect ? COMPLETED : IN_PROGRESS;
        }
    }

    public boolean changeValue(final int row, final int col, final int newValue){
        Block block = blocks.get(col).get(row);
        if (!block.isFixed()) {
            block.setValue(newValue);
            return true;
        }
        return false;
    }

    public boolean clearValue(final int row, final int col){
        Block block = blocks.get(col).get(row);
        if (!block.isFixed()) {
            block.clearBlock();
            return true;
        }
        return false;
    }

    public void reset(){
        blocks.forEach(row -> row.forEach(Block::clearBlock));
    }

    public String isFinished(){
        return getStatus() == COMPLETED ? "Parabéns! Você concluiu o Sudoku!" : "O Sudoku ainda não foi concluído.";
    }

}
