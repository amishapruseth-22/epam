package Streams;

import java.util.Arrays;
import java.util.List;

public class SuminParallel {
    public static long getSum(List<Integer> numbers){
        return numbers.parallelStream().mapToLong(Long::valueOf).sum();
    }

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(100,200,500,900);
        System.out.println(getSum(numbers));
    }
}
