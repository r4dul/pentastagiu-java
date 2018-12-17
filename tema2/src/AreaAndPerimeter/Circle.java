package AreaAndPerimeter;

public class Circle extends Shape implements AreaAndPerimeterInterface{

    public Circle(double radius) {
        area = Math.PI * radius * radius;
        perimeter = Math.PI * radius * 2;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
