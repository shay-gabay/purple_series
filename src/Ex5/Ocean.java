package Ex5;

import java.util.Arrays;

public class Ocean {
    private Fish[] entities;
    private final int SIZE = 100;

    public Ocean() {
        Fish[] entities = OceanFactory.init(SIZE);
        this.entities = entities;
    }

    public Fish[] getEntities() {
        return entities;
    }

    public void setEntities(Fish[] entities) {
        this.entities = entities;
    }

    public int totalEntities() {
        return entities.length;
    }

    public int totalSharks() {
        int count = 0;
        for (Fish fish : entities) {
            if (fish instanceof Shark) {
                count++;
            }
        }
        return count;
    }

    public int totalWhale() {
        int count = 0;
        for (Fish fish : entities) {
            if (fish instanceof Whale) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Ocean{" +
                "entities=" + Arrays.toString(entities) +
                '}';
    }

    public void drawAlll() {
        for (Fish fish : entities) {
            fish.draw();
        }
    }

}



