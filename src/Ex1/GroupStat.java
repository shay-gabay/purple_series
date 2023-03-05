package Ex1;

public class GroupStat {
    public static int numOfSmoking(Group group) {
        return group.healthScore();
    }

    public static int numOfLiving(Group group, String city) {
        int count = 0;
        for (int i = 0; i < group.getPeople().length; i++) {
            if (group.getPeople()[i].getCity().equals(city)) {
                count++;
            }
        }
        return count;
    }

}
