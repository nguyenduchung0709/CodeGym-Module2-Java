import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NextDayCalculatorTest {

    @Test
    @DisplayName("The last day of January")
    public void findNextDayOfDay31() {
        int day = 31;
        int month = 1;
        int year = 2025;

        String expectedDay = "1/2/2025";
        String actualDay = NextDayCalculator.findNextDay(day, month, year);
        assertEquals(expectedDay, actualDay);
    }

    @Test
    @DisplayName("The last day of year")
    public void findNextDayOfDecember() {
        int day = 31;
        int month = 12;
        int year = 2025;

        String expectedDay = "1/1/2026";
        String actualDay = NextDayCalculator.findNextDay(day, month, year);
        assertEquals(expectedDay, actualDay);
    }

    @Test
    @DisplayName("Normal Day")
    public void findTheNextDay() {
        int day = 14;
        int month = 6;
        int year = 2006;

        String expectedDay = "15/6/2006";
        String actualDay = NextDayCalculator.findNextDay(day, month, year);
        assertEquals(expectedDay, actualDay);
    }

    @Test
    @DisplayName("In a leap year")
    public void findNextDayIn2024() {
        int day = 28;
        int month = 2;
        int year = 2024;

        String expectedDay = "29/2/2024";
        String actualDay = NextDayCalculator.findNextDay(day, month, year);
        assertEquals(expectedDay, actualDay);
    }

    @Test
    @DisplayName("In a leap year next")
    public void findNextDayInFebruary() {
        int day = 29;
        int month = 2;
        int year = 2024;

        String expectedDay = "1/3/2024";
        String actualDay = NextDayCalculator.findNextDay(day, month, year);
        assertEquals(expectedDay, actualDay);
    }

}