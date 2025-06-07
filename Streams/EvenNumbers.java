package Streams;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream().filter(n->n%2==0).toList();
    }

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(2,5,4,78,4,97,72,56,6,7,97,33);
        System.out.println(filterEvenNumbers(numbers));
    }
}
