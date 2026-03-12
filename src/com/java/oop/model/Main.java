package com.java.oop.model;

public class Main {
    static void main(String[] args) {
        Order order1 = new Order();
        order1.setOrderId(1)
                .setCustomerId(234)
                .setCustomerPhoneNo(9876543200l)
                .setDeliveryAddress("kompally")
                .setAmount(5600)
                .setPaymentType("UPI");

        System.out.println("Order Id : " + order1.getOrderId());
        System.out.println("Customer Id : " + order1.getCustomerId());
        System.out.println("Customer Mobile Number : " + order1.getCustomerPhoneNo());
        System.out.println("Delivery Address : " + order1.getDeliveryAddress());
        System.out.println("Amount : " + order1.getAmount());
        System.out.println("Payment Type : " + order1.getPaymentType());

        Product product1 = new Product();
        product1.setProductId(1)
                .setProductName("Laptop")
                .setProductColour("black")
                .setPrice(89000)
                .setDiscountPercentage(10f)
                .setRating(5.6f);

        System.out.println("Product id : " + product1.getProductId());
        System.out.println("Product Name : " + product1.getProductName());
        System.out.println("Product Colour : " + product1.getProductColour());
        System.out.println("Product Price : " + product1.getPrice());
        System.out.println("Discount Percentage : " + product1.getDiscountPercentage());
        System.out.println("Rating : " + product1.getRating());

    }
}
