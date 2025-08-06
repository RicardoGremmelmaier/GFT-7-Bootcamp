package exerciseThree;

public class Main {

    public static void main(String[] args) {

        GeometricAreas circle = new Circle(5);
        GeometricAreas rectangle = new Rectangle(4, 6);
        GeometricAreas square = new Square(3);

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Square area: " + square.getArea());

    }
}
