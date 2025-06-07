package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EvenIterator {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>(Arrays.asList(2,4,5,7,10,14,17,20));
        Iterator<Integer> iterator= list.iterator();
        while (iterator.hasNext()){
            int value= iterator.next();
            if (value%2==0)
                iterator.remove();
        }
        System.out.println(list);
    }
}
