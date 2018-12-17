package AreaAndPerimeter;

public class Rectangle extends Shape implements AreaAndPerimeterInterface{

    public Rectangle(double a, double b) {
        perimeter = 2*a + 2*b;
        area = a * b;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
