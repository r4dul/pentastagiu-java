package SecondExercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(new SmartRefrigerators());
        list.add(new Car());
        list.add(new Phone());
        list.add(new Student());
        for (Object o : list) {
            if (o instanceof Car) {
                ((Car) o).connectToBluetooth();
            }
            if (o instanceof SmartRefrigerators) {
                ((SmartRefrigerators) o).connectToBluetooth();
            }
            if (o instanceof Phone) {
                ((Phone) o).connectToBluetooth();
            }
            if (o instanceof Student)
                System.out.println("Student has no bluetooth");
            }
        }
    }
