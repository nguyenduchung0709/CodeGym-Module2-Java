import java.util.Arrays;
import java.util.Scanner;

public class FindHighestValue {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập vào size của mảng");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size nhỏ hơn 20");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào số thứ " + (i + 1) + " của mảng");
            array[i] = sc.nextInt();
        }
        int highest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > highest) {
                highest = array[i];
            }
        }
        System.out.println("Mảng nhập vào: " + Arrays.toString(array));
        System.out.println("Giá trị lớn nhất trong mảng: " + highest);
    }
}
