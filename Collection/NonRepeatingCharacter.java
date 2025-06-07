package Collection;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class NonRepeatingCharacter {
    public static char firstNonRepeatingChar(String str) {
        Map<Character, Integer> countMap = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();

        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
            queue.offer(c);
            while (!queue.isEmpty() && countMap.get(queue.peek()) > 1) {
                queue.poll();
            }
        }
        return queue.isEmpty() ? '#' : queue.peek();
    }
}
