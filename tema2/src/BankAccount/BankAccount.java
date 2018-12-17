package BankAccount;

public class BankAccount {
    private String name;
    private double balance;

    public BankAccount() {
        this.balance = 0;
        this.name = "Default Name";
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Your new account name is: " + name);
    }

    public void addFunds(float amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Your new balance: " + this.balance);
        } else {
            System.out.println("The funds: " + amount + " that you are trying to add don't represent a valid amount.");
        }
    }

    public void withdrawFunds(float amount) {
        if (this.balance - amount < 0) {
            System.out.println("The amount that you are trying to withdraw: " + amount + " is not available. Your available funds: " + this.balance);
        } else {
            this.balance -= amount;
            System.out.println("You made a withdraw of " + amount + " and your remaining balance is: " + this.balance);
        }
    }
}
