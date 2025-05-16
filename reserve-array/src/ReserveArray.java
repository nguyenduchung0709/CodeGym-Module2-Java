

import java.util.Arrays;
import java.util.Scanner;

public class ReserveArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào size của mảng: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Nhập size nhỏ hơn 20");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào các giá trị thứ " + (i + 1) + " của mảng");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng ban đầu: " + Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("Mảng đảo ngược: " + Arrays.toString(array));

    }

//    private static void reserveArray(int[] array) {
//        for (int i = 0; i < array.length / 2; i++) {
//            int temp = array[i];
//            array[i] = array[array.length - i - 1];
//            array[array.length - i - 1] = temp;
//        }

}