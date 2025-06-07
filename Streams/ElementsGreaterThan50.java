package Streams;

import java.util.Arrays;
import java.util.List;

public class ElementsGreaterThan50 {
    public static List<Integer> getElementsGreaterThan50(List<Integer> numbers){
        return numbers.stream().filter(n->n>50).toList();
    }

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,30,70,50,80,90,300,500);
        System.out.println(getElementsGreaterThan50(numbers));
    }
}
