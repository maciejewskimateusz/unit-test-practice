package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void shouldAdd12To5AndResult17() {

        //given
        Calculator calculator = new Calculator();
        int a = 12;
        int b = 5;

        //when
        int result = calculator.add(a, b);

        //then
        assertEquals(17, result);
    }

    @Test
    void shouldAdd1To6AndResult7() {

        //given
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 6;

        //when
        int result = calculator.add(a, b);

        //then
        assertEquals(7, result);
    }
}