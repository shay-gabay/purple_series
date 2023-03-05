package Ex1;

public class FactoryUtils {
    private static int count = 1;
    private static String[] cities = {"TLV", "JLM", "HFA"};

    public static Group initGroup() {
        Person[] people = new Person[10];
        boolean isSmoking = true;
        for (int i = 0; i < people.length; i++) {
            if (i >= 3) {
                isSmoking = false;
            }
            people[i] = new Person(count, "first" + count, "last" + count++,cities[(int)(Math.random()*cities.length)], isSmoking);
        }
        Group group = new Group(people);
        return group;

    }

    public static Group initGroup(boolean isSmoking) {
        Person[] people = new Person[10];
        for (int i = 0; i < people.length; i++) {
            people[i] = new Person(count, "first" + count, "last" + count++, cities[(int)(Math.random()*cities.length)], isSmoking);
        }
        Group group = new Group(people);
        return group;

    }

    public static Person initPerson(boolean isSmoking) {
        int id = count;
        String first = "John " + count;
        String last = "Bryce " + count++;
        String city = cities[(int) (Math.random() * cities.length)];
        return new Person(id, first, last, city, isSmoking);


    }
}