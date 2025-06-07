package Streams;
import java.util.*;
import java.util.stream.*;
public class KeyPrint {
    public static List<String> getKeys(Map<String,Integer> map){
        return map.keySet().stream().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("ABC",1);
        map.put("DEF",2);
        System.out.println(getKeys(map));
    }
}
