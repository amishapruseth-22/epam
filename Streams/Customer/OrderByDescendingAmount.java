package Streams.Customer;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OrderByDescendingAmount {
    public static Map<String,List<Order>> orderByDescendingAmount(List<Order> orders) {
        return orders.stream().collect(Collectors.groupingBy(Order::getCustomer,Collectors.collectingAndThen(Collectors.toList(),
                list->list.stream().sorted(Comparator.comparingDouble(Order::getAmount).reversed()).collect(Collectors.toList()))));
    }

    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(1, "Alice", 200),
                new Order(2, "Bob", 150),
                new Order(3, "Alice", 300),
                new Order(4, "Charlie", 100),
                new Order(5, "Bob", 400)
        );
        System.out.println(orderByDescendingAmount(orders));

    }
}
