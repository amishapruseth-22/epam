package Streams;
import java.util.*;
import java.util.stream.*;
public class StringToLength {
    public static List<Integer> getLength(List<String> words){
        return words.stream().map(String::length).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words=Arrays.asList("Apple","Banana","Orange");
        System.out.println(getLength(words));
    }
}
