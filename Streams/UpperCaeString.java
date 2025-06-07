package Streams;

import java.util.Arrays;
import java.util.List;

public class UpperCaeString {
    public static List<String> convertToUpperCase(List<String> words){
        return words.stream().map(String::toUpperCase).toList();
    }

    public static void main(String[] args) {
        List<String> words= Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println(convertToUpperCase(words));
    }
}
