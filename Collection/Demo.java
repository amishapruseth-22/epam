package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list=List.of(2,15,90,5,4,7,9,10,12);
        Iterator<Integer> iterator=list.iterator();
        while (iterator.hasNext()){
            int value= iterator.next();
            if (value<10){
                System.out.println(value);
            }
        }
    }
}
