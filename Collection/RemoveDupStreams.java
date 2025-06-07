package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDupStreams {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(4,8,10,4,7,2,9,2));
        System.out.println(getUniqueElemList(list));

    }
    public static List<Integer> getUniqueElemList(List<Integer>list){
        return list.stream().distinct().toList();
    }
}
