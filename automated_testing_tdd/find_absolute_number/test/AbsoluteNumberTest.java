import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberTest {

    @Test
    @DisplayName("Absolute of -5")
    public void findAbsoluteOfNegative5() {

        int number = -5;
        int expected = 5;
        int actual = AbsoluteNumber.findAbsolute(number);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Absolute of 0")
    public void findAbsoluteOfZero() {
        int expected = 0;
        int number = 0;
        int actual = AbsoluteNumber.findAbsolute(number);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Absolute of 14")
    public void findAbsoluteOf14() {
        int expected = 14;
        int number = 14;
        int actual = AbsoluteNumber.findAbsolute(number);
        assertEquals(expected, actual);
    }
}