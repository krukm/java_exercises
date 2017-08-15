package exercise_3;

import java.util.ArrayList;

public class ShapeTest {
    public static void main(String[] args) {
        Double width = 3.0;
        Double length = 4.0;
        Double radius = 5.0;
        Double a = width;
        Double b = length;
        Double c = radius;

        Shape rectangle = new Rectangle(width, length);
        Shape circle = new Circle(radius);
        Shape triangle = new Triangle(a, b, c);

        ArrayList<Shape> shapeArrayList = new ArrayList<>();
        shapeArrayList.add(rectangle);
        shapeArrayList.add(circle);
        shapeArrayList.add(triangle);

        for (Shape shape : shapeArrayList) {
            System.out.println("The area of our  " + shape.name() + " is: " + shape.area());
            System.out.println("The perimeter of our  " + shape.name() + " is: " + shape.perimeter());
            System.out.println();
        }
    }
}
