package Streams;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {
    public static Map<String,Long> getWordCount(String sentence){
        return Arrays.stream(sentence.split(" ")).
                collect(Collectors.groupingBy(word->word,Collectors.counting()));
    }
    public static void main(String[] args){
        String sentence="Apple Banana Apple Orange Kiwi";
        System.out.println(getWordCount(sentence));
    }
}
