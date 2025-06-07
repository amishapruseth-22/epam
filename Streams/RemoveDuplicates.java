package Streams;
import java.util.*;
import java.util.stream.*;
public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> numbers){
        //return numbers.stream().filter(n->Collections.frequency(numbers,n)==1).collect(Collectors.toList());
       return numbers.stream().distinct().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(2,5,2,8,4,6,3,5);
        System.out.println(removeDuplicates(numbers));
    }
}
