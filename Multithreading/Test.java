package Multithreading;

public class Test {
    public static void main(String[] args) {
        Worls w = new Worls();
        w.start();
        World world=new World();//NEW
        Thread t1=new Thread(world);
        t1.start();//RUNNABLE
        for (; ; ) {
            System.out.println("Hello");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
