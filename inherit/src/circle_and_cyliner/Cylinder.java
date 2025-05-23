package circle_and_cyliner;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder() {
        this.height = 2.0;

    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSurroundingArea() {
        return 2 * Math.PI * getRadius() * height;
    }

    public double getAreaOfTwoBases() {
        return 2 * Math.PI * getRadius() * getRadius();
    }

    public double getTotalArea() {
        return getAreaOfTwoBases() + getSurroundingArea();
    }

    public double getVolume() {
        return Math.PI * getRadius() * getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cylinder has " + height + " meters and " + getColor() + " which is sublass of " + super.toString()  ;
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(5);
        cylinder.setHeight(7);
        System.out.println("Surrounding Area of Cylinder: " + cylinder.getSurroundingArea());
        System.out.println("Area Of Two Bases " + cylinder.getAreaOfTwoBases());
        System.out.println("Total Area of Cylinder: " + cylinder.getTotalArea());
        System.out.println("Volume of Cylinder: " + cylinder.getVolume());
        System.out.println(cylinder);
    }
}
