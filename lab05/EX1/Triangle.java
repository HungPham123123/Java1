package lab05part2.EX1;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implementing the abstract method getArea for Triangle
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "Triangle[color=" + super.toString() + ", base=" + base + ", height=" + height + "]";
    }
}

