package Ex4;

import java.util.Random;

public class Dog {
    private String name;
    private float weight;
    private String color;
    private boolean isVaccinated = true;

    public Dog() {
    }

    public Dog(Dog other) {
        this.name = other.name;
        this.weight = other.weight;
        this.color = other.color;
        this.isVaccinated = other.isVaccinated;
    }

    public Dog(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public Dog(String name, float weight, String color) {
        this(name, weight);
        this.color = color;
    }

    public Dog(String name, float weight, String color, boolean isVaccinated) {
        this(name, weight, color);
        this.isVaccinated = isVaccinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", isVaccinated=" + isVaccinated +
                '}' + "\n";
    }

}
