package HashMAp;

import java.util.*;

public class MapQuestion {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ABC", "ABD", "DEF");
        Map<Character, List<String>> map = new HashMap<>();
        char k;

        for (String name : names) {
            k = name.charAt(0);
            k = Character.toUpperCase(k);
            String m = k + "";
            List<String> namee = null;
            if (name.startsWith(m)) {
                namee = map.getOrDefault(k,new ArrayList<>());
                namee.add(name);
                map.put(k, namee);
            }



        }
        System.out.println(map);
    }
}
