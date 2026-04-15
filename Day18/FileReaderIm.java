package Day18;

import java.io.FileReader;

public class FileReaderIm {
    public static void main(String[] args){
        try{
            FileReader reader = new FileReader("H1.txt");
            int character;
            while((character = reader.read()) != -1){
                System.out.print((char)character);
            }
            reader.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}