package Streams.String;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SplitStringToWords {
    public static void splitWords(String input){
        Arrays.stream(input.split(" ")).forEach(System.out::println);
    }

    public static void main(String[] args) {
        String input="Java is fun to learn";
        splitWords(input);
    }
}
