package Ex5;

public class OceanStatistic {
    public static int TotalSharkTeeth(Ocean ocean) {
        int totalTeeth = 0;
        for (int i = 0; i < ocean.getEntities().length; i++) {
            if (ocean.getEntities()[i] instanceof Shark) {
                totalTeeth += ((Shark) ocean.getEntities()[i]).getNumOfTeeth();
            }
        }
        return totalTeeth;
    }

    public static int sumOfWhaleLenght(Ocean ocean) {
        int count = 0;
        for (int i = 0; i < ocean.getEntities().length; i++) {
            if (ocean.getEntities()[i] instanceof Whale) {
                count += ((Whale) ocean.getEntities()[i]).getLengthInMeter();
            }
        }
        return count;
    }

    public static String appearsMore(Ocean ocean) {
        int count = 0;
        for (int i = 0; i < ocean.getEntities().length; i++) {
            if (ocean.getEntities()[i] instanceof Whale) {
                count++;
            }
        }
        if (count < 50) {
            return "Shark";
        }
        if (count > 50) {
            return "Whale";
        }
        return "Equal";
    }

    public static int avgSharkTeeth(Ocean ocean) {
        int totalTeeth = 0;
        int count = 0;
        for (int i = 0; i < ocean.getEntities().length; i++) {
            if (ocean.getEntities()[i] instanceof Shark) {
                totalTeeth += ((Shark) ocean.getEntities()[i]).getNumOfTeeth();
                count++;
            }
        }
        return totalTeeth / count;
    }

    public static int avgOfWhaleLenght(Ocean ocean) {
        int lenght = 0;
        int count = 0;
        for (int i = 0; i < ocean.getEntities().length; i++) {
            if (ocean.getEntities()[i] instanceof Whale) {
                lenght += ((Whale) ocean.getEntities()[i]).getLengthInMeter();
                count++;
            }
        }
        return lenght / count;
    }

    public static void main(String[] args) {
        Ocean ocean1 = new Ocean();
        System.out.println(OceanStatistic.TotalSharkTeeth(ocean1));
        System.out.println(ocean1.totalSharks());
        System.out.println(OceanStatistic.sumOfWhaleLenght(ocean1));
        System.out.println(ocean1.totalWhale());
        System.out.println(OceanStatistic.appearsMore(ocean1));
        System.out.println(OceanStatistic.avgSharkTeeth(ocean1));
        System.out.println(OceanStatistic.avgOfWhaleLenght(ocean1));
    }

}
