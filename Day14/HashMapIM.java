package Day14;

import java.util.HashMap;
import java.util.Map;

public class HashMapIM {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        //map.get("hello");
        System.out.println(map);
        
        map.put("hello", 5);
        map.put("world", 10);
        map.put("java", 15);
        System.out.println(map);

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
