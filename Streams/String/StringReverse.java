package Streams.String;

import java.util.Arrays;

public class StringReverse {
    public static String reverseString(String input){
        return Arrays.stream(input.split("")).reduce((a,b)->b+a).orElse("");
    }

    public static void main(String[] args) {
        String input="Amisha";
        System.out.println(reverseString(input));

    }
}
