package Ex5;

public class OceanReport {
    public static void Report(Ocean ocean) {
        System.out.println("---------------->>* Ocean Report *<<----------------");
        System.out.println("The total num of teeth of the " + ocean.totalSharks() + " sharks is : " + OceanStatistic.TotalSharkTeeth(ocean));
        System.out.println("The total length of the " + ocean.totalWhale() + " whales is : " + OceanStatistic.sumOfWhaleLenght(ocean));
        System.out.println("The showen fish is : " + OceanStatistic.appearsMore(ocean));
        System.out.println("The average teeth of sharks is : " + OceanStatistic.avgSharkTeeth(ocean));
        System.out.println("The average lenght of whales is : " + OceanStatistic.avgOfWhaleLenght(ocean));
        System.out.println("----------------------------------------------------");
    }
}
