package Collection;

import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String s="[({)}]";
        System.out.println(balancedPAranthesis(s));

    }
    public static boolean balancedPAranthesis(String s){
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);
            else {
                if (stack.isEmpty())
                    return false;
                if ((c == ')' && stack.pop() != '(') || (c == '}' && stack.pop() != '{')
                            || (c == ']' && stack.pop() != '['))
                        return false;
                }
            }

        return stack.isEmpty();
    }
}
