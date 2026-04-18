package Day17;

import java.util.*;

public class RemoveIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            int val = it.next();
            if (val % 2 == 0) {
                it.remove(); // safe removal
            } else {
                System.out.println(val);
            }
        }

        System.out.println(list);
    }
}