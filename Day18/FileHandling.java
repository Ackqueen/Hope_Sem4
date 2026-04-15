package Day18;

import java.io.File;

public class FileHandling {
    public static void main(String[] args) {
        try{
            File file = new File("H1.txt");
            if(file.createNewFile()){
                System.out.println("File created: " + file.getName());
            }
            else{
                System.out.println("File exits already");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
// File handling - handling a file from a secondary storage device (like hard disk) using java programming language
// If u process it from RAM we r forced to delete that from your ram to gain the system speed
// RAM memory (Primary mem) is the one which boost the speed of yr system
// games and software are stored in hard disk and when we run it, it is loaded to RAM and then we can use it that is y when u close heavy softwares the system gets faster
// File handling files v need
    // 1.File
    // 2.File reader
    // 3. File Writer
    // 4.Buffered reader - as same as file reader but it is more efficient
    // 5.Buffer writer - it is as same as file writer but it is more efficient
