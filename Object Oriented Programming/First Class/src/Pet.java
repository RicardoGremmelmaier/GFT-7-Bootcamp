public class Pet {
    private boolean isClean;

    public Pet() {
        this.isClean = false;
    }

    public boolean isClean() {
        return isClean;
    }

    public void clean() {
        isClean = true;
    }

}
