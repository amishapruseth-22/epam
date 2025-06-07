package Streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class DistinctEvenNumbersInSortedOrder {
    public static int[] evendistinct(int arr[]){
       return Arrays.stream(arr).filter(n->n%2==0).distinct().sorted().toArray();
    }

    public static void main(String[] args) {
        int[] arr={2,5,4,20,4};
        System.out.println(Arrays.toString(evendistinct(arr)));
    }
}
