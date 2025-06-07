package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumGreaterThan30 {
    public static Map<Boolean,List<Integer>> getResult(List<Integer> list){
        int sum=list.stream().distinct().mapToInt(Integer::intValue).sum();
        return list.stream().distinct().collect(Collectors.groupingBy(a->sum==30));

    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(10,20,10,40,5,15));
        System.out.println(getResult(list));

    }
}
