package Collection;

import java.util.ArrayList;

public class AL {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.ensureCapacity(20);
        list.add(2);
        list.add(7);
        list.add(10);
        for (Integer element:list){
            System.out.println(element);
        }
    }
}
