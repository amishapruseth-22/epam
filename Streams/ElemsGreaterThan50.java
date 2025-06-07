package Streams;

import java.util.Arrays;
import java.util.List;

public class ElemsGreaterThan50 {
    public static long countElementsGreaterThan50(List<Long> numbers){
        return numbers.stream().mapToLong(n->n).filter(n->n>50).count();
    }

    public static void main(String[] args) {
        List<Long> numbers= Arrays.asList(10L,30L,70L,50L,80L,90L,300L,500L);
        System.out.println(countElementsGreaterThan50(numbers));
    }
}
