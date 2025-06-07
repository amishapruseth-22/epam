package Streams.Customer;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CustomerWhoPlacedMostOrders {
    public static Optional<Map.Entry<String,Long>> getCustomerWithMaxOrders(List<Order> orders){
        return orders.stream().collect(Collectors.groupingBy(Order::getCustomer, Collectors.counting())
                ).entrySet().stream().max(Comparator.comparing(Map.Entry::getValue));
    }
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(1,"Alice", 550),
                new Order(2,"Bob", 750),
                new Order(3,"Alice", 800),
                new Order(4,"Alice", 400),
                new Order(5,"Bob", 600));


        System.out.println(getCustomerWithMaxOrders(orders));
    }
}
