package bai6_SuperClass.Shape.Square;

import bai6_SuperClass.Shape.Rectangle.Rectangle;

public class Square extends Rectangle {
    public double side = 1.0;

    public Square(double side){
        this.side = side;
    }

    public Square(double width, double length, double side) {
        super(width, length);
        this.side = side;
    }

    public Square() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return  "A Square with side = " + side
                + ", which is a subclass of "
                + super.toString();
    }
}
