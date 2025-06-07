package Streams.String;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringToUpperCase {
    public static void printInUpperCase(String input){
        Stream.of(input).map(String::toUpperCase).forEach(System.out::println);
    }
    public static void main(String[] args) {
        String input = "hello world";
        printInUpperCase(input);
    }
}
