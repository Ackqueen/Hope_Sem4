import java.time.LocalDateTime;

public class FileItem implements Comparable<FileItem> {
    String name;
    int size;
    LocalDateTime createdTime;

    public FileItem(String name, int size) {
        this.name = name;
        this.size = size;
        this.createdTime = LocalDateTime.now();
    }

    @Override
    public int compareTo(FileItem other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " (Size: " + size + ")";
    }
}