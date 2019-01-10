package GameApp;

public class CharacterFactory {
    public Player getPlayer(String characterType) {
        if (characterType == null) {
            return null;
        }
        if(characterType.equalsIgnoreCase("Human")){
            return new Human("Radu", 10, 10, 4, 4, Artifact.ENERGY);
        }

        if (characterType.equalsIgnoreCase("Monster")){
            return new Monster("Goblin", 15, 15, 3, 5, Artifact.HEALTH);
        }

        if (characterType.equalsIgnoreCase("Animal")) {
            return new Animal("Wolf", 12, 12, 3, 1);
        }
        return null;
    }
}
