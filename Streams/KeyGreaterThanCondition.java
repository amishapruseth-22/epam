package Streams;
import java.util.*;
import java.util.stream.*;
public class KeyGreaterThanCondition {
    public static List<String> getKeyAsperCondition(Map<String,Double> students){
        return students.entrySet().stream().filter(n->n.getValue()>9.1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Map<String,Double> map=new HashMap<>();
        map.put("Alice",9.4);
        map.put("Bob",9.0);
        map.put("Charlie",9.2);
        System.out.println(getKeyAsperCondition(map));
    }
}
