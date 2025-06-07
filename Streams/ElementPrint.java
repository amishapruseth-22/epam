package Streams;
import java.util.*;
import java.util.stream.*;
public class ElementPrint {
    public static List<Integer> printElementList(List<List<Integer>> numbers){
        return numbers.stream().flatMap(List::stream).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<List<Integer>> numbers=Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4));
        System.out.println(printElementList(numbers));
    }
}
