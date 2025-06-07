package Streams.ProductRelated;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CategoryAndAveragePrice {
    public static Map<String,Double> calculateAveragePriceByCategory(List<Product> products){
        return products.stream().collect(Collectors.groupingBy(Product::getCategory,Collectors.averagingDouble(Product::getPrice)));
    }

    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product( "Electronics", 1200.00),
                new Product("Electronics", 800.00),
                new Product("Electronics", 600.00),
                new Product("Clothing", 50.00),
                new Product( "Clothing", 70.00)
        );

        System.out.println(calculateAveragePriceByCategory(products));
    }
}
