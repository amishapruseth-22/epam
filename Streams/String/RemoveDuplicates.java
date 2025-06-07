package Streams.String;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicates {
    public static String  removeDuplicate(String input){
         return input.chars().mapToObj(c->(char)c).distinct().map(String::valueOf).collect(Collectors.joining());
    }
    public static void main(String[] args) {
        String input = "hello world";
        System.out.println("Input String: " + input);
        System.out.println("String after removing duplicates:");
        System.out.println(removeDuplicate(input));
    }
}
