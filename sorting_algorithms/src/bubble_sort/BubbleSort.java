package bubble_sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {9,6,4,5,4,78,61,3,1,1,2};
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void bubbleSort(int[] array) {
        boolean needNextPass = true;
        for (int i = 1; i < array.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }

    }
}