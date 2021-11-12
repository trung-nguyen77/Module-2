package bai6.Shape.Square;

public class SquareTest  {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, 8.5, 4);
        System.out.println(square);
    }
}
