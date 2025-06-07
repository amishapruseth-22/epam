package Streams.String;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MostFrequentWordByLength {
    public static void main(String[] args) {

//        List<String> words = List.of("aaaaa", "bbbbb", "ccc", "aaaaa", "bb", "aa", "bb");
//        //5:aaaaa,bbbbb bbbbb
//        //3 : ccc
//        //2 : bb,aa
//
//        Map<Integer, Optional<Map.Entry<String, Long>>> collect = words.stream()
//                .collect(Collectors
//                        .groupingBy(a -> a.length(),
//                                Collectors.collectingAndThen(Collectors.toList(), list -> list.stream()
//                                        .collect(Collectors.groupingBy(a -> a, Collectors.counting())).entrySet().stream()
//                                        .max(Comparator.comparingLong(Map.Entry::getValue)).map(entry->entry.getValue())
//                                        )));
//
//        System.out.println(collect);
//    }
        String str = "mm aa mm mm mm aa aa aa aa a aa aa aa b b ";

        Map<Integer, String> map = Stream.of(str.split(" "))
                .collect(Collectors.groupingBy(String::length, Collectors.collectingAndThen(Collectors.toList(),
                        list1 -> list1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                                .entrySet().stream().max(Comparator.comparingLong(Map.Entry::getValue))
                                .map(Map.Entry::getKey).get())));
        System.out.println(map);
    }
}