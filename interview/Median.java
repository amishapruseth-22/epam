package interview;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Median {
    public static Map<String,Integer> calculateMedian(Map<String, List<Integer>> numbers){
        return  numbers.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,entry->calculateMedian(entry.getValue())));
    }
    public static int calculateMedian(List<Integer> numbers){
        int n=numbers.size();
        if(n%2==1){
            return numbers.get(n/2);
        }
        else{
            return numbers.get((((n/2)-1)+(n/2))/2);
        }
    }

    public static void main(String[] args) {
        Map<String, List<Integer>> numbers = Map.of(
                "a", List.of(1, 2, 3, 4, 5),
                "b", List.of(1, 2, 3, 4, 5, 6)
        );

        Map<String, Integer> medians = calculateMedian(numbers);
        System.out.println(medians); // Output: {a=3, b=3}
    }
}
