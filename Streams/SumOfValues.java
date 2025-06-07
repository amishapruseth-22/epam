package Streams;
import java.util.*;
import java.util.stream.*;
public class SumOfValues {
    public static long getSum(Map<String,Integer> map){
        return map.entrySet().stream().mapToLong(Map.Entry::getValue).sum();
    }

    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("ABC",90);
        map.put("DEF",80);
        System.out.println(getSum(map));
    }
}
