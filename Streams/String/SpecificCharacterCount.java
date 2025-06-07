package Streams.String;

import java.util.Map;
import java.util.stream.Collectors;

public class SpecificCharacterCount {
    public static Map<Character,Long> countCharacters(String input){
        return input.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(c->c,Collectors.counting()));

    }

    public static void main(String[] args) {
        String input="Stream API is amazing";
        System.out.println(countCharacters(input));
    }
}
