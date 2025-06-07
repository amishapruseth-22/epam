package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("Alice","Bob","Grace");
        String result=words.stream()
                .collect(Collectors.joining(","));
        System.out.println(result);
    }
}
