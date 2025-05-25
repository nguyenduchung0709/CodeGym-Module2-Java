package practice_shape;

public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (filled) {
            return "A shape with color of " + color + " and filled ";
        }
        else {
            return "A shape without color of " + color + " and not filled";
        }
    }

//    public static void main(String[] args) {
//        shape_and_triangle.Shape shape = new shape_and_triangle.Shape();
//        System.out.println(shape);
//
//        shape = new shape_and_triangle.Shape("red", false);
//        System.out.println(shape);
//    }
}
