package Streams;
import java.util.*;
import java.util.stream.*;
public class WordJoining {
    public static String getWord(List<String> words){
        return words.stream().collect(Collectors.joining(","));
    }

    public static void main(String[] args) {
        List<String> words=Arrays.asList("Apple","Banana","Grapes");
        System.out.println(getWord(words));
    }
}
