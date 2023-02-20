package Ex1;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Group g1 = FactoryUtils.initGroup();
        System.out.println(Arrays.toString(g1.getPeople()));
        System.out.println("---------------------------");

        Group g2 = FactoryUtils.initGroup();
        System.out.println(Arrays.toString(g2.getPeople()));
        System.out.println("----------------------------");
        Group g3 = FactoryUtils.initGroup(true);
        System.out.println(g3);
        Person p1 = FactoryUtils.initPerson(true);
        System.out.println(p1);
        // i stop in lesson 13 in 03:55
    }

}
