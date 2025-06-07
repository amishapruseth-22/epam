package Generics;

class GenericType<T> {
    T obj;

    public GenericType(T obj) {
        this.obj = obj;
    }

    public void display() {
        System.out.println(obj.getClass().getName());
        System.out.println(obj);
    }
}

public class Test {
    public static void main(String[] args) {
        GenericType<String> g1 = new GenericType<>("Hello");
        GenericType<Integer> g2 = new GenericType<>(10);
        g1.display();
        g2.display();
    }
}
