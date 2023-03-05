package Ex4;

import java.util.Arrays;

public class DogWalker {
    private String name;
    private final int SIZE = 5;
    private Dog[] dogs = new Dog[SIZE];

    public DogWalker() {
    }

    public DogWalker(DogWalker other) {
        this.name = other.name;
        this.dogs = other.dogs;
    }

    public DogWalker(String name, Dog[] dogs) {
        this.name = name;
        this.dogs = dogs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog[] getDogs() {
        return dogs;
    }

    public void setDogs(Dog[] dogs) {
        this.dogs = dogs;
    }

    @Override
    public String toString() {
        return "DogWalker{" +
                "name='" + name + '\'' +
                ", dogs=" + Arrays.toString(dogs) +
                '}' + "\n";
    }
}
