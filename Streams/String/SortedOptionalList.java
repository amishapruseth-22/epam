package Streams.String;

import java.util.List;
import java.util.Optional;

public class SortedOptionalList {
    public static List<String> sortOptionalList(List<Optional<String>> optionalList){
        return optionalList.stream().filter(Optional::isPresent).map(Optional::get).sorted().toList();
    }

    public static void main(String[] args) {
        List<Optional<String>> optionalList = List.of(
                Optional.of("apple"),
                Optional.empty(),
                Optional.of("banana"),
                Optional.of("cherry"),
                Optional.empty()
        );
        System.out.println(sortOptionalList(optionalList));
    }
}
