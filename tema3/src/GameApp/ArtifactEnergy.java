package GameApp;

public class ArtifactEnergy {
    private int points;
    private int possitionX;
    private int possitionY;

    ArtifactEnergy(){
        this.points = 20;
        setPossition();
    }

    ArtifactEnergy(int points) {
        this.points = points;
        setPossition();
    }

    public void setPossition(){
        this.possitionX = (int)(Math.random() * 9);
        this.possitionY = (int)(Math.random() * 9);
    }

    public int getPoints() {
        return points;
    }

    public int getPossitionX() {
        return possitionX;
    }

    public int getPossitionY() {
        return possitionY;
    }
}
