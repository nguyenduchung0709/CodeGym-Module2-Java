import java.util.Scanner;
public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất ");
        int number1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập vào số thứ hai ");
        int number2 = sc.nextInt();
        number1 = Math.abs(number1);
        number2 = Math.abs(number2);
        if (number1 == 0 || number2 == 0) {
            System.out.println("Không có ước chung lớn nhất ");
            return;
        }
        while (number1 != number2) {
            if (number1 > number2)
                number1 = number1 - number2;
            else
                number2 = number2 - number1;
        }
        System.out.println("Ước chung lớn nhất bằng: " + number1);

    }
}
