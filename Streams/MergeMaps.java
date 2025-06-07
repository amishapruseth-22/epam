package Streams;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeMaps {
    public static Map<String,Integer> mergeMaps(Map<String,Integer> map1,Map<String,Integer> map2){
        return Stream.of(map1,map2).flatMap(map-> map.entrySet().stream()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,Integer::sum));

    }

    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("apple", 2, "banana", 3);
        Map<String, Integer> map2 = Map.of("apple", 4, "cherry", 5);
        System.out.println(mergeMaps(map1,map2));
    }
}
