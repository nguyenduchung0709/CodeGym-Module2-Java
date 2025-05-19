package p1;

public class Student {
    private String name = "John";
    private String classes = "CO2";

    public Student() {
    }

     void setName(String name) {
         // private: Lỗi has private access
         // protected: Không có lỗi nào
         // default: Không có lỗi
        this.name = name;
    }

     void setClasses(String classes) {
        // private: Lỗi has private access
        // protected: Không có lỗi nào
        // default: Không có lỗi
        this.classes = classes;
    }
    public void print() {
        System.out.println("Tên: " + name);
        System.out.println("Lớp: " + classes);
    }
}
