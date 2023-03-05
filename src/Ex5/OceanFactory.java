package Ex5;

import java.util.Random;

public class OceanFactory {
    public static Shark initShark() {
        return new Shark(ConstantFactory.rand(40, 130));
    }

    public static Whale initWhale() {
        return new Whale(ConstantFactory.rand(1_000, 1_500));
    }

    public static Fish initFish() {
        boolean b = (new Random().nextBoolean());
        if (b) {
            return initShark();
        }
        return initWhale();
    }

    public static Fish[] init(int len) {
        Fish[] fish = new Fish[len];
        for (int i = 0; i < len; i++) {
            fish[i] = initFish();
        }
        return fish;
    }
}
