package com.java.oop.model;

public class Order {
    private int orderId;
    private int customerId;
    private long customerPhoneNo;
    private String deliveryAddress;
    private int amount;
    private String paymentType;

    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public Order setOrderId(int orderId) {
        this.orderId = orderId;
        return this;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Order setCustomerId(int customerId) {
        this.customerId = customerId;
        return this;
    }

    public long getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    public Order setCustomerPhoneNo(long customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
        return this;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public Order setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public Order setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public Order setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", customerPhoneNo=" + customerPhoneNo +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", amount=" + amount +
                ", paymentType='" + paymentType + '\'' +
                '}';
    }
}
