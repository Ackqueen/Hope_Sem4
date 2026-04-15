package Day18;

import java.io.*;

public class FileWriterIm {
    public static void main(String []args){
        try{
            FileWriter writer = new FileWriter("H1.txt");
            writer.write("Hello World, this is a FileWriter example in Java.");
            
            writer.close();
            System.out.println("Successfully wrote to the file.");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}