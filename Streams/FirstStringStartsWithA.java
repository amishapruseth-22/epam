package Streams;
import java.util.*;
import java.util.stream.*;
public class FirstStringStartsWithA {
    public static Optional<String> getFirstStringStartsWithA(List<String> words){
        return words.stream().filter(s->s.startsWith("A")).findFirst();
    }

    public static void main(String[] args) {
        List<String> words=Arrays.asList("Ashima","Niroj","Aliva","Aditya","Amisha");
        System.out.println(getFirstStringStartsWithA(words));
    }
}
