import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Phương trình có dạng ax + b =0 ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số a: ");
        double a = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập vào số b: ");
        double b = sc.nextInt();
        if (a != 0) {
            System.out.println("Phương trình có nghiệm duy nhất x bằng: " + (-b) / a);
        } else {
            if (b == 0) {
                System.out.println("Nghiệm đúng với mọi x");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }

    }
}
