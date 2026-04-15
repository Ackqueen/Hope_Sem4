import java.util.*;

public class Directory {
    String name;
    List<FileItem> files;

    public Directory(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }
    public void addFile(String name, int size) {
        files.add(new FileItem(name, size));
    }

    public void listFilesByName() {
        Collections.sort(files);
        System.out.println("\nFiles sorted by NAME:");
        for (FileItem f : files) {
            System.out.println(f);
        }
    }

    public void listFilesBySize() {
        files.sort((a, b) -> Integer.compare(a.size, b.size));
        System.out.println("\nFiles sorted by SIZE:");
        for (FileItem f : files) {
            System.out.println(f);
        }
    }

    public void listFilesByNameReverse() {
        files.sort((a, b) -> b.name.compareTo(a.name));
        System.out.println("\nFiles sorted by NAME (Reverse):");
        for (FileItem f : files) {
            System.out.println(f);
        }
    }
}