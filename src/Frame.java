public enum Frame {
    STEEL(2), ALUMINUM(1);

    private int value;

    Frame(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
