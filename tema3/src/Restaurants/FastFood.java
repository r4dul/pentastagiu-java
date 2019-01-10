package Restaurants;

public class FastFood extends Restaurant {

    FastFood(){
        setMenuPrice(30);
    }
    @Override
    double totalTaxes() {
        return getIncome() * 20 / 100;
    }

    public void displayInfo() {
        System.out.println("The income for the FastFood restaurant is: " + getIncome() + " and the taxes are: " + totalTaxes());
    }
}
