package Streams;

import java.util.*;
import java.util.stream.*;
public class OddSquareSum{
    public static void main(String[] args){
        List<List<Integer>> numbers=Arrays.asList(Arrays.asList(3,6,9),Arrays.asList(2,7,5));
        int sum=numbers.stream()
                .flatMap(List::stream)
                .filter(n->n%2!=0)
                .map(n->n*n)
                .reduce(0,Integer::sum);
        System.out.println(sum);
    }
}