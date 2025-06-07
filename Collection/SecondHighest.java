package Collection;

import java.util.*;

public class SecondHighest {
    public static Optional<Integer> getSecondHighest(List<Integer> list){
        return list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(4,7,2,9,5,8));
        System.out.println(getSecondHighest(list));
    }
}
