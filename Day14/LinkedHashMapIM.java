package Day14;

import java.util.LinkedHashMap;

public class LinkedHashMapIM {
    public static void main(String[] args) {
        // LinkedHashMap maintains the order of insertion
        // it is an ordered list
        // drawback is it takes more memory than HashMap
        // it is slower than HashMap because of the linked list
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(3, "Three");
        map.put(1, "One");
        map.put(2, "Two");
        System.out.println("Linked Hash Map : "+map);
    }
}
