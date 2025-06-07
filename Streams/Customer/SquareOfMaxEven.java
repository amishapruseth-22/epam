package Streams.Customer;

import java.util.Comparator;
import java.util.List;

public class SquareOfMaxEven {
    public static Integer square(List<Integer> numbers){
        return numbers.stream().filter(n->n%2==0).max(Comparator.comparing(Integer::intValue)).map(n->n*n).orElse(0);
    }

    public static void main(String[] args) {
        List<Integer> numbers= List.of(1,2,3,4);
        System.out.println(square(numbers));

    }
}
