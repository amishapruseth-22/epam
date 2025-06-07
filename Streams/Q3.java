package Streams;

import java.util.*;
import java.util.stream.*;
public class Q3{
    public static void main(String[] args)
    {
        List<String> names=Arrays.asList("Ali","Bob","Alice","Grace","Stephen");
        Map<Integer,List<String>> filtered=names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(filtered);
    }
}
