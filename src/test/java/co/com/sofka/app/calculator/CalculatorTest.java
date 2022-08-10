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
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    @ParameterizedTest(name = "{0} plus {1} should return {2}.")
    void sum(Long a, Long b, Long expectedResult) {
        // Act
        Long actualResult = calculator.sum(a, b);

        // Assert
        assertEquals(expectedResult, actualResult);
    }
}