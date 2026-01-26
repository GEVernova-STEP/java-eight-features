package com.gevernova.javaeightfeatures.problemstatements.productsalesanalysis;

public class ProductSales {
    private int productId;
    private double totalRevenue;

    public ProductSales(int productId, double totalRevenue) {
        this.productId = productId;
        this.totalRevenue = totalRevenue;
    }

    public int getProductId() {
        return productId;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    @Override
    public String toString() {
        return "\nProductSales{" +
                "productId=" + productId +
                ", totalRevenue=" + totalRevenue +
                '}';
    }
}
