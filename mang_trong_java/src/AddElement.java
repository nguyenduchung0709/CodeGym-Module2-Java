import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào vị trí muốn thêm phần tử: ");
        int index = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập vào phần tử muốn thêm: ");
        int number = sc.nextInt();
        Integer[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        list.add(index, number);
        arr = list.toArray(new Integer[0]);
        System.out.println("Mảng sau khi thêm phần tử: " + Arrays.toString(arr));
    }


}
