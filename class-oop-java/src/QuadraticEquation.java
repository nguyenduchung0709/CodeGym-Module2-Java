public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public Double getRoot1() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return null;
        }
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public Double getRoot2() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return null;
        }
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
}
