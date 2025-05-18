import java.util.Scanner;

public class RunRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều rộng của HCN: ");
        double width = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập vào chiều rộng của HCN: ");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle.display());
        System.out.println("Diện tích HCN bằng:" + rectangle.getArea());
        System.out.println("Chu vi HCN bằng:" + rectangle.getPerimeter());
    }
}
