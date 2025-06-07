package Collection;

import java.util.*;

public class RemoveDup {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(4,8,10,4,7,2,9,3,2));
        Set<Integer> set=new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println(list);


    }
}
