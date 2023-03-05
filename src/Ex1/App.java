package Ex1;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Group g1 = FactoryUtils.initGroup();
        Group g2 = FactoryUtils.initGroup(true);
        Group g3 = FactoryUtils.initGroup(false);
        ReportUtils.info(g1);
        ReportUtils.info(g2);
        ReportUtils.info(g3);

        // i stop in lesson 13 in 03:55
    }

}
