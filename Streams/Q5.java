package Streams;

import java.util.Arrays;
import java.util.List;

public class Q5 {
    public static long countElements(List<Integer> numbers, int target){
        return numbers.stream().filter(x->x>target).count();
    }
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(2,6,9,10,15,20);
        int target=10;
        System.out.println(countElements(numbers,target));
    }
}
