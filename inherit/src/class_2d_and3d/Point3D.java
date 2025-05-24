package class_2d_and3d;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }

    public static void main(String[] args) {

        Point3D p = new Point3D(3.0f, 4.0f, 5.0f);
        System.out.println(p);
    }
}
