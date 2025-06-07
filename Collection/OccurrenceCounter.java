package Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class OccurrenceCounter {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("apple","banana","orange","apple");
        String target="apple";
        int count=0;
        Iterator<String> iterator= list.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(target))
                count++;
        }
        System.out.println(count);
    }
}
