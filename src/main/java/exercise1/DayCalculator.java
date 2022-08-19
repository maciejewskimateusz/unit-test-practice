package exercise1;

import java.time.YearMonth;

public class DayCalculator {

    int getDayCount(int year, int month) {
        return YearMonth.of(year, month).lengthOfMonth();
    }
}
