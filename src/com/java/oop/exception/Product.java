package com.java.oop.exception;

import java.util.Objects;

public class Product {
    private int productId;
    private String Name;
    private int price;
    private int quantity;

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public Product setProductId(int productId) {
        this.productId = productId;
        return this;
    }

    public String getName() {
        return Name;
    }

    public  Product setName(String name) {
        Name = name;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Product setPrice(int price) {
        this.price = price;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(productId);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", Name=" + Name +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
