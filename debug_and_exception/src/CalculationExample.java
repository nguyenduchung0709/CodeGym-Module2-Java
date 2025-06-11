import java.util.Scanner;

public class CalculationExample {
    public static void calculate(int firstOperand, int secondOperand) {
        int sum = firstOperand + secondOperand;
        int sub = firstOperand - secondOperand;
        int mul = firstOperand * secondOperand;
        try {
            int div = firstOperand / secondOperand;
            System.out.println("The div is: " + div);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: Cannot divide by zero");
        } finally {
            System.out.println("The sum is: " + sum);
            System.out.println("The sub is: " + sub);
            System.out.println("The mul is: " + mul);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first operand: ");
        int firstOperand = input.nextInt();
        System.out.println("Enter second operand: ");
        int secondOperand = input.nextInt();

        calculate(firstOperand, secondOperand);
    }
}
