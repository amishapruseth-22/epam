package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetElements {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(2);
        set.add(6);
        set.add(5);
        set.add(3);
        set.add(2);
        set.add(10);
        set.add(6);
        Iterator<Integer> iterator= set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
