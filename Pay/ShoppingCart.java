package Pay;

public class ShoppingCart {
    public void payment(){
        Payment paym=new Upi();
        paym.pay();
        paym=new NetBanking();
        paym.pay();
    }

    public static void main(String[] args) {
        ShoppingCart cart=new ShoppingCart();
        cart.payment();
    }
}
