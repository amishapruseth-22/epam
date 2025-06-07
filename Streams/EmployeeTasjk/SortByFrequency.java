package Streams.EmployeeTasjk;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByFrequency {
    public static List<String> sortByFrequency(List<String> list, Map<String,Integer> frequencyMap){
        return list.stream().distinct().sorted(Comparator.comparingInt(word-> frequencyMap.getOrDefault(word,0)))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry", "apple", "date", "egg");

        Map<String, Integer> frequencyMap = Map.of(
                "apple", 4,
                "banana", 2,
                "cherry", 6,
                "date", 1
        );
        System.out.println(sortByFrequency(words, frequencyMap));
    }
}
