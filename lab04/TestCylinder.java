package lab04;

public class TestCylinder {
    public static void main(String[] args)  {

        Cylinder cylinder = new Cylinder(4.0, "Blue", 3.0);
        System.out.println("Cylinder = " + cylinder.toString());
        System.out.println("" + cylinder.getArea());
        System.out.println("" + cylinder.getVolume());

        Circle circle = new Circle(4.0, "Red");
        System.out.println("Circle = " + circle.toString());
        System.out.println("" + circle.getArea());
    }
}
