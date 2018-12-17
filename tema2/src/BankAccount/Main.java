package BankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("John Doe", 350.50);

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        String input = "";
        float amount;
        String str = "withdraw exit add change name check";

        System.out.println("Hello " + bankAccount.getName() + "! What should we do next?");
        System.out.println("Type 'withdraw' , 'add' , 'check', 'change name' or 'exit'");
        while (true) {
            input = scanner.nextLine();
             if (input.equalsIgnoreCase("exit")){
                 break;
            }

            if (input.equalsIgnoreCase("check")) {
                System.out.println("Your balance is: " + bankAccount.getBalance());
            }

            if (input.equalsIgnoreCase("withdraw")) {
                System.out.println("Please enter the amount that you want to withdraw: ");
                try {
                    amount = scanner.nextFloat();
                    bankAccount.withdrawFunds(amount);
                }
                    catch (Exception e) {
                    System.out.println("The input is not valid" + e.getMessage());
                }
            }

            if (input.equalsIgnoreCase("add")) {
                System.out.println("Please enter the amount that you want to add: ");
                try {
                    amount = scanner.nextFloat();
                    bankAccount.addFunds(amount);
                }
                catch (Exception e) {
                    System.out.println("The input is not valid" + e.getMessage());
                }
            }

            if (input.equalsIgnoreCase("change name")) {
                System.out.println("Please enter a new name: ");
                input = scanner.nextLine();
                bankAccount.setName(input);
            }

/*            if (!str.contains(input)) {
                System.out.println("Your input is invalid. Please enter: 'withdraw' , 'add' , 'check', 'change name' or 'exit'");
            }*/
        }

    }
}
