package GameApp;

public class Monster extends Character implements Player{

    Monster(){}
    Monster(String name, int energy, int health, int possitionX, int possitionY, Artifact artifact) {
        super(name,energy,health,possitionX,possitionY);
        switch (artifact){
            case ENERGY:
                setEnergy(getEnergy() + artifact.getPoints());
                break;
            case HEALTH:
                setHealth(getHealth() + artifact.getPoints());
                break;
            default: return;
        }
    }
    public int attack(int enemyHealth) {
        while(getEnergy() >= 3) {
            setEnergy(getEnergy() - 3);
            enemyHealth -= 15;
            if (enemyHealth <= 0) {
                return 1;
            }
        }
        return 0;
    }
    public String toString(){
        return "Human name: " + getName() + " Health: " + getHealth() + " Energy: " + getEnergy();
    }
}
