package Streams;

import java.util.Arrays;
import java.util.List;

public class RemDup {
    public static List<Integer> removeDuplicates(List<Integer> list){
        return list.stream().distinct().toList();
    }

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(3,7,8,3,5,9,8,10,5,90,80);
        System.out.println(removeDuplicates(list));
    }
}
