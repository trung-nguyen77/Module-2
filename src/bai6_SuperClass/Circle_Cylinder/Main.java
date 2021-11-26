package bai6_SuperClass.Circle_Cylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius = Double.parseDouble(scanner.nextLine());
        circle.setRadius(radius);
        System.out.println("Enter color:");
        String color = scanner.nextLine();
        circle.setColor(color);
        System.out.println("Circle:"
                + " radius = " + radius
                + ", Color = " + color
                + ", Area = " + circle.getArea()
                + ", Perimeter = " + circle.getPerimeter());
    }
}
