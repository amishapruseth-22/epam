package HashMAp;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static char firstNonRepeatingCharacter(String word){
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for(char c:word.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        for (char c:word.toCharArray()){
            if(frequencyMap.get(c)==1){
                return c;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String word="hhello";
        System.out.println(firstNonRepeatingCharacter(word));
    }
}
