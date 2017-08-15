package exercise_3;

public class Rectangle implements Shape {
    private final Double length, width;

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public Double area() {
        return length * width;
    }

    @Override
    public Double perimeter() {
        return 2 * (width + length);
    }

    @Override
    public String name() {
        return "Rectangle";
    }
}
