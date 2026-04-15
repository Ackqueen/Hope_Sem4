package Day18;

import java.io.*;

public class BufferReaderIm {
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("H1.txt"));
            String line;
            while(reader.ready()){
                System.out.println(reader.readLine());
            }
            reader.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
