package Inheritance;

class Human{
    public Human(){
        System.out.println("Parent class");

    }
    public Human(String r){
        System.out.println("Argument"+r);
    }
    public String printMessage(){
        return "AVW";
    }
    }


 class Worker extends Human {
    public Worker(){
        super("ABC");
        System.out.println(super.printMessage());
        System.out.println("Child class");
    }
}
public class Main{
    public static void main(String[] args) {
        Worker obj=new Worker();

    }
}
