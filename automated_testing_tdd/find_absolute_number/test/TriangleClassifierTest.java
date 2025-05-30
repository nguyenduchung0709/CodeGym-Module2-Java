import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {

    @Test
    @DisplayName("Normal Triangle")
    public void classifyNormalTriangle() {
        double canhA = 3;
        double canhB = 4;
        double canhC = 5;
        String expected = "Normal Triangle";
        String actual = TriangleClassifier.triangle(canhA, canhB, canhC);
        assertEquals(expected, actual);


        }
    @Test
    @DisplayName("Isosceles Triangle")
    public void classifyIsoscelesTriangle() {
        double canhA = 3;
        double canhB = 3;
        double canhC = 5;
        String expected = "Isosceles Triangle";
        String actual = TriangleClassifier.triangle(canhA, canhB, canhC);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Equilateral Triangle")
    public void classifyEquilateralTriangle() {
        double canhA = 5;
        double canhB = 5;
        double canhC = 5;
        String expected = "Equilateral Triangle";
        String actual = TriangleClassifier.triangle(canhA, canhB, canhC);
        assertEquals(expected, actual);
    }
}
