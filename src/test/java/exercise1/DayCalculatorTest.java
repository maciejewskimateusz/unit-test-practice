package exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayCalculatorTest {

    private final DayCalculator dayCalculator = new DayCalculator();

    @Test
    void shouldReturn30For2018_06() {
        //when
        int dayCount = dayCalculator.getDayCount(2018, 6);

        //then
        assertEquals(30, dayCount);
    }

    @Test
    void shouldReturn31For2018_07() {
        //when
        int dayCount = dayCalculator.getDayCount(2018, 7);

        //then
        assertEquals(31, dayCount);
    }

    @Test
    void shouldReturn31For2018_08() {
        //when
        int dayCount = dayCalculator.getDayCount(2018, 8);

        //then
        assertEquals(31, dayCount);
    }

    @Test
    void shouldReturn28For2018_02() {
        //when
        int dayCount = dayCalculator.getDayCount(2018, 2);

        //then
        assertEquals(28, dayCount);
    }

    @Test
    void shouldReturn29For2016_02() {
        //when
        int dayCount = dayCalculator.getDayCount(2016, 2);

        //then
        assertEquals(29, dayCount);
    }

    @Test
    void shouldReturn28For2010_02() {
        //when
        int dayCount = dayCalculator.getDayCount(2010, 2);

        //then
        assertEquals(28, dayCount);
    }

    @Test
    void shouldReturn28For2100_02() {
        //when
        int dayCount = dayCalculator.getDayCount(2100, 2);

        //then
        assertEquals(28, dayCount);
    }

    @Test
    void shouldReturn29For2000_02() {
        //when
        int dayCount = dayCalculator.getDayCount(2000, 2);

        //then
        assertEquals(29, dayCount);
    }
}