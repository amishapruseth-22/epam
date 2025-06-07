package Streams;

import java.util.Arrays;
import java.util.List;

public class SquareAndFilterOdd {
    public static List<Integer> squareAndFilterOdd(List<Integer> numbers){
        return numbers.stream().map(n->n*n).filter(n->n%2!=0).toList();
    }

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(2,5,8,6,9,3,4);
        System.out.println(squareAndFilterOdd(numbers));
    }
}
