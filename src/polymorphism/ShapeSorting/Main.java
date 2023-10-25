package polymorphism.ShapeSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));
        shapes.add(new Triangle(3, 4));

        // Calculate areas and display them
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }

        // Sort shapes based on their areas
        Collections.sort(shapes, new AreaComparator());

        System.out.println("Shapes sorted by area:");
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }
    }
}

