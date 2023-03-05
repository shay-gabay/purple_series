package Ex5;

import java.util.Random;

public class ConstantFactory {
    public static int rand(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static String color() {
        String[] clr = {"Yellow", "Gray", "Dark Gray", "Dark Blue"};
        int rnd = rand(0, 99);
        return (rnd < 50) ? clr[0] : (rnd < 70) ? clr[1] : rnd < 85 ? clr[2] : clr[3];
    }
}
