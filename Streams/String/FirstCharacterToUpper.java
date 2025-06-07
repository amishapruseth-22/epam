package Streams.String;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstCharacterToUpper {
    public static String firstCharacterToUpper(String input) {
        return Stream.of(input).map(i -> i.substring(0, 1).toUpperCase() + i.substring(1))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String s="this is a test string";
        System.out.println(firstCharacterToUpper(s));
    }
}
