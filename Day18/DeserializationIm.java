package Day18;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name;
}
public class DeserializationIm {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s1 = (Student) ois.readObject(); // deserialize
            ois.close();
            fis.close();
            System.out.println("ID: " + s1.id);
            System.out.println("Name: " + s1.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}