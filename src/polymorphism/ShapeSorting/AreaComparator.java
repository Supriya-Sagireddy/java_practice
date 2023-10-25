package polymorphism.ShapeSorting;

import java.util.Comparator;

class AreaComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape shape1, Shape shape2) {
        double area1 = shape1.calculateArea();
        double area2 = shape2.calculateArea();
        return Double.compare(area1, area2);
    }
}
