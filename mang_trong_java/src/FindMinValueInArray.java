import java.util.Arrays;
import java.util.Random;

public class FindMinValueInArray {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }
        int index = minValue(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Số nhỏ nhất trong mảng là: " + arr[index]);
    }

    public static int minValue(int[] arr) {
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }
}
