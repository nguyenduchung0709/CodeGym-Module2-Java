import java.util.Scanner;
public class CurrenncyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số tiền (USD)");
        double usd = sc.nextDouble();
        double vn = usd * 23000;
        System.out.println("Số tiền sau khi chuyển sang VND bằng: " + vn);

    }
}
