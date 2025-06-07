package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicates {
    public static List<Integer> findDuplicates(List<Integer> nums){
        return nums.stream().filter(n->Collections.frequency(nums,n)>1).distinct().toList();
    }

    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(2,5,3,2,8,6,5);
        System.out.println(findDuplicates(nums));
    }
}
