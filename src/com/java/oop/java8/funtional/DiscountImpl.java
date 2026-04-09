package com.java.oop.java8.funtional;

import com.java.oop.java8.anonymous.Discount;

import java.util.Scanner;


public class DiscountImpl {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        double amount = scanner.nextDouble();

        if (amount > 1000) {
            Discount percentage = (price) -> price - (price * 0.10);
            System.out.println(percentage.applyDiscount(amount));
        } else {
            Discount flat = (price) -> price - 100;

            System.out.println(flat.applyDiscount(amount));
        }


    }
}