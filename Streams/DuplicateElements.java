package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static Set<Integer> getDuplicateElements(List<Integer> numbers) {
        return numbers.stream().filter(n -> Collections.frequency(numbers, n) > 1).collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(2,5,6,8,2,5,9);
        System.out.println(getDuplicateElements(numbers));
    }
}
