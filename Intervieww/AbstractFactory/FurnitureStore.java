package Intervieww.AbstractFactory;

public class FurnitureStore {
//    private Chair chair;
//    private Sofa sofa;

    public static void main(String[] args) {
        Factory modernFactory=new ModernFactory();
        modernFactory.createChair();
        modernFactory.createSofa();
        Factory victorianFactory=new VictorianFactory();
        victorianFactory.createSofa();
        victorianFactory.createChair();
    }



}
