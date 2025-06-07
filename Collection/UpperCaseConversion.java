package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperCaseConversion {
    public static List<String> getUpperCaseLetters(List<String> list){
        return list.stream().map(String::toUpperCase).toList();
    }

    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("apple","banana","grapes"));
        System.out.println(getUpperCaseLetters(list));
    }
}
