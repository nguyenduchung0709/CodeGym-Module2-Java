import java.util.Scanner;
public class CalculatingBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào cân nặng của bạn(kg): ");
        double kilogram = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập vào chiều cao của bạn(meter)");
        double meter = sc.nextDouble();
        sc.nextLine();
        double bmi = kilogram / Math.pow(meter, 2);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
        System.out.println("BMI: " + bmi);
    }
}
