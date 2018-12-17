package BoardMessage;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User testUser = new User("Marian", "marian@marian.com");
        User testUser1 = new User("Alina", "alina@alina.com");
        User testUser2 = new User("Marius", "marius@marius.com");

        Messages message = new Messages("This is Sparta!", testUser);
        message = new Messages("I'm away", testUser1);
        message = new Messages("Find another way!", testUser2);

        Scanner scanner = new Scanner(System.in);
        boolean created = true;
        User user = null;

        while(true) {
            String input = "";
            if (created) {
                String name;
                String email;
                System.out.println("Please enter your name: ");
                name = scanner.nextLine();
                System.out.println("Please enter your e-mail");
                email = scanner.nextLine();
                user = new User(name, email);
                created = false;
            }

            System.out.println("Hello " + user.getName());
            Board.showMessages();
            System.out.println("Send a message to the board: ");
            input = scanner.nextLine();
            if (!input.equalsIgnoreCase("")) {
                message = new Messages(input, user);
            }
        }
    }
}
