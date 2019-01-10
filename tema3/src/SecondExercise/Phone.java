package SecondExercise;

public class Phone implements Connectable{
    private double price;
    private String model;

    Phone(){
        this.price = 150;
        this.model = "Old Model";
    }
    Phone(double price, String model) {
        this.price = price;
        this.model = model;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Phone: Connect to bluetooth in progress...");
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }
}
