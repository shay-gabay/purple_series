package Ex4;

import java.util.Random;

public class DogFactory {
    public static Dog initDog() {
        String name = ConstantFactory.randomDogName();
        float weight = ConstantFactory.randomWeight();
        String color = ConstantFactory.randomColor();
        boolean isVaccinated = false;
        if ((int) (Math.random() * 10) >= 2) {
            isVaccinated = true;
        }
        return new Dog(name, weight, color, isVaccinated);
    }

    public static Dog[] initDog(int len) {
        Dog[] dogs = new Dog[len];
        for (int i = 0; i < len; i++) {
            dogs[i] = initDog();
        }
        return dogs;
    }

    public static DogWalker initDogWalker(String name) {
        return new DogWalker(name, initDog(5));
    }

    public static DogWalker[] initDogWalkers(int len) {
        DogWalker[] dogWalkers = new DogWalker[len];
        for (int i = 0; i < len; i++) {
            dogWalkers[i] = initDogWalker(ConstantFactory.randomHumenName());
        }
        return dogWalkers;
    }

    public static DogGarden initDogGarden() {
        String name = ConstantFactory.randomGardenName();
        DogWalker[] dogWalkers = initDogWalkers(25);
        return new DogGarden(name, dogWalkers);
    }

}
