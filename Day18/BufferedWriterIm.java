package Day18;

import java.io.*;

public class BufferedWriterIm {
    public static void main(String[] args){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("H1.txt"));
            writer.write("Hello World, this is a BufferedWriter example in Java.");
            writer.newLine();
            writer.write("BufferedWriter is more efficient than FileWriter for writing large amounts of data.");
            writer.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
