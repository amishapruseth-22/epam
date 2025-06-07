package interview;

import java.util.Collections;
import java.util.List;

public class Single {
    private  List<Integer> numbers;
    private  String word;
    private int count;
    private static volatile Single instance;

    public Single(List<Integer> numbers, String word, int count) {
        this.numbers = numbers;
        this.word = word;
        this.count = count;
    }

    public static Single getInstance(List<Integer> numbers, String word, int count) {
        if(instance==null){
            synchronized (Single.class){
                if (instance==null){
                    instance=new Single(numbers,word,count);
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Single single1 = Single.getInstance(List.of(2, 4, 6), "Even", 3);
        System.out.println("Numbers: " + single1.numbers);
        System.out.println("Word: " + single1.word);
        System.out.println("Count: " + single1.count);
        System.out.println(single1);
        Single single2 = Single.getInstance(List.of(1,2,3), "Odd", 3);
        System.out.println("Numbers: " + single2.numbers);
        System.out.println("Word: " + single2.word);
        System.out.println("Count: " + single2.count);
        System.out.println(single2);
        System.out.println(single1==single2);

    }

}
