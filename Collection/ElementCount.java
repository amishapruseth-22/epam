package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementCount {
    public static long elementsGreaterThanGivenValue(List<Integer> list,int value){
        return list.stream().filter(elem->elem>value).count();
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(6,3,8,9,12,4));
        int value=5;
        System.out.println(elementsGreaterThanGivenValue(list,value));
    }
}
