package lab04;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public double getArea() {
        return (3.14 * getRadius() * getRadius() * 2 + 2 * 3.14 * height);

    }

    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ", height=" + height + "]";
    }
}
