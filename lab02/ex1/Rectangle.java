package lab02.ex1;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
        width = 0;
        height = 0;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void display() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public int getArea() {
        return width * height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(7, 3);

        System.out.println("Rectangle Display:");
        myRectangle.display();

        myRectangle.setHeight(4);
        myRectangle.setWidth(5);

        System.out.println("Area: " + myRectangle.getArea());
        System.out.println("Perimeter: " + myRectangle.getPerimeter());
    }
}

