package exercise_3;

public class Circle implements Shape {
    private final Double radius;
    private final Double pi = Math.PI;

    public Circle() {
        this((double) 1);
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        return pi * Math.pow(radius, 2);
    }

    @Override
    public Double perimeter() {
        return 2 * pi * radius;
    }

    @Override
    public String name() {
        return "Circle";
    }
}
