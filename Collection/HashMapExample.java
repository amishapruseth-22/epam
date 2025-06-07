package Collection;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        System.out.println(map);  // Output (Order may vary): {1=A, 2=B, 3=C}
    }
}
