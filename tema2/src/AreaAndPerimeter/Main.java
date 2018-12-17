package AreaAndPerimeter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        Shape rectangle = new Rectangle(4, 8);
        shapes.add(rectangle);
        Shape cicle = new Circle(2);
        shapes.add(cicle);
        Shape triangle = new Triangle(6, 10, 18);
        shapes.add(triangle);
        Shape square = new Square(4);
        shapes.add(square);

        //((Triangle) triangle).printInfo();
        //System.out.println(shapes.get(2).perimeter);
        BiggestArea biggestArea = new BiggestArea(shapes);
    }
}
