package Streams;
import java.util.*;
import java.util.stream.*;
public class MapAfterSomeCondition {
    public static Map<String,Integer> getNewMap(Map<String,Integer> map){
        return map.entrySet().stream().filter(e->e.getValue()<50)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
    }

    public static void main(String[] args) {

    }
}
