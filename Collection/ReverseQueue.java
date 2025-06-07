package Collection;

import java.util.Queue;

public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> queue){
        if (queue.isEmpty()) return;
        int front= queue.poll();
        reverseQueue(queue);
        queue.offer(front);

    }
}
