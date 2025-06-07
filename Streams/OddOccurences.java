package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddOccurences {
   public static int oddOccurringNumbers(int[] arr){
       int result=0;
       for (int num:arr){
           result^=num;
       }
       return result;
   }

    public static void main(String[] args) {
        int[] numbers= {6,4,2,6,9,4,5,9,5};
        System.out.println(oddOccurringNumbers(numbers));
    }
}
