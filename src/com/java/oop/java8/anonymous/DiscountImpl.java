package com.java.oop.java8.anonymous;

import java.util.Scanner;


public class DiscountImpl {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        double amount = scanner.nextDouble();

        Discount discount;

        if (amount > 1000) {
            discount = new Discount() {
                public double applyDiscount(double price) {
                    return price - (price * 0.10);
                }
            };
        } else {
            discount = new Discount() {
                public double applyDiscount(double price) {
                    return price - 100;
                }
            };
        }

        double finalAmount = discount.applyDiscount(amount);
        System.out.println("Final Amount: " + finalAmount);
    }
}