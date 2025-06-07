package Streams;

import java.util.Map;
import java.util.stream.Collectors;

public class ReverseKeysAndValues {
    public static Map<String,String> reverseKeysAndValues(Map<String,String> map){
        return map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue,Map.Entry::getKey));
    }

    public static void main(String[] args) {
        Map<String, String> ls = Map.of(
                "A", "1",
                "B", "2",
                "C", "3"
        );
        System.out.println(reverseKeysAndValues(ls));
    }
}
