package Streams.Customer;

public class Order {
    private int id;
    private String customer;
    private  double amount;

    public Order(int id, String customer, double salary) {
        this.id = id;
        this.customer = customer;
        this.amount = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double salary) {
        this.amount = salary;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer='" + customer + '\'' +
                ", amount=" + amount +
                '}';
    }
}
