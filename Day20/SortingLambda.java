package Day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingLambda {
    public static void main(String[] args){
        List<String> words = new ArrayList<>();
        words.add("Banana");
        words.add("Apple");
        words.add("Cherry");
        words.add("Melon");
        // Sorting using lambda expression
        Collections.sort(words, (a, b) -> a.compareTo(b));
        System.out.println("Sorted Words: " + words);        
    }
}
