package exercise_3;

public class Triangle implements Shape {
    private final Double a, b, c;

    public Triangle() {
        this(1.0, 1.0, 1.0);
    }

    public Triangle(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public Double area() {
        Double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public Double perimeter() {
        return a + b + c;
    }

    @Override
    public String name() {
        return "Triangle";
    }
}
