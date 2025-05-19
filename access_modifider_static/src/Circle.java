public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }

     double getRadius() {
    // private: Lỗi has private access in Circle
    // protected: Không có lỗi nào
    // default: Không có lỗi nào
        return radius;
    }
     double getArea() {
        return Math.PI * radius * radius;
    }

}
