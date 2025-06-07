package Exception;

public class NestedTryExample {
    public static void main(String[] args) {
        try {
            try {
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: " + e);
            }
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: " + e);
        }
    }
}

