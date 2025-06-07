package Streams.EmployeeTasjk;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumInValues {
    public static Map<String,Long> sumInValues(Map<String, List<Integer>> map) {
        return map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,
                e -> e.getValue().stream().mapToLong(Integer::intValue).sum()));
    }

    public static void main(String[] args) {
        Map<String, List<Integer>> ls = Map.of(
                "A", List.of(1, 2, 3),
                "B", List.of(4, 5, 6, 7),
                "C", List.of()
        );
        System.out.println(sumInValues(ls));
    }

}
