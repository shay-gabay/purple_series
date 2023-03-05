package Ex2;

import java.time.Year;

public class FullYear {
    private Date[] dates;

    public FullYear(int year) {
        if (Year.isLeap(year)) {
            dates = new Date[366];
        }
        dates = new Date[365];
    }
}