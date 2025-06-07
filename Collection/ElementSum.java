package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementSum {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(2,3,6,9));
        System.out.println(getSum(list));

    }
    public static int getSum(List<Integer> list){
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}
