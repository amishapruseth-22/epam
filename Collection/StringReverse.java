package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StringReverse {
    public static String getReversedWord(String s){
        Stack<Character> stack=new Stack<>();
        StringBuilder reversed=new StringBuilder();
        for(char c:s.toCharArray()) {
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();

    }

    public static void main(String[] args) {
        String s="Apple";
        System.out.println(getReversedWord(s));
    }
}
