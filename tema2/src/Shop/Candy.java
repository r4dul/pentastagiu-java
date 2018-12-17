package Shop;

public class Candy extends Product {
    private int quantity = 0;

    public Candy (String name, int id, float price) {
        super(id, name, price);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
