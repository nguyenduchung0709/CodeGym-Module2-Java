import java.util.Scanner;
public class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số: ");
        int num = sc.nextInt();
        if (num < 2) {
            System.out.println(num + " không phải số nguyên tố");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " là số nguyên tố");
        } else {
            System.out.println(num + " không phải số nguyên tố");
        }
    }
}
