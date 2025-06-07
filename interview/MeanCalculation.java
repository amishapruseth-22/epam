package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MeanCalculation {
    public static Map<String,Double> calculateMean(Map<String, List<Integer>> map){
        return map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry->calculateMeanValue(entry.getValue())));
    }
    public static double calculateMeanValue(List<Integer> numbers){
        int sum=0,mean=0,n=numbers.size();
        for(int num:numbers){
            sum+=num;
        }
        mean=sum/n;
        return mean;
    }

    public static void main(String[] args) {
        Map<String, List<Integer>> marksMap = new HashMap<>();

        // Adding data to the map
        marksMap.put("Alice", Arrays.asList(85, 90, 95)); // Alice's marks
        marksMap.put("Bob", Arrays.asList(70, 75, 80));   // Bob's marks
        marksMap.put("Charlie", Arrays.asList(88, 92, 91)); // Charlie's marks
        System.out.println(calculateMean(marksMap));

    }
}
