package Ex4;

import java.util.Random;

public class ConstantFactory {
    public static final String[] name = {"Johnny", "Gal", "Moshe", "Ravid", "Tal"};
    public static final String[] color = {"White", "Brown", "Black", "Dotted", "Leopard Strioes"};
    public static final String[] dogName = {"Dogush", "Dogidog", "Dogaldo", "Dogile", "Doginiiho", "Doginoin", "Dogxer", "Dogolon", "Dogonihikio", "Dogio"};
    public static final String[] gardenName = {"Dog Kingdom", "Dog Heaven", "Funfunfun Place"};

    public static String randomHumenName() {
        return name[(int) (Math.random() * name.length)];
    }

    public static float randomWeight() {
        return (float) (Math.random() * (8.8 - 3.2 + 1) + 3.2);
    }

    public static String randomColor() {
        return color[(int) (Math.random() * color.length)];
    }

    public static String randomDogName() {
        return dogName[(int) (Math.random() * dogName.length)];
    }

    public static String randomGardenName() {
        return gardenName[(int) (Math.random() * gardenName.length)];
    }
}
