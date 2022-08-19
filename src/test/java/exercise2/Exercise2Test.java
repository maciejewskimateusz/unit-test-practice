package exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise2Test {

    private Exercise2 exercise2 = new Exercise2();

    @Test
    void shouldBePrimeFor1() {

        boolean primeNumber = exercise2.isPrimeNumber(1);

        assertTrue(primeNumber);

    }

    @Test
    void shouldBePrimeFor2() {

        boolean primeNumber = exercise2.isPrimeNumber(2);

        assertTrue(primeNumber);

    }

    @Test
    void shouldNotBePrimeFor4() {

        boolean primeNumber = exercise2.isPrimeNumber(4);

        assertFalse(primeNumber);

    }

    @Test
    void shouldNotBePrimeFor100() {

        boolean primeNumber = exercise2.isPrimeNumber(100);

        assertFalse(primeNumber);

    }

    @Test
    void shouldBePrimeFor11() {

        boolean primeNumber = exercise2.isPrimeNumber(11);

        assertTrue(primeNumber);

    }

    @Test
    void shouldReturnValidCode() {
        Exercise2.Code code = exercise2.getCode("a");

        assertEquals("a", code.getKey());
        assertNotNull(code.getCreatedAtTimestamp());
        assertNotNull(code.getCode());
    }

    @Test
    void shouldReturnSameObjects() {
        Exercise2.Code code = exercise2.getCode("a");
        Exercise2.Code code2 = exercise2.getCode("a");

        assertSame(code,code2);
    }

    @Test
    void shouldReturnDifferentObjects() {
        Exercise2.Code code = exercise2.getCode("a");
        Exercise2.Code code2 = exercise2.getCode("b");

        assertNotSame(code,code2);
    }
}