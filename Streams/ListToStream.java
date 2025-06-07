package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListToStream {
    public static void convertListToStream(List<Integer> numbers){
         numbers.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,20,30,70,50,60);
        convertListToStream(numbers);
    }
}
