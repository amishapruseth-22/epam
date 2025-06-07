package Streams;

import java.util.Arrays;
import java.util.List;

public class StringToUpperCase {
    public static List<String> getUpperCaseString(List<String> words){
        return words.stream().map(String::toUpperCase).toList();
    }

    public static void main(String[] args) {
        List<String> words= Arrays.asList("apple","banana");
        System.out.println(getUpperCaseString(words));
    }
}
