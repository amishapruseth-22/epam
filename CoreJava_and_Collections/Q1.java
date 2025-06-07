package CoreJava_and_Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Q1 {
    public static Character firstNonRepeatingCharacter(String s) {
        Map<Character,Integer> count=new LinkedHashMap<>();
        for (char c:s.toCharArray()){
            count.put(c,count.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character,Integer> entry: count.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String s="maria";
        System.out.println(firstNonRepeatingCharacter(s));
    }

}
