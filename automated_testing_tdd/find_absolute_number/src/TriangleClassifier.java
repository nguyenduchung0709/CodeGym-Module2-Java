public class TriangleClassifier {
    public static String triangle(double canhA, double canhB, double canhC) {
        if (canhA <= 0 || canhB <= 0 || canhC <=0) {
            throw new IllegalArgumentException("Invalid triangle");
        }
        if (canhA + canhB < canhC && canhA + canhC < canhB && canhB + canhC < canhA) {
            throw new IllegalArgumentException("Invalid triangle");
        }
        if (canhA == canhB && canhB == canhC) {
            return "Equilateral Triangle";
        } else if (canhA == canhB || canhA == canhC || canhB == canhC) {
            return "Isosceles Triangle";
        } else {
            return "Normal Triangle";
        }
    }
}
