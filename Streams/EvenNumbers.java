package Streams;

import java.util.List;
import java.util.*;
import java.util.stream.*;
public class EvenNumbers {
    public static List<Integer> getEvenNumbers(List<Integer> numbers){
        return numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(5,3,2,8,6);
        System.out.println(getEvenNumbers(numbers));
    }
}
