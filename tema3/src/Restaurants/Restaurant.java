package Restaurants;

public abstract class Restaurant {
    private short guests = 0;
    private double income = 0;
    private double menuPrice = 0;

    public void addGuest(int guests) {
        this.guests += guests;
        this.income = this.income + guests * menuPrice;
    }

    abstract double totalTaxes();

    public short getGuests() {
        return guests;
    }

    public double getIncome() {
        return income;
    }

    public double getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(double menuPrice) {
        this.menuPrice = menuPrice;
    }

    public abstract void displayInfo();
}
