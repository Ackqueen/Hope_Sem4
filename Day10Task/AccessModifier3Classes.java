package Day10Task;

class Person {
    
    String name = "Ackqueen";
    protected int age = 20;
    private String phoneNum = "1234567890";
    public String college = "St.Joseph's College of Engineering";

    public void showPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
        System.out.println("Phone Number (private): " + phoneNum);
    }
}

class Student extends Person {
    public void showStudent() {
        System.out.println("Student Name: " + name); // default
        System.out.println("Age: " + age);           // protected
        System.out.println("College: " + college);   // public
      //System.out.println("Phone Number: " + phoneNum); // private therefore not accessible
    }
}

interface Coder {
    void writesCode();
}

interface Manager {
    void TeamManagement();
}

public class AccessModifier3Classes extends Student implements Coder, Manager{

    public void writesCode() {
        System.out.println("Writing scalable backend code");
    }

    public void TeamManagement() {
        System.out.println("Managing team and tasks");
    }

    public static void main(String[] args) {
        AccessModifier3Classes obj = new AccessModifier3Classes();

        obj.showPerson();
        obj.showStudent();
        obj.writesCode();
        obj.TeamManagement();
    }
}