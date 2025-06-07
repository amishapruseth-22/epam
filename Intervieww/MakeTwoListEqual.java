package Intervieww;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MakeTwoListEqual {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        list1.add(1);
        list1.add(2);
        List<Integer> list2= new ArrayList<>();
        list2.add(2);
        list2.add(3);
        for(int i:list1){
            if(!list2.contains(i)){
                list2.add(i);
            }
        }
        for(int i:list2){
            if(!list1.contains(i))
                list1.add(i);
        }
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1);
        System.out.println(list2);
    }


}
