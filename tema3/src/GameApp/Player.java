package GameApp;

public interface Player {
    String getName();
    void setName(String name);
    int getEnergy();
    void setEnergy(int energy);
    int getHealth();
    void setHealth(int health);
    int getPossitionX();
    void setPossitionX(int possitionX);
    int getPossitionY();
    void setPossitionY(int possitionY);
    int attack(int enemyHealth);

}
