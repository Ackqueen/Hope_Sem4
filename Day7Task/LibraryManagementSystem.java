package Day7Task;

class LibraryItem {
    String title;
    int id;

    LibraryItem(String title, int id) {
        this.title = title;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("ID: " + id);
    }
}

class Book extends LibraryItem {
    String author;

    Book(String title, int id, String author) {
        super(title, id);
        this.author = author;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + author);
    }
}

class Magazine extends LibraryItem {
    int issueNumber;

    Magazine(String title, int id, int issueNumber) {
        super(title, id);
        this.issueNumber = issueNumber;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Issue Number: " + issueNumber);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", 101, "James Gosling");
        Magazine m1 = new Magazine("Tech Monthly", 202, 45);

        System.out.println("Book Details");
        b1.displayInfo();

        System.out.println("Magazine Details");
        m1.displayInfo();
    }
}