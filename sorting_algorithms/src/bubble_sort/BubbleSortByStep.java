package bubble_sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Before sorting" + Arrays.toString(numbers));
        System.out.println();
        bubbleSortByStep(numbers);
        System.out.println("After sorting" + Arrays.toString(numbers));

    }

    public static void bubbleSortByStep(int[] array) {
        boolean needNextPass = true;
        for (int i = 1; i < array.length && needNextPass ; i++) {
            needNextPass = false;
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    System.out.println("Swap " + array[j] + " and " + array[j + 1]);
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    needNextPass = true;
                }
            }

        }

    }
}
