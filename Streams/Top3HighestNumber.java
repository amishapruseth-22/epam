package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Top3HighestNumber {
    public static List<Integer> getTopThreeHighestNumberFromList(List<Integer> numbers){
        return numbers.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(2,8,9,4,7,5);
        System.out.println(getTopThreeHighestNumberFromList(numbers));
    }
}
