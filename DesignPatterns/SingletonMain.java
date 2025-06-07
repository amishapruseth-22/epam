package DesignPatterns;

class Cat {
    private static Cat instance;
    private Cat(){}
    public static Cat getInstance(){
        if(instance==null){
            instance=new Cat();
        }
        return instance;
    }
    public void eat(){
        System.out.println("Cat is eating");
    }
}

class Dog {
    public Dog(){}
    public void eat(){
        System.out.println("Dog is eating");
    }
}

public class SingletonMain{
    public static void main(String[] args){
        Cat cat1=Cat.getInstance();
        Cat cat2=Cat.getInstance();
        System.out.println(cat1==cat2);

        Dog dog1=new Dog();
        Dog dog2=new Dog();
        System.out.println(dog1==dog2);
    }
}
