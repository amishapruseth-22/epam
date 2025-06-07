package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestWord {
    public static Optional<String> getLongestWord(List<String> words){
        return words.stream().max(Comparator.comparing(word->word.length()));

    }

    public static void main(String[] args) {
        List<String> words= Arrays.asList("Apple","Banana","Guava","Orange","Blueberry");
        System.out.println(getLongestWord(words));
    }
}
