package Pay;

public class NetBanking implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment by NetBanking");
    }
}
