package lessons.lesson03.basicClasses;

public class Rectangle {
    private final int length;
    private final int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void calculateSquare() {
        int square = width * length;
        System.out.println("Square of rectangle is: " + square);
    }

    public void calculatePerimeter() {
        double perimeter = (width + length) / 2.0;
        System.out.println("Perimeter of rectangle is: " + perimeter);
    }


}
