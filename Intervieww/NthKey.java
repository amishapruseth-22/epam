package Intervieww;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static javax.swing.UIManager.put;

public class NthKey {
    public static List<String> returnNthHighestKeys(HashMap<String,Integer> map) {
        Map<Integer, Long> frequencies = map.values()
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Optional<Map.Entry<Integer, Long>> first = frequencies.entrySet()
                .stream()
                .sorted((a, b) -> Math.toIntExact(b.getValue() - a.getValue()))
                .skip(1)
                .findFirst();
        System.out.println(first);

        return map.entrySet()
                .stream()
                .filter(e->e.getValue()==first.get().getKey())
                .map(Map.Entry::getKey).toList();
    }

        public static void main (String[]args){
            HashMap<String, Integer> map = new HashMap<>();
            int k = 2;
            map.put("AB", 1);
            map.put("AC", 2);
            map.put("AD", 3);
            map.put("AE", 3);
            map.put("AF", 1);
            map.put("AG", 1);
            System.out.println(returnNthHighestKeys(map));
        }
    }



