import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    @DisplayName("Testing FizzBuzz")
    public void fizzBuzzTest() {
        int number = 15;
        String expected = "FizzBuzz";
        String actual = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing Fizz")
    public void fizzBuzzTest2() {
        int number = 3;
        String expected = "Fizz";
        String actual = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing Buzz")
    public void fizzBuzzTest3() {
        int number = 25;
        String expected = "Buzz";
        String actual = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing normal number")
    public void fizzBuzzTest4() {
        int number = 1;
        String expected = "1";
        String actual = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing number is contain 3")
    public void convertContains3() {
        int number = 31;
        String expected = "Fizz";
        String actual = FizzBuzz.convert(number);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing number is contain 5")
    public void convertContains5() {
        int number = 56;
        String expected = "Buzz";
        String actual = FizzBuzz.convert(number);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Translate number is not divisible by 3 and 5")
    public void fizzBuzzTranslate() {
        int number = 97;
        String expected = "chín bảy";
        String actual = FizzBuzz.convert(number);
        assertEquals(expected, actual);
    }
}
