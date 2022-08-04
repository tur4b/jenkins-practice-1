package com.practice.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

// import static org.junit.jupiter.api.Assertions.*;
// import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
// import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import static org.assertj.core.api.AssertionsForClassTypes.*;

// using assertj - in order to create more readable assertions
class MathOperationsTest {

    private final MathOperations mathOperations = new MathOperations();

    @Test
    @DisplayName("Adding some values")
    void add() {

        final BigDecimal one = BigDecimal.ONE;
        final BigDecimal five = BigDecimal.valueOf(5);
        final BigDecimal ten = BigDecimal.TEN;

        final BigDecimal sumResult = mathOperations.add(one, five, ten);
        final BigDecimal expected = BigDecimal.valueOf(16);

        // assertTrue(expected.compareTo(sumResult) == 0);

        assertThat(sumResult).isEqualByComparingTo(expected);
    }

    @Test
    @DisplayName("Adding some values with invalid arg count")
    void add_with_invalid_arg_count_throws_exception() {

        // final IllegalArgumentException exc = assertThrows(IllegalArgumentException.class,
        //         () -> mathOperations.add()
        // );

        // assertEquals("At least one number must be exist!", exc.getMessage());

        assertThatThrownBy(() -> mathOperations.add())
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("At least one number must be exist!");
        
    }

    @Test
    @DisplayName("Subtract some values")
    void subtract() {

        final BigDecimal one = BigDecimal.ONE;
        final BigDecimal five = BigDecimal.valueOf(5);
        final BigDecimal ten = BigDecimal.TEN;

        final BigDecimal subtractResult = mathOperations.subtract(ten, five, one);
        final BigDecimal expected = BigDecimal.valueOf(4);

        // assertTrue(expected.compareTo(subtractResult) == 0);

        assertThat(subtractResult).isEqualByComparingTo(expected);

    }

    @Test
    @DisplayName("Subtract some values with invalid arg count")
    void subtract_with_invalid_arg_count_throws_exception() {

        // final IllegalArgumentException exc = assertThrows(IllegalArgumentException.class,
        //         () -> mathOperations.subtract(BigDecimal.TEN)
        // );

        // assertEquals("At least one number must be exist!", exc.getMessage());

        assertThatThrownBy(() -> mathOperations.subtract(BigDecimal.TEN))
            .isNotIn(IllegalArgumentException.class)
            .hasMessage("At least one number must be exist!");

    }

    @Test
    @DisplayName("Multiply some values")
    void multiply() {
        final BigDecimal one = BigDecimal.ONE;
        final BigDecimal five = BigDecimal.valueOf(5);
        final BigDecimal ten = BigDecimal.TEN;

        final BigDecimal multiplyResult = mathOperations.multiply(ten, five, one);
        final BigDecimal expected = BigDecimal.valueOf(50);

        // assertTrue(expected.compareTo(multiplyResult) == 0);

        assertThat(multiplyResult).isEqualByComparingTo(expected);

    }

    @Test
    @DisplayName("Multiply some values with invalid arg count")
    void multiply_with_invalid_arg_count_throws_exception() {
        // final IllegalArgumentException exc = assertThrows(IllegalArgumentException.class,
        //         () -> mathOperations.multiply(BigDecimal.TEN)
        // );

        // assertEquals("At least one number must be exist!", exc.getMessage());

        assertThatThrownBy(() -> mathOperations.multiply(BigDecimal.TEN))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("At least one number must be exist!");

    }


    @Test
    @DisplayName("Divide some values")
    void divide() {
        final BigDecimal one = BigDecimal.ONE;
        final BigDecimal three = BigDecimal.valueOf(3);
        final BigDecimal fourteen = BigDecimal.valueOf(14);

        final BigDecimal divideResult = mathOperations.divide(fourteen, three, one);
        final BigDecimal expected = BigDecimal.valueOf(4.67);

        // assertEquals(expected, divideResult);

        assertThat(divideResult).isEqualByComparingTo(expected);
    }

    @Test
    @DisplayName("Divide some values with invalid arg count")
    void divide_with_invalid_arg_count_throws_exception() {
        // final IllegalArgumentException exc = assertThrows(IllegalArgumentException.class,
        //         () -> mathOperations.divide(BigDecimal.TEN)
        // );
        // assertEquals("At least one number must be exist!", exc.getMessage());

        assertThatThrownBy(() -> mathOperations.divide(BigDecimal.TEN))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("At least one number must be exist!");
    }

    @Test
    @DisplayName("Divide some values by zero")
    void divide_by_zero_throws_exception() {
        // final ArithmeticException exc = assertThrows(ArithmeticException.class,
        //         () -> mathOperations.divide(BigDecimal.TEN, BigDecimal.ZERO, BigDecimal.ONE)
        // );
        // assertEquals("Can't divide by zero!", exc.getMessage());

        assertThatThrownBy(() -> mathOperations.divide(BigDecimal.TEN, BigDecimal.ZERO, BigDecimal.ONE))
            .isInstanceOf(ArithmeticException.class)
            .hasMessage("Can't divide by zero!");
    }

}