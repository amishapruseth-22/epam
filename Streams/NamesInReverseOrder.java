package Streams;
import java.util.*;
import java.util.stream.*;
public class NamesInReverseOrder {
    public static List<String> getWordsListInRevrsedSortedOrder(List<String> words){
        return words.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words=Arrays.asList("Apple","banana","Cake","orange");
        System.out.println(getWordsListInRevrsedSortedOrder(words));
    }
}
