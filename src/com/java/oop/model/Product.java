package com.java.oop.model;

public class Product {
    private int productId;
    private String productName;
    private String productColour;
    private int price;
    private float discountPercentage;
    private float rating;

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public Product setProductId(int productId) {
        this.productId = productId;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public Product setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public String getProductColour() {
        return productColour;
    }

    public Product setProductColour(String productColour) {
        this.productColour = productColour;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Product setPrice(int price) {
        this.price = price;
        return this;
    }

    public float getDiscountPercentage() {
        return discountPercentage;
    }

    public Product setDiscountPercentage(float discountPercentage) {
        this.discountPercentage = discountPercentage;
        return this;
    }

    public float getRating() {
        return rating;
    }

    public Product setRating(float rating) {
        this.rating = rating;
        return this;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productColour='" + productColour + '\'' +
                ", price=" + price +
                ", discountPercentage=" + discountPercentage +
                ", rating=" + rating +
                '}';
    }
}
