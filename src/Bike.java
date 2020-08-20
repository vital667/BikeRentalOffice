public class Bike {
    private Color color;
    private int tire;
    private Frame frame;

    public Bike(Color color, int tire, Frame frame) {
        this.color = color;
        this.tire = tire;
        this.frame = frame;
    }

    @Override
    public String toString() {
        return "(" + color + ", " + tire + ", " + frame + ")";
    }
}
