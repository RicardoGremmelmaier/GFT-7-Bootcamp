package exerciseThree;

public record Square(double sideLength) implements GeometricAreas {

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

}
