package Streams;
import java.util.*;
import java.util.stream.*;
public class StringAndLength {
    public static Map<String,Integer> getStringAndLength(List<String> words){
        return words.stream().collect(Collectors.toMap(w->w,String::length));
    }

    public static void main(String[] args) {
        List<String> words=Arrays.asList("Apple","Banana","Orange","Guava");
        System.out.println(getStringAndLength(words));
    }
}
