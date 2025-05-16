import java.util.Scanner;
public class CalculateInterestApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số tháng ");
        int month = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập vào số tiền cho vay");
        double money = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập vào tỉ lệ lãi");
        double interest = sc.nextDouble();
        double total = 0;

        for (int i = 0; i <= month; i++) {
            total = money * (interest / 100 / 12) * 3;
        }
        System.out.println("Tổng số tiền lãi bằng: " + total);

    }
}
