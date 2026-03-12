package com.java.oop;

public class Product {
    int productId;
    String productName;
    String productCategory;
    String productColour;
    int price;
    byte discountPercentage;
    byte rating;

    Product(){
        System.out.println("Product() is called");
    }

    public Product(int productId, String productName, String productCategory, String productColour, int price, byte discountPercentage, byte rating) {
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productColour = productColour;
        this.price = price;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
    }
}
