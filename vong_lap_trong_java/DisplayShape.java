import java.util.Scanner;

public class DisplayShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 4) {
            System.out.println("1. Hiển thị hình chữ nhật: ");
            System.out.println("2. Hiển thị hình tam giác vuông: ");
            System.out.println("1. Hiển thị hình tam giác cân: ");
            System.out.println("4. Exit....");

            System.out.println("Nhập vào lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Hiển thị hình chữ nhật: ");
                    for (int i = 0; i < 3; i++) {
                        System.out.println("**********");
                    }
                    break;
                case 2:
                    System.out.println("2. Hiển thị các tam giác vuông: ");
                    System.out.println();
                    System.out.println(" Góc vuông dưới trái: ");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    System.out.println("Góc vuông dưới phải: ");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    System.out.println("Góc vuông trên trái: ");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    System.out.println("Góc vuông trên phải: ");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= 5 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Hiển thị tam giác cân: ");
                    for (int i = 1; i <= 5; i++) {

                        for (int j = 1; j <= 5 - i; j++) {
                            System.out.print(" ");
                        }

                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }

                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Exiting....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice selected");
            }
        }


    }
}
