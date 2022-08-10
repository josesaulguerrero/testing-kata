package co.com.sofka.app.calculator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private static Calculator calculator;

    @BeforeAll
    public static void setUpEnvironment() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("15 plus 45 should return 60.")
    void sum() {
        // Arrange
        Long a = 15L;
        Long b = 45L;
        Long expectedResult = 60L;

        // Act
        Long actualResult = calculator.sum(a, b);

        // Assert
        assertEquals(expectedResult, actualResult);
    }
}