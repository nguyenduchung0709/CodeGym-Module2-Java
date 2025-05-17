import java.util.Scanner;

public class ConvertingTempature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        int choice = -1;
        do {
            System.out.println("======Welcome=======");
            System.out.println("1. Celius Convert To Fahrenheit");
            System.out.println("2. Fahrenheit Convert To Celsius");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Nhập độ C");
                celsius = sc.nextDouble();
                System.out.println("Độ C chuyển sang độ F: " + celsiusToFahrenheit(celsius));
                break;
            }
            case 2: {
                System.out.println("Nhập độ F");
                fahrenheit = sc.nextDouble();
                System.out.println("Độ F chuyển sang độ C: " + fahrenheitToCelsius(fahrenheit));
                break;
            }
            case 3: {
                System.exit(0);
                }
            }
        } while (choice != 3);

    }


    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
}
