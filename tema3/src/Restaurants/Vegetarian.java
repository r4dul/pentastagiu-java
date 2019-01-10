package Restaurants;

public class Vegetarian extends Restaurant {

    Vegetarian(){
        setMenuPrice(50);
    }
    @Override
    double totalTaxes() {
        return getIncome() * 20 / 100 - getIncome() * 30 / 100 * 20 / 100;
    }

    public void displayInfo() {
        System.out.println("The income for the Vegetarian restaurant is: " + getIncome() + " and the taxes are: " + totalTaxes());
    }
}
