package problem6;

public class Square extends Forme {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getSurface() {
        return Math.round(side * side * 100.0) / 100.0; // rounded to 2 decimal places
    }

    @Override
    public String toString() {
        return String.format("Square (side %.1f cm)", side);
    }
}

