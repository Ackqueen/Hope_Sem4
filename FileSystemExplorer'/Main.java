import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Directory dir = new Directory("root");

        while (true) {
            System.out.println("\n--- Custom File System Explorer ---");
            System.out.println("1. Create File");
            System.out.println("2. List Files (Name)");
            System.out.println("3. List Files (Size)");
            System.out.println("4. List Files (Reverse Name)");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter file name: ");
                    String name = sc.next();
                    System.out.print("Enter file size: ");
                    int size = sc.nextInt();
                    dir.addFile(name, size);
                    break;

                case 2:
                    dir.listFilesByName();
                    break;

                case 3:
                    dir.listFilesBySize();
                    break;

                case 4:
                    dir.listFilesByNameReverse();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}