package Ex1;

public class ReportUtils {
    public static void info(Group group) {
        System.out.println("@@@@@@@@@@@@ Report - Group @@@@@@@@@@@@");
        System.out.println("Group name :" + group.getName());
        System.out.println("num of smokers : " + GroupStat.numOfSmoking(group));
        System.out.println("num of living in TLV :" + GroupStat.numOfLiving(group, "TLV"));
        System.out.println("num of living in HFA :" + GroupStat.numOfLiving(group, "HFA"));
        System.out.println("num of living in JLM :" + GroupStat.numOfLiving(group, "JLM"));

    }
}
