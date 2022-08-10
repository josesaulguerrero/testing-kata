package co.com.sofka.app.calculator;

import org.junit.jupiter.api.BeforeAll;
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
}