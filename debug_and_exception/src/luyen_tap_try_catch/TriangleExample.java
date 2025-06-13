package luyen_tap_try_catch;

import java.util.Scanner;

public class TriangleExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the first side: ");
            double firstSide = sc.nextDouble();
            System.out.print("Enter the first side: ");
            double secondSide = sc.nextDouble();
            System.out.print("Enter the first side: ");
            double thirdSide = sc.nextDouble();

            validateTriangle(firstSide, secondSide, thirdSide);
            System.out.println("All side is valid, this is a triangle");
        } catch (IllegalTriangleException e) {
            System.out.println("Invalid triangle " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Input mismatch please enter a number !");
        } finally {
            System.out.println("Done!!");
        }
    }

    public static void validateTriangle (double firstSide, double secondSide, double thirdSide) throws IllegalTriangleException {
        if (firstSide + secondSide < thirdSide || firstSide + thirdSide < secondSide || secondSide + thirdSide < firstSide) {
            throw new IllegalTriangleException("Sum of two side must be greater than the rest side");
        }
        if (firstSide < 0 || secondSide < 0 || thirdSide < 0) {
            throw new IllegalTriangleException("All side must be greater than zero");
        }
    }
}
