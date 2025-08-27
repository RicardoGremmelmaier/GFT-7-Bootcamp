package br.com.map;

public class Block {
    private final boolean isFixed;
    private final int expected;
    private Integer value;

    public Block(boolean isFixed, int expected) {
        this.isFixed = isFixed;
        this.expected = expected;
        if (isFixed) {
            this.value = expected;
        }
    }

    public boolean isFixed() {
        return isFixed;
    }

    public int getExpected() {
        return expected;
    }

    public void clearBlock(){
        setValue(null);
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        if (!isFixed) {
            this.value = value;
        }
    }
}
