import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static Integer[] createArray(int size) {
        Random rd = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = rd.nextInt(100);
            System.out.print(array[i] + " ");
        }
        return array;
    }
    public static void main(String[] args) {
        Integer[] array = createArray(100);
        System.out.println(Arrays.toString(array));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a random index of the array to find the element: ");
        int index = sc.nextInt();
        try {
            System.out.println("The element at index " + index + " is " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The element at index " + index + " is out of bounds");
        }
    }

}
