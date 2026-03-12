package com.java.oop;

public class Order {
    int orderId;
    String customerName;
    long customerPhoneNumber;
    String deliveryAddress;
    int amount;
    String paymentType;

    Order(){
        System.out.println("Order() is called");
    }

    public Order(int orderId, String customerName, long customerPhoneNumber, String deliveryAddress, int amount, String paymentType) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.deliveryAddress = deliveryAddress;
        this.amount = amount;
        this.paymentType = paymentType;
    }
}
