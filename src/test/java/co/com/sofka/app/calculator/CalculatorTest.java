package co.com.sofka.app.calculator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private static Calculator calculator;

    @BeforeAll
    public static void setUpEnvironment() {
        calculator = new Calculator();
    }

    @CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "49, 51, 100",
            "1, 100, 101"
    })
    @ParameterizedTest(name = "{0} plus {1} should return {2}.")
    void sum(Long a, Long b, Long expectedResult) {
        // Act
        Long actualResult = calculator.sum(a, b);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @CsvSource({
            "45, 34, 11",
            "1, 2, -1",
            "100, 51, 49",
            "23, 12, 11"
    })
    @ParameterizedTest(name = "{0} minus {1} should return {2}.")
    void subtract(Long minuend, Long subtrahend, Long expectedResult) {
        // Act
        Long actualResult = calculator.subtract(minuend, subtrahend);

        // Assert
        assertEquals(expectedResult, actualResult);
    }


    @CsvSource({
            "23, 34, 782",
            "1, 2, 2",
            "100, 0, 0",
            "11, 8, 88"
    })
    @ParameterizedTest(name = "{0} times {1} should return {2}.")
    void multiply(Long a, Long b, Long expectedResult) {
        // Act
        Long actualResult = calculator.multiply(a, b);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @CsvSource({
            "45, 1, 45",
            "1, 2, 0.5",
            "100, 4, 25",
            "88, 11, 8"
    })
    @ParameterizedTest(name = "{0} over {1} should return {2}.")
    void divide(Long dividend, Long divisor, Long expectedResult) {
        // Act
        Long actualResult = calculator.divide(dividend, divisor);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide_with_error() {
        // Arrange
        Long dividend = 23L;
        Long divisor = 0L;

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(dividend, divisor));
    }
}