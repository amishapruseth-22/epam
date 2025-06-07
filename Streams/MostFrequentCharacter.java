package Streams;

import java.util.Map;
import java.util.stream.Collectors;

public class MostFrequentCharacter {
    public static char getMostFrequentCharacterinString(String input){
        return input.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }
    public static void main(String[] args){
        String input="alio-oleo";
        System.out.println(getMostFrequentCharacterinString(input));
    }
}
