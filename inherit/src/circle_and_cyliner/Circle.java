package circle_and_cyliner;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 2.0;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "Class Circle has radius = " + radius + " and color = " + color;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5.0);
        circle.setColor("White");
        System.out.println("Màu sắc của hình tròn : " + circle.getColor());
        System.out.println("Bán kính của hình tròn: " + circle.getRadius());
        System.out.println("Diện tích của hình tròn: " + circle.getArea());
        System.out.println("Chu vi hình tròn: " + circle.getPerimeter());
        System.out.println(circle);
    }
}
