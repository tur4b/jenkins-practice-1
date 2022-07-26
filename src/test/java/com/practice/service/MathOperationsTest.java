package com.practice.service;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationsTest {

    private final MathOperations mathOperations = new MathOperations();

    @Test
    void add() {

        final BigDecimal one = BigDecimal.ONE;
        final BigDecimal five = BigDecimal.valueOf(5);
        final BigDecimal ten = BigDecimal.TEN;

        final BigDecimal sumResult = mathOperations.add(one, five, ten);
        final BigDecimal expected = BigDecimal.valueOf(16);

        assertTrue(expected.compareTo(sumResult) == 0);
    }

    @Test
    void add_with_invalid_arg_count_throws_exception() {

        final IllegalArgumentException exc = assertThrows(IllegalArgumentException.class,
                () -> mathOperations.add()
        );

        assertEquals("At least one number must be exist!", exc.getMessage());
    }

    @Test
    void subtract() {

        final BigDecimal one = BigDecimal.ONE;
        final BigDecimal five = BigDecimal.valueOf(5);
        final BigDecimal ten = BigDecimal.TEN;

        final BigDecimal subtractResult = mathOperations.subtract(ten, five, one);
        final BigDecimal expected = BigDecimal.valueOf(4);

        assertTrue(expected.compareTo(subtractResult) == 0);
    }

    @Test
    void subtract_with_invalid_arg_count_throws_exception() {

        final IllegalArgumentException exc = assertThrows(IllegalArgumentException.class,
                () -> mathOperations.subtract(BigDecimal.TEN)
        );

        assertEquals("At least one number must be exist!", exc.getMessage());
    }

    @Test
    void multiply() {
        final BigDecimal one = BigDecimal.ONE;
        final BigDecimal five = BigDecimal.valueOf(5);
        final BigDecimal ten = BigDecimal.TEN;

        final BigDecimal multiplyResult = mathOperations.multiply(ten, five, one);
        final BigDecimal expected = BigDecimal.valueOf(50);

        assertTrue(expected.compareTo(multiplyResult) == 0);
    }

    @Test
    void multiply_with_invalid_arg_count_throws_exception() {
        final IllegalArgumentException exc = assertThrows(IllegalArgumentException.class,
                () -> mathOperations.multiply(BigDecimal.TEN)
        );

        assertEquals("At least one number must be exist!", exc.getMessage());
    }


    @Test
    void divide() {
        final BigDecimal one = BigDecimal.ONE;
        final BigDecimal three = BigDecimal.valueOf(3);
        final BigDecimal fourteen = BigDecimal.valueOf(14);

        final BigDecimal divideResult = mathOperations.divide(fourteen, three, one);
        final BigDecimal expected = BigDecimal.valueOf(4.67);

        assertEquals(expected, divideResult);
    }

    @Test
    void divide_with_invalid_arg_count_throws_exception() {
        final IllegalArgumentException exc = assertThrows(IllegalArgumentException.class,
                () -> mathOperations.divide(BigDecimal.TEN)
        );
        assertEquals("At least one number must be exist!", exc.getMessage());
    }

    @Test
    void divide_by_zero_throws_exception() {
        final ArithmeticException exc = assertThrows(ArithmeticException.class,
                () -> mathOperations.divide(BigDecimal.TEN, BigDecimal.ZERO, BigDecimal.ONE)
        );
        assertEquals("Can't divide by zero!", exc.getMessage());
    }

}