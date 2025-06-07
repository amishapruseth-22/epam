package Streams.String;

import java.util.List;

public class FullNameToInitial {
    public static List<String> convertFullNamesToInitials(List<String> names){
        return names.stream().map(name->{
            String[] parts=name.split(" ");
            return String.join(".",
                    List.of(parts).stream().map(part->part.substring(0,1).toUpperCase()).toList())+".";
        }).toList();

    }

    public static void main(String[] args) {
        List<String> names = List.of("John Doe", "Jane Smith", "Alice Johnson");
        List<String> initials = convertFullNamesToInitials(names);
        initials.forEach(System.out::println); // Output: J.D., J.S., A.J.
    }
}
