import java.util.Arrays;
import java.util.Scanner;

public class BinarySearching {
    public static int binarySearch(int[] arr, int value, int low, int high) {
        while(low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == value) {
                return mid;
            }
            if (arr[mid] < value) {
                low = mid + 1;
            }
            if (arr[mid] > value) {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);
        System.out.println("Your array is: " + Arrays.toString(numbers));

        int result = binarySearch(numbers, 16, 0, numbers.length - 1);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }

    }
}
