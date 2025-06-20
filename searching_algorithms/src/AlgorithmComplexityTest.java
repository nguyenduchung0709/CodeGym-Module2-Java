import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();

        int[] frequentChar = new int[225];
        for (int i = 0; i < inputString.length(); i++) {
            int ascii = inputString.charAt(i);
            frequentChar[ascii]++;
        }
        int max = 0;
        char character = (char) 225;
        for (int i = 0; i < 225; i++) {
            if (frequentChar[i] > max) {
                max = frequentChar[i];
                character = (char) i;
            }
        }
        System.out.println("The most appearing letter is the string is: " + character + " with a frequency of " + max + " times");
    }
}
