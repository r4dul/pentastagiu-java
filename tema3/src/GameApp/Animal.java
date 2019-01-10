package GameApp;

public class Animal extends Character implements Player{
    Animal(String name, int energy, int health, int possitionX, int possitionY){
        super(name,energy,health,possitionX,possitionY);
    }
    public int attack(int a) {
        System.out.println("An animal can't attack!");
        return 0;
    }
}
