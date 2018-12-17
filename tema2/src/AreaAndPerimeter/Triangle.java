package AreaAndPerimeter;

public class Triangle extends Shape implements AreaAndPerimeterInterface{

    public Triangle(double a, double b, double c) {
        perimeter = a + b + c;
        area = Math.sqrt(perimeter*(perimeter - a)*(perimeter - b)*(perimeter - c));
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

}
