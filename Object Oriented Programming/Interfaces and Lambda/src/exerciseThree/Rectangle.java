package exerciseThree;

public record Rectangle(double height, double width) implements GeometricAreas {

    @Override
    public double getArea() {
        return height * width;
    }
}
