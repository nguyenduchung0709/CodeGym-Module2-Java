import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên : ");
        String str = sc.nextLine();
        String[] array = {"Zero", "Diend", "Agito", "Den-O", "Bruno", "Zi-o", "Decade", "Yone"};
        boolean flag = false;
        int i = 0;
        for (; i < array.length; i++) {
            if (array[i].equals(str)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Tên có trong mảng tại vị trí: " + i);
        } else {
                System.out.println("Không tìm thấy trong mảng");
            }
    }
}
