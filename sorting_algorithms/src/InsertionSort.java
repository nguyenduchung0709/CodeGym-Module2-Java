import java.util.Arrays;

public class InsertionSort {
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                System.out.println("Move element: " + arr[j + 1] + " to " + arr[j]);
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{8,74,18,67,9,7,81,5,6,26};
        System.out.println("Before insertion sort: " + Arrays.toString(arr));
        insertSort(arr);
        System.out.println("After insertion sort: " + Arrays.toString(arr));
    }
}
