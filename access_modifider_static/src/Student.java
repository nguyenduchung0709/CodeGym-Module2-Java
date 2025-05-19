public class Student {
    private int rollno;
    private String name;
    private static String college = "BDDIT";

    public Student(int r, String n) {
        this.rollno = r;
        this.name = n;
    }

    static void change() {
        college = "CodeGym";
    }

    public void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111, "Hung");
        Student s2 = new Student(222, "DH");
        Student s3 = new Student(333, "NDH");
        s1.display();
        s2.display();
        s3.display();
    }
}
