package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Alia", "Grace", "Alex");
        List<String> filteredNames = names.stream().filter(x -> x.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filteredNames);
    }
}