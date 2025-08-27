package br.com.map;

public enum GameStatus {
    NOT_STARTED("Nao iniciado"),
    IN_PROGRESS("Em progresso"),
    COMPLETED("Concluido");

    private String label;

    GameStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
