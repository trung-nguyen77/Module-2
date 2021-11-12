package bai6.Shape.Rectangle;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("orange", true, 2.5, 3.8 );
        System.out.println(rectangle);

        System.out.println(rectangle.getArea());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        rectangle.setLength(length);
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        rectangle.setWidth(width);
        System.out.println("now length =" + length
                + " width =" + width
                + " Area = " + rectangle.getArea()
                + " Perimeter = " + rectangle.getPerimeter());
    }
}
