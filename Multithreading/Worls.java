package Multithreading;

public class Worls extends Thread{
    @Override
    public void run() {
        for ( ; ; ){
            System.out.println("Worls");
            System.out.println(Thread.currentThread().getName());

        }
    }
}
