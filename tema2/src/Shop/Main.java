package Shop;

import java.util.Scanner;

enum Membership {
    GOLD, SILVER, DEFAULT
}

public class Main {
    public static void main(String[] args) {
        int input = 0;
        Customer customer = new Customer(Membership.GOLD, 1, "John Doe");
        Customer customer1 = new Customer(Membership.SILVER, 2, "Dave");
        Customer customer2 = new Customer(Membership.DEFAULT, 3, "Kevin");

        // send another customer as an argument to the Basket constructor to check if discounted price works for all memberships
        Basket basket = new Basket(customer);

        Product product = new Book("Sven Hassel", "Martial Court" , 1, 150);
        Product product2 = new Candy("Sweet", 2, 20);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a product by entering a number(1 or 2): ");
        System.out.println("1 = Book author: " + ((Book) product).getAuthor() + ". Book name: " + product.getName() + " . Book price " + product.getPrice() + "$");
        System.out.println("2 = Candy name: " + product2.getName() + " Candy Price: " + product2.getPrice() + "$");
        while(true) {
            try {
                input = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Input invalid " + e.getMessage());
            }
            switch (input) {
                case 1:
                    basket.addProduct(product);
                    break;
                case 2:
                    basket.addProduct(product2);
                    break;
                    default:
                        System.out.println("The input does not match with one of the products. Input = " + input);
            }
            basket.listBasketProducts();
            System.out.println("Total price: " + basket.calculateTotal()+ "$");
            System.out.println("Discounted price: " + basket.getDiscountedPrice()+ "$");
        }
    }
}
