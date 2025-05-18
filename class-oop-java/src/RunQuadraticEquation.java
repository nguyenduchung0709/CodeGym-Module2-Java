import java.util.Scanner;

public class RunQuadraticEquation {
    public static void main(String[] args) {
        System.out.println("Phương trình bậc 2 có dạng ax^2 + bx + c = 0");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào a: ");
        double a = sc.nextDouble();

        if (a <= 0) {
            System.out.println("Không phải pt bậc 2, Nhập a > 0");
            return;
        }
        sc.nextLine();
        System.out.println("Nhập vào b: ");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập vào c: ");
        double c = sc.nextDouble();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);


        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double delta = equation.getDiscriminant();
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm " + equation.getRoot1() + " và " + equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép " + equation.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }

    }
}
