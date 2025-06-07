package Streams.String;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestStringStartWithZ {
    public static Optional<String> findLongestWordStartsWithZ(List<String> words){
        return words.stream().filter(e->e.startsWith("Z")).max(Comparator.comparing(String::length));
    }

    public static void main(String[] args) {
        List<String> words = List.of("Zebra", "Zucchini", "Zigzag", "Zestful", "Zealous", "Zany","Apple", "Banana", "Cherry");
        System.out.println(findLongestWordStartsWithZ(words));
    }
}
