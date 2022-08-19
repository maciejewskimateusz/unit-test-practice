package paramTestExercise;

import java.time.YearMonth;

public class Exercise3 {

    int getDayCount(int year, int month) {
        return YearMonth.of(year, month).lengthOfMonth();
    }

}

