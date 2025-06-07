package Collection;

import java.util.*;

public class ConcurrentModificationError {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String value = iterator.next();
            if (value.equals("B")) {
                list.remove(value); // Throws ConcurrentModificationException
            }
        }
        System.out.println(list);
    }
}
