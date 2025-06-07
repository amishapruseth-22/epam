package Collection;

import java.util.Iterator;
import java.util.List;

public class WordIterator {
    public static void main(String[] args) {
        List<String> list=List.of("AWS","Java","Jira");
        Iterator<String> iterator= list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
