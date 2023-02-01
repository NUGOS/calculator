import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.goit.calculator.SumCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void sum_of_1_is_1() {
        assertEquals(1, sumCalculator.sum(1));
    }

    @Test
    void sum_of_3_is_6() {
        assertEquals(6, sumCalculator.sum(3));
    }

    @Test
    void sum_of_0_throws_IllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}