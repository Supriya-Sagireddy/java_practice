package Abstraction.GeometricShapes;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4, 5);

        displayShapeInfo(circle);
        displayShapeInfo(rectangle);
        displayShapeInfo(triangle);
    }

    public static void displayShapeInfo(Shape shape) {
        System.out.println("Shape Area: " + shape.calculateArea());
        System.out.println("Shape Perimeter: " + shape.calculatePerimeter());
        System.out.println();
    }
}

