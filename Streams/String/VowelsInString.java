package Streams.String;

import java.util.Arrays;
import java.util.stream.Stream;

public class VowelsInString {
    public static void printVowels(String input){
        input.chars().mapToObj(c->(char)c).filter(c->"aeiouAEIOU".indexOf(c)!=-1).forEach(System.out::println);

    }

    public static void main(String[] args) {
        String input="Stream Example";
        printVowels(input);
    }
}
