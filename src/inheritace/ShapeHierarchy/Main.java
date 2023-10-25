package inheritace.ShapeHierarchy;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(2);
        Rectangle rectangle=new Rectangle(2,3);
        Triangle triangle=new Triangle(2,3,4);
        displayShapeProperties(circle);
        displayShapeProperties(rectangle);
        displayShapeProperties(triangle);
    }

    public static void displayShapeProperties(Shape shape) {
        System.out.println("Shape: " + shape.getClass().getSimpleName());
        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println();
    }


}
