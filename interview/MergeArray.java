package interview;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int arr1[]={1,3,2,4};
        int arr2[]={2,4,6,5};
        int k=0;
        int arr3[]=new int[arr1.length + arr2.length];
        for (int i=0;i<arr1.length;i++){
            arr3[k++]=arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
            arr3[k++]=arr2[i];
        }
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
