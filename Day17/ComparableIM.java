package Day17;

import java.util.*;

class Student implements Comparable<Student> {
    int rollno;
    String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        // Case-insensitive alphabetical order
        return this.name.compareToIgnoreCase(s.name);

        // Other options:
        // return s.name.compareToIgnoreCase(this.name); // Z to A
        // return this.rollno - s.rollno; // ascending rollno
        // return s.rollno - this.rollno; // descending rollno
    }

    @Override
    public String toString() {
        return rollno + " " + name;
    }
}

public class ComparableIM {
    public static void main(String[] args) {
        List<Student> l = new ArrayList<>();

        l.add(new Student(10, "john"));
        l.add(new Student(5, "alice"));
        l.add(new Student(16, "Bob"));
        l.add(new Student(3, "Chef"));

        Collections.sort(l);

        for (Student s : l) {
            System.out.println(s);
        }
    }
}