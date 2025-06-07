package Streams;
import java.util.*;
import java.util.stream.*;
public class EvenAndOdd {
    public static Map<Boolean,List<Integer>> getEvenAndOdd(List<Integer> numbers){
        return numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));
    }

    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(2,6,9,5,3,10);
        System.out.println(getEvenAndOdd(numbers));
    }
}
