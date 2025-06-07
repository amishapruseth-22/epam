package Streams.String;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JoiningStrings {
    public static String joinString(String[] words){
        return Arrays.stream(words).collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        String[] words = {"Hello", "world", "this", "is", "Java"};
        System.out.println(joinString(words));
    }
}
