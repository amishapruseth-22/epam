package Streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AveragePerSubject {
    public static Map<String,Double> getAveragePerSubject(List<Map<String,Double>> marks) {
        return marks.stream().flatMap(map->map.entrySet().stream()).collect(Collectors.groupingBy(Map.Entry::getKey,Collectors.averagingDouble(Map.Entry::getValue)));
    }

    public static void main(String[] args) {
        List<Map<String,Double>> marks = List.of(
                Map.of("Math", 90.0, "Science", 80.0),
                Map.of("Math", 70.0, "Science", 60.0),
                Map.of("Math", 80.0, "Science", 70.0)
        );

        System.out.println(getAveragePerSubject(marks)); // Output: {Math=80.0, Science=70.0}
    }
}
