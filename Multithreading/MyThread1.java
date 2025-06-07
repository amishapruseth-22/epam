package Multithreading;

public class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is running");
        for (int i=1;i<=5;i++){
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
               throw new RuntimeException(e);
            }
            System.out.println("Count: " + i);
        }
    }

    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        t1.start(); // Start the thread

    }
}
