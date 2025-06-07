package Streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ValueGreaterThan10 {
    public static Map<Integer,Integer> getValueGreaterThan10(Map<Integer,Integer> map){
        return map.entrySet().stream().filter(e->e.getValue()>10).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
    }

    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(1,10);
        map.put(2,20);
        map.put(3,30);
        System.out.println(getValueGreaterThan10(map));

    }
}
