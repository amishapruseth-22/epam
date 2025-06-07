package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterator {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("ABC",1);
        map.put("DEF",2);
        map.put("GHI",3);
        Iterator<Map.Entry<String,Integer>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


    }
}
