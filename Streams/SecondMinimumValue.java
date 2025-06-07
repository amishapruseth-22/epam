package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondMinimumValue {
    public static Optional<Integer> findSecondMinimumValue(List<Integer> numbers) {
        return numbers.stream().sorted().skip(1).findFirst();
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 7, 4, 5, 10, 3, 8, 9, 6, 1);
        System.out.println(findSecondMinimumValue(numbers));

    }

}