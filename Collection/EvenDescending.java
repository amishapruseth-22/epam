package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EvenDescending {
    public static List<Integer> getEvenDescendingList(List<Integer> list){
        return list.stream().filter(num->num%2==0).sorted(Comparator.reverseOrder()).toList();
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(3,2,8,5,9,10,12,4));
        System.out.println(getEvenDescendingList(list));

    }
}
