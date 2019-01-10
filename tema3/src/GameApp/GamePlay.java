package GameApp;

import java.text.ParseException;
import java.util.Scanner;

public class GamePlay {
    private ArtifactEnergy artifactEnergy;
    private ArtifactHealth artifactHealth;
    private Player player1;
    private Player player2;
    private Player player3;
    private Map map;

    GamePlay(Player player1, Player player2, Player player3, Map map, ArtifactEnergy artifactEnergy, ArtifactHealth artifactHealth){
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
        this.artifactEnergy = artifactEnergy;
        this.artifactHealth = artifactHealth;
        this.map = map;
    }

    int input = 0;
    String player;
    Player currentPlayer;
    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select your character. Press 1 to pick the human or 2 for the monster");

        try{
            input = scanner.nextInt();
        } catch(NumberFormatException e) {
            e.printStackTrace();
        }
        if (input == 1) {
            this.currentPlayer = player1;
            System.out.println("You picked the Human player");
            player = "H";
        } else if (input == 2) {
            this.currentPlayer = player2;
            System.out.println("You picked the Monster player");
            player = "M";
        } else {
            System.out.println("Enter 1 or 2");
        }

        String in;
        int col;
        int row;
        while(true){
            col = 0;
            row = 0;
            System.out.println("Name: " + currentPlayer.getName() + " LifePoints: " + currentPlayer.getHealth() + " Energy Points: " +
                    currentPlayer.getEnergy());
            System.out.println("Press 'W' to move up on the map, 'S' to move down 'D' to move right or 'A' to move left");
            map.printMap();

            in = scanner.next();
            if(in.equalsIgnoreCase("w")) {
                row = -1;
            } else if (in.equalsIgnoreCase("s")){
                row = 1;
            } else if (in.equalsIgnoreCase("d")){
                col = 1;
            } else if (in.equalsIgnoreCase("a")){
                col = -1;
            } else {
                System.out.println("Press W A S or D");
            }

            if (currentPlayer.getPossitionX() + row > 8 || currentPlayer.getPossitionY() + col > 8) {
                System.out.println("You'll leave the map if you go that way. Choose another direction");
                continue;
            } else {
                if ((map.returnMapOccupant(currentPlayer.getPossitionX() + row, currentPlayer.getPossitionY() + col).equalsIgnoreCase("."))){
                    map.updateMap(currentPlayer.getPossitionX() + row, currentPlayer.getPossitionY() + col, player);
                    map.updateMap(currentPlayer.getPossitionX(), currentPlayer.getPossitionY(), ".");
                    currentPlayer.setPossitionX(currentPlayer.getPossitionX() + row);
                    currentPlayer.setPossitionY(currentPlayer.getPossitionY() + col);
                }
                if (map.returnMapOccupant(currentPlayer.getPossitionX() + row, currentPlayer.getPossitionY() + col).equals("A")){
                    System.out.println("You encountered an animal and you must fight!");
                    currentPlayer.attack(player3.getHealth());
                    if (currentPlayer.getHealth() > 0) {
                        System.out.println("You defeat the beast!");
                        map.updateMap(currentPlayer.getPossitionX() + row, currentPlayer.getPossitionY() + col, player);
                        map.updateMap(currentPlayer.getPossitionX(), currentPlayer.getPossitionY(), ".");
                        currentPlayer.setPossitionX(currentPlayer.getPossitionX() + row);
                        currentPlayer.setPossitionY(currentPlayer.getPossitionY() + col);
                    } else {
                        System.out.println("You died!");
                        break;
                    }
                }
                if (map.returnMapOccupant(currentPlayer.getPossitionX() + row, currentPlayer.getPossitionY() + col).equals("M")){
                    System.out.println("You encountered a monster and you must fight!");
                    System.out.println(player3);
                    this.currentPlayer.attack(this.player3.getHealth());
                    if (currentPlayer.getHealth() > 0) {
                        System.out.println("You defeat the monster!");
                        map.updateMap(currentPlayer.getPossitionX() + row, currentPlayer.getPossitionY() + col, player);
                        map.updateMap(currentPlayer.getPossitionX(), currentPlayer.getPossitionY(), ".");
                        currentPlayer.setPossitionX(currentPlayer.getPossitionX() + row);
                        currentPlayer.setPossitionY(currentPlayer.getPossitionY() + col);
                    } else {
                        System.out.println("You died!");
                        break;
                    }
                }
                if (map.returnMapOccupant(currentPlayer.getPossitionX() + row, currentPlayer.getPossitionY() + col).equals("H")){
                    System.out.println("You encountered a human and you must fight!");
                    currentPlayer.attack(player3.getHealth());
                    if (currentPlayer.getHealth() > 0) {
                        System.out.println("You defeat the human!");
                        map.updateMap(currentPlayer.getPossitionX() + row, currentPlayer.getPossitionY() + col, player);
                        map.updateMap(currentPlayer.getPossitionX(), currentPlayer.getPossitionY(), ".");
                        currentPlayer.setPossitionX(currentPlayer.getPossitionX() + row);
                        currentPlayer.setPossitionY(currentPlayer.getPossitionY() + col);
                    } else {
                        System.out.println("You died!");
                        break;
                    }
                }

                if (map.returnMapOccupant(currentPlayer.getPossitionX() + row, currentPlayer.getPossitionY() + col).equals("h")) {
                    System.out.println("You found a health artifact and your life will increase");
                    currentPlayer.setHealth(currentPlayer.getHealth() + artifactHealth.getPoints());
                    map.updateMap(currentPlayer.getPossitionX() + row, currentPlayer.getPossitionY() + col, player);
                    map.updateMap(currentPlayer.getPossitionX(), currentPlayer.getPossitionY(), ".");
                    currentPlayer.setPossitionX(currentPlayer.getPossitionX() + row);
                    currentPlayer.setPossitionY(currentPlayer.getPossitionY() + col);
                }
                if (map.returnMapOccupant(currentPlayer.getPossitionX() + row, currentPlayer.getPossitionY() + col).equals("e")) {
                    System.out.println("You found an energy artifact and your energy points will increase");
                    currentPlayer.setHealth(currentPlayer.getHealth() + artifactHealth.getPoints());
                    map.updateMap(currentPlayer.getPossitionX() + row, currentPlayer.getPossitionY() + col, player);
                    map.updateMap(currentPlayer.getPossitionX(), currentPlayer.getPossitionY(), ".");
                    currentPlayer.setPossitionX(currentPlayer.getPossitionX() + row);
                    currentPlayer.setPossitionY(currentPlayer.getPossitionY() + col);
                }

            }

        }
    }
}
