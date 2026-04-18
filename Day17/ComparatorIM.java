package Day17;

import java.util.*;

class Student {
    int rollno;
    int age;
    double mark;

    Student(int rollno, int age, double mark) {
        this.rollno = rollno;
        this.age = age;
        this.mark = mark;
    }

    public String toString() {
        return "Rollno: " + rollno + " Age: " + age + " Mark: " + mark;
    }
}

public class ComparatorIM {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(3, 20, 85.5));
        students.add(new Student(1, 22, 60.0));
        students.add(new Student(2, 21, 98.0));
        students.add(new Student(4, 20, 90.0));

        students.sort(
            Comparator.comparingInt((Student s) -> s.age)
                      .thenComparingDouble(s -> -s.mark)
                      .thenComparingInt(s -> s.rollno)
        );

        for (Student s : students) {
            System.out.println(s);
        }
    }
}