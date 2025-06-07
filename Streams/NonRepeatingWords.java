package Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingWords {
    public static Optional<String> firstNonRepeatingWord(List<String> words) {
//        Map<String,Long> wordCount= words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        for (Map.Entry<String,Long> word:wordCount.entrySet()) {
//            if (word.getValue() == 1) {
//                return word.getKey();
//            }
//        }
//
        Map<String,Long> wordCount= words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Optional<String> word=wordCount.entrySet().stream().filter(item->item.getValue()==1).map(Map.Entry<String,Long>::getKey).findFirst();

        return word;
    }


    public static void main(String[] args) {
        List<String> words= Arrays.asList("Apple","Banana","Apple","Orange");
        System.out.println(firstNonRepeatingWord(words));
    }
}
