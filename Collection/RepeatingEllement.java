package Collection;

import java.util.*;

public class RepeatingEllement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 6, 2, 8, 9, 6, 5);
        System.out.println(firstRpeatingElement(list));
    }
        public static int firstRpeatingElement(List<Integer> list){
        Iterator<Integer> iterator= list.iterator();
        Set<Integer> set=new HashSet<>();
        while (iterator.hasNext()){
            int number= iterator.next();
            if(set.contains(number))
                return number;
            set.add(number);
            }
        return -1;


    }
}
