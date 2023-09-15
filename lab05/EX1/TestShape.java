package lab05part2.EX1;

public class TestShape {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle( 5.0, 3.0);

        Triangle triangle = new Triangle( 4.0, 6.0);

        System.out.println(rectangle.toString());
        System.out.println("Area of Rectangle: " + rectangle.getArea());

        System.out.println(triangle.toString());
        System.out.println("Area of Triangle: " + triangle.getArea());
    }
}
