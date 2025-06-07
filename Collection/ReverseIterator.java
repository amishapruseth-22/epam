package Collection;

import java.util.List;
import java.util.ListIterator;

public class ReverseIterator {
    public static void main(String[] args) {
        List<String> list=List.of("A","B","C","D");
        ListIterator<String> listIterator= list.listIterator(list.size());
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
