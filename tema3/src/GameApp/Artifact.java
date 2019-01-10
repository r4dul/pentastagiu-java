package GameApp;

import java.util.Random;

public enum Artifact {
    HEALTH(20),
    ENERGY(15);

    public int points;
    Artifact(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}
