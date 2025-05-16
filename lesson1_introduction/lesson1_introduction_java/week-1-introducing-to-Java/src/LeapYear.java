import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số năm: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 && year % 100 == 0)) {
            System.out.println("Năm " + year + " là năm nhuận");
        } else {
            System.out.println("Năm " + year + " không phải năm nhuận");
        }
    }
}
