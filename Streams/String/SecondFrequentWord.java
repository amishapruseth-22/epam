package Streams.String;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondFrequentWord {
    public static Optional<String> findSecondFrequentWord(List<String> words){
        return words.stream().collect(Collectors.groupingBy(String::length)).entrySet().stream().map(Map.Entry::getValue).distinct().flatMap(List::stream).skip(1).findFirst();

    }

    public static void main(String[] args) {
        List<String> words=List.of("AAAAA","BBBBB","CCCC","DD");
        System.out.println(findSecondFrequentWord(words));
    }
}
