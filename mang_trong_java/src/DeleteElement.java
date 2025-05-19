import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {6,8,6,54,8,5,7,4};
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Xóa phần tử ở vị trí thứ: ");
        int indexElement = sc.nextInt();
        if (indexElement > arr.length || indexElement < 0) {
            System.out.println("Vị trí không hợp lệ");
            return;
        }
        for (int i = indexElement; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        System.out.println("Mảng sau khi xóa phần tử thứ:" + indexElement + " " +  Arrays.toString(arr));

    }
}
