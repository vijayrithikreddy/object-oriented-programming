package com.java.oop;

public class Payment {
    int orderId;
    String paymentType;
    String upi_Id;
    int amount;
    String couponCode;
    byte gst;
    Payment(){
        System.out.println("Payment() is called");
    }

    public Payment(int orderId, String paymentType, String upi_Id, int amount, String couponCode) {
        this.orderId = orderId;
        this.paymentType = paymentType;
        this.upi_Id = upi_Id;
        this.amount = amount;
        this.couponCode = couponCode;
        this.gst = 18;
    }
}
