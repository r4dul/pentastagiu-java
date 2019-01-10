package GameApp;

public class Character {
    private String name;
    private int energy;
    private int health;
    private int possitionX;
    private int possitionY;

    Character(){}

    Character(String name, int energy, int health, int possitionX, int possitionY){
        this.name = name;
        this.energy = energy;
        this.health = health;
        this.possitionX = possitionX;
        this.possitionY = possitionY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPossitionX() {
        return possitionX;
    }

    public void setPossitionX(int possitionX) {
        this.possitionX = possitionX;
    }

    public int getPossitionY() {
        return possitionY;
    }

    public void setPossitionY(int possitionY) {
        this.possitionY = possitionY;
    }
}
