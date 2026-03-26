class Student{
    String name;
    int roll;
    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    void display(){
        System.out.println("String  name = " + name);
        System.out.println("int roll = " + roll);
    }
}
public class ThisKeyWord {
    public static void main(String[] args) {
        Student s1 = new Student("Ackqueen",1);
        Student s2 = new Student("Ackqueen",1);
        Student s3 = new Student("Ackqueen",1);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        s1.display();
        s2.display();
        s3.display();
    }
}
