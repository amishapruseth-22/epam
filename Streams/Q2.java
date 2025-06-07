package Streams;

import java.util.*;
import java.util.stream.*;
public class Q2
{
    public static void main(String[] args){
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,4);
        int result=numbers.stream().reduce(0,Integer::sum);
        System.out.println(result);
    }
}