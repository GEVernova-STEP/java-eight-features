package com.gevernova.javaeightfeatures.problemstatements.productsalesanalysis;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Sale> sales = Arrays.asList(
                new Sale(101, 5, 100.0),
                new Sale(102, 15, 200.0),
                new Sale(103, 20, 150.0),
                new Sale(104, 8, 500.0),
                new Sale(105, 25, 80.0),
                new Sale(106, 30, 300.0),
                new Sale(107, 12, 400.0)
        );

        //Filter
        List<Sale> filteredSales = sales.stream()
                .filter(s -> s.getQuantity() > 10)
                .toList();
        System.out.println("Filtered Sales (quantity > 10): " + filteredSales);

        //Transform
        List<ProductSales> productSalesList = sales.stream()
                .map(s -> new ProductSales(s.getProductId(), s.getQuantity() * s.getPrice()))
                .toList();
        System.out.println("\nTransformed ProductSales: " + productSalesList);

        //Sort
        List<ProductSales> sortedByRevenue = productSalesList.stream()
                .sorted(Comparator.comparing(ProductSales::getTotalRevenue).reversed())
                .toList();
        System.out.println("\nSorted by Total Revenue (Descending): " + sortedByRevenue);

        //Top n
        List<ProductSales> top5Products = productSalesList.stream()
                .sorted(Comparator.comparing(ProductSales::getTotalRevenue).reversed()).limit(5)
                .toList();
        System.out.println("\nTop 5 Products by Revenue: " + top5Products);
    }
}
