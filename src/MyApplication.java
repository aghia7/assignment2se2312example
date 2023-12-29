import interfaces.Shape;
import models.Circle;
import models.Rectangle;
import models.Triangle;

import java.util.Arrays;

public class MyApplication {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(4, 9);
        Triangle triangle = new Triangle(3, 4, 5);

        printShapes(Arrays.asList(circle, rectangle, triangle));
    }

    public static void printShapes(Iterable<Shape> shapes) {
        for (Shape shape : shapes) {
            printShape(shape);
            System.out.println("++++++++++++++++");
        }
    }

    public static void printShape(Shape shape) {
        System.out.println(shape);
        System.out.println("perimeter: " + shape.perimeter());
        System.out.println("area: " + shape.area());
    }
}
