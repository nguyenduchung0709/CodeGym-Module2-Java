import java.util.Scanner;
public class OperatorExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều rộng của HCN: ");
        float width = sc.nextFloat();
        sc.nextLine();
        System.out.println("Nhập vào chiều cao của HCN: ");
        float height = sc.nextFloat();
        float area = width * height;
        System.out.println("Diện tích của HCN bằng: " + area);
    }
}
