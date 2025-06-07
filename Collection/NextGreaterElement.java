package Collection;

import java.util.Stack;

class NextGreaterElement {
    public static int[] nextGreater(int[] nums) {
        int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) stack.pop();
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums={4,5,2,10,8};
        int[] result=nextGreater(nums);
        for (int el:result){
            System.out.print(el +" ");
        }
    }
}
