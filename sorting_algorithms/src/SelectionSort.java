import java.util.Arrays;

public class SelectionSort {
    public static void sortingSelection(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] numbers = {4,5,87,97,5,7,5,16,};
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        sortingSelection(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));
    }
}
