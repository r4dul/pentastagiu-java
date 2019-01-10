package SecondExercise;

public class Car implements Connectable{
    private double price;
    private String model;

    Car(){
        this.price = 150;
        this.model = "Old Model";
    }
    Car(double price, String model) {
        this.price = price;
        this.model = model;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Car: Connect to bluetooth in progress...");
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }
}
