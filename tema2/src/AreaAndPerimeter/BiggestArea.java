package AreaAndPerimeter;

import java.util.List;

public class BiggestArea {
    public BiggestArea(List<Shape> shapes) {
        int i = 0;
        int index = 0;
        double area = 0;

        for(Shape shape: shapes) {
            if (i == 0) {
                area = shape.area;
            } else {
                if (area < shape.area) {
                    index = i;
                    area = shape.area;
                }
            }
            //arrayArea[i] = shape.area;
            //System.out.println(arrayArea[i]);
            i++;
        }

        System.out.println("Perimeter = " + shapes.get(index).perimeter + " Area = " + shapes.get(index).area + " Object type = " + shapes.get(index).getClass());
    }
}
