package Streams;
import java.util.*;
import java.util.stream.*;
public class CommonElement {
    public static Set<Integer> getCommonElementInTwoList(List<Integer> list1,List<Integer> list2){
        return list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toSet());

    }

    public static void main(String[] args) {
        List<Integer> list1=Arrays.asList(2,4,5,7,6,9);
        List<Integer> list2=Arrays.asList(6,8,9,2,5,11);
        System.out.println(getCommonElementInTwoList(list1,list2));
    }
}
