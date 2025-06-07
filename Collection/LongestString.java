package Collection;

import java.util.*;

public class LongestString {
    public static Optional<String> getLongestWord(List<String> list){
        return list.stream().max(Comparator.comparing(String::length));
    }

    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("apple","banana","grapes"));
        System.out.println(getLongestWord(list));

    }
}
