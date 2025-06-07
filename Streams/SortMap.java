package Streams;
import java.util.*;
import java.util.stream.*;
public class SortMap {
    public static Map<String, Integer> sortMap(Map<String, Integer> map) {
        return map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

}
