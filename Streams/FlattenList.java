package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenList {
    public static List<String> getFlattenedList(List<List<String>> list){
        return list.stream().flatMap(List::stream).toList();
    }

    public static void main(String[] args) {
        List<List<String>> list= Arrays.asList(Arrays.asList("a","b")
        ,Arrays.asList("c","d"));
        System.out.println(getFlattenedList(list));
    }
}
