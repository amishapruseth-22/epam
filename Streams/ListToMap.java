package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public static Map<Character,List<String>> convertListToMap(List<String> names){
        return names.stream().collect(Collectors.groupingBy(name->name.charAt(0),Collectors.toList()));
    }

    public static void main(String[] args) {
        List<String> names= Arrays.asList("ABC","ADE","DEF");
        System.out.println(convertListToMap(names));
    }
}
