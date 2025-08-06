package exerciseThree;

public record Circle(double radius) implements GeometricAreas {
    private static final double PI = 3.14;

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

}
