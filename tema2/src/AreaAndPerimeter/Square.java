package AreaAndPerimeter;

public class Square extends Shape implements AreaAndPerimeterInterface{
    public Square(double side) {
        area = side * side;
        perimeter = 4 * side;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
