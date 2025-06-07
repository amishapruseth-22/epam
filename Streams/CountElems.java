package Streams;
import java.util.*;
import java.util.*;
import java.util.stream.Collectors;

public class CountElems {
    public static long countElementsGreaterThanFive(List<Integer> numbers){
        return numbers.stream().filter(n->n>5).count();
    }

    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(2,8,10,12,20);
        System.out.println(countElementsGreaterThanFive(numbers));
    }
}
