package shape_and_triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh thứ nhất: ");
        double side1 = scanner.nextDouble();

        System.out.print("Nhập cạnh thứ hai: ");
        double side2 = scanner.nextDouble();

        System.out.print("Nhập cạnh thứ ba: ");
        double side3 = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Nhập màu sắc của tam giác: ");
        String color = scanner.nextLine();

        System.out.print("Tam giác có được tô màu không (true/false)? ");
        boolean filled = scanner.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println("\n--- Kết quả ---");
        System.out.println(triangle.toString());
        System.out.println("Màu sắc: " + triangle.getColor());
        System.out.println("Có tô màu không? " + triangle.isFilled());
        System.out.println("Chu vi: " + triangle.getPerimeter());
        System.out.println("Diện tích: " + triangle.getArea());
    }
}

