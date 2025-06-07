package Streams.String;

public class SortString {
    public static void sortString(String input){
        input.chars().sorted().mapToObj(c->(char)c).forEach(System.out::println);
    }

    public static void main(String[] args) {
        String input="Amisha";
        sortString(input);
    }
}
