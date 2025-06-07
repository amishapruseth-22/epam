package Collection;

import java.util.List;
import java.util.stream.*;
public class UniqueSum {
    public long getSum(List<List<Integer>> numbers){
        return numbers.stream().flatMap(List::stream).filter(n->n%2!=0).distinct().mapToInt(n->n*n).sum();
    }
}
