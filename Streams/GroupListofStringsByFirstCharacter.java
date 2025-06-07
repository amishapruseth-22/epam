package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupListofStringsByFirstCharacter {
    public static Map<Character,List<String>> getListofStrings(List<String> words){
        return words.stream().collect(Collectors.groupingBy(e->e.charAt(0)));
    }

    public static void main(String[] args) {
        List<String> words= Arrays.asList("Apple","Avocado","Banana","Bat","Cat","Cow");
        System.out.println(getListofStrings(words));
    }
}
