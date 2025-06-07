package Collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

class EvenNumberIterator implements Iterator<Integer> {
    private int current = 0;

    @Override
    public boolean hasNext() {
        return current < 10;
    }

    @Override
    public Integer next() {
        if (!hasNext()) throw new NoSuchElementException();
        int value = current;
        current += 2;
        return value;
    }
}

public class CustomIterator {
    public static void main(String[] args) {
        Iterator<Integer> it = new EvenNumberIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " "); // Output: 0 2 4 6 8
        }
    }
}
