package problem6;

public class Circle extends Forme {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return Math.round(Math.PI * radius * radius * 100.0) / 100.0; // rounded to 2 decimal places
    }

    @Override
    public String toString() {
        return String.format("Circle (radius %.1f cm)", radius);
    }
}
