package AdapterDesignPattern.maths.square;

/**
 * SquarePegs are not compatible with RoundHoles (they were implemented by
 * previous development team). But we have to integrate them into our program.
 */
public class SquarePeg {
    private final double width;

    public double getWidth() {
        return width;
    }

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getSquare() {
        return width * width;
    }
}
