package sorting_homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.getAge() > s2.getAge() ) {
            return 1;
        } else if (s1.getAge() == s2.getAge()) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Long", 70, "IJ");
        Student student2 = new Student("Tuyen", 65, "OI");
        Student student3 = new Student("Linh", 45, "IU");

        List<Student> list = new ArrayList<Student>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        for (Student st : list) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list, ageComparator);
        System.out.println("Compare age: ");
        for (Student st : list) {
            System.out.println(st.toString());
        }
    }
}
