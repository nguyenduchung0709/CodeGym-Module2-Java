import java.util.Scanner;
public class DesignMenu {
    public static void main(String[] args) {
        int choice = -1;
        while(choice != 0 ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("=====Welcome to the Design Menu=====");
            System.out.println();
            System.out.println("--1 Vẽ hình tam giác");
            System.out.println("--2 Vẽ hình chữ nhật");
            System.out.println("--3 vẽ hình vuông");
            System.out.println("--0 Thoát ");
            System.out.println();
            System.out.println("Nhập vào lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Vẽ hình tam giác");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Vẽ hình chữ nhật");
                    System.out.println("***********");
                    System.out.println("***********");
                    System.out.println("***********");
                    System.out.println("***********");
                    break;
                case 3:
                    System.out.println("Vẽ hình vuông");
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    break;
                case 0:
                    System.out.println("Đang thoát");
                    System.exit(0);
                default:
                    System.out.println("No choice");
                    break;

            }
        }
    }
}
