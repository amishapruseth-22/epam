package Pay;

public class Upi implements Payment{

    @Override
    public void pay() {
        System.out.println("PAying through Upi");
    }
}
