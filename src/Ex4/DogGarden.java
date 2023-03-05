package Ex4;

import java.util.Arrays;

public class DogGarden {
    private String name;
    private final int SIZE = 5;
    private DogWalker[] dogWalkers = new DogWalker[SIZE];

    public DogGarden() {
    }

    public DogGarden(String name, DogWalker[] dogWalkers) {
        this.name = name;
        this.dogWalkers = dogWalkers;
    }

    public DogGarden(DogGarden other) {
        this.name = other.name;
        this.dogWalkers = other.dogWalkers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSIZE() {
        return SIZE;
    }

    public DogWalker[] getDogWalkers() {
        return dogWalkers;
    }

    public void setDogWalkers(DogWalker[] dogWalkers) {
        this.dogWalkers = dogWalkers;
    }

    @Override
    public String toString() {
        return "DogGarden{" +
                "name='" + name + '\'' +
                ", dogWalkers=" + Arrays.toString(dogWalkers) +
                '}' + "\n";
    }
}